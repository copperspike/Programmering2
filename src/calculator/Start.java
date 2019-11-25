package calculator;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Start extends Application implements Layout {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Creates and shows the window the calculator will be placed on
		root.getChildren().add(border);
		primaryStage.setScene(scene);
		primaryStage.show();

		// Modifies some properties of the TextField show then adds it to the top of the BorderPane border
		show.setFont(Font.font("Verdana", 32));
		show.setPrefHeight(20 * height);
		show.setText("");

		// Adds margins and content to the BorderPane border
		border.setTop(show);
		border.setLeft(new Rectangle(50, 0));
		border.setRight(new Rectangle(50, 0));
		border.setBottom(new Rectangle(0, 50));
		border.setCenter(numpad);

		// Declares a String array for the buttons on the grid
		String[] numpadKeys = { "\u221A", "\u00B2", "(", ")", "+", "-", "\u00D7", "\u00f7", "1", "2", "3", "mod", "4",
				"5", "6", "abs", "7", "8", "9", "C", ".", "0", "=" };

		// Defines, places, and sets the action for all buttons, then adds them to the grid
		for (int i = 0; i < numpadKeys.length; i++) {

			// Using a local variable makes the usage of updateInput() a lot easier
			String key = new String(numpadKeys[i]);

			// placeSet & actionSet are made so that buttons with unusual placement or
			// actions aren't redefined at the end of the for loop
			boolean placeSet = false;
			boolean actionSet = false;

			// Defines the button that will be added to the grid
			Button temp = new Button(key);
			temp.setFont(Font.font("Verdana", 28));
			temp.setPrefSize(200, 150);

			// Defines the placement and/or action for buttons with unusual ones
			if (key.equals("0")) {
				temp.setPrefWidth(400);
				numpad.add(temp, i % 4, (int) Math.floor(i / 4.0), 2, 1);
				placeSet = true;
			} else

			if (key.equals("\u00D7")) {
				temp.setOnAction(event -> {
					updateShow("*");
				});
				actionSet = true;
			} else

			if (key.equals("\u00f7")) {
				temp.setOnAction(event -> {
					updateShow("/");
				});
				actionSet = true;
			} else

			if (key.equals("mod")) {
				temp.setOnAction(event -> {
					updateShow("%");
				});
				actionSet = true;
			} else

			if (key.equals("abs")) {
				temp.setOnAction(event -> {
					updateShow("|");
				});
				actionSet = true;
			} else

			if (key.equals("C")) {
				temp.setOnAction(event -> {
					show.clear();
				});
				actionSet = true;
			} else

			if (key.equals("=")) {
				
				numpad.add(temp, i % 4 + 1, (int) Math.floor(i / 4.0));
				placeSet = true;
				
				temp.setOnAction(event -> {
					String input = show.getText();
					String output = AlgebraicProcessing.Equate(input);
					
					replaceShow(output);
				});
				actionSet = true;
				
			}

			// Defines the standard placement and action for buttons
			if (!actionSet) {
				temp.setOnAction(event -> {
					updateShow(key);
				});
			}
			if (!placeSet) {
				numpad.add(temp, i % 4, (int) Math.floor(i / 4.0));
			}

		}

	}

	/**
	 * Appends the String input to the TextField show
	 * 
	 * @param input
	 */
	public void updateShow(String input) {
		show.textProperty().set(show.textProperty().get() + input);
	}
	
	/**
	 * Replaces the TextField show with the String input
	 * 
	 * @param input
	 */
	public void replaceShow(String input) {
		show.clear();
		updateShow(input);
	}

}
