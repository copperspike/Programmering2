package calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Start extends Application {

	int width = 4;
	int height = 6;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		Scene scene = new Scene(root, 100 * (width + 1), 100 * (height + 1), Color.WHITE);
		primaryStage.setScene(scene);
		primaryStage.show();

		BorderPane border = new BorderPane();
		root.getChildren().add(border);
		border.setLeft(new Rectangle(50, 0));
		border.setRight(new Rectangle(50, 0));

		GridPane numpad = new GridPane();
		border.setCenter(numpad);

		TextField show = new TextField();
		show.setFont(Font.font("Verdana", 32));

		show.setText("\u221A");
		border.setTop(show);

		String[] numpadKeys = { "+", "-", "\u00f7", "\u00D7", "1", "2", "3", "C", "4", "5", "6"};

		for (int i = 0; i < numpadKeys.length; i++) {
			Button temp = new Button(numpadKeys[i]);
			temp.setFont(Font.font("Verdana", 28));
			temp.setPrefSize(10000, 100);
			
			numpad.add(temp, i % 4, (int) Math.floor(i / 4.0));
		}

	}

}
