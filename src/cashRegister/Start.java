package cashRegister;

import javafx.application.Application;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;

public class Start extends Application implements calculator.Layout {
	
	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		// Creates and shows the window the calculator will be placed on
		root.getChildren().add(border);
		stage.setScene(scene);
		stage.show();
		
		// Modifies some properties of the TextField show then adds it to the top of the BorderPane border
		show.setFont(Font.font("Verdana", 32));
		show.setPrefHeight(20 * height);
		show.setText("Price: ");
		show.setEditable(false);
		
		// Adds margins and content to the BorderPane border
		border.setCenter(numpad);
		numpad.add(show, 0, 0, 4, 1);
		
		Button execute = new Button();
		
		String pistol = "Pistol";
		String automatic = "Automatic";
		String shotgun = "Shotgun";
		String rifle = "Rifle";
		String knife = "Knife";
		String misc = "Misc";
		double VAT = 1.2;
		
		Gun guns[] = {
				new Gun(pistol, "Desert Eagle", 405, 1650),
				new Gun(pistol, "Five Seven", 120, 510),
				new Gun(pistol, "Glock 18", 350, 1430),
				new Gun(automatic, "M4A1", 970, 3910),
				new Gun(automatic, "MP5", 775, 3130),
				new Gun(automatic, "P90", 570, 2650),
				new Gun(automatic, "SG552", 655, 2650),
				new Gun(automatic, "TMP", 655, 2650),
				new Gun(automatic, "UMP45", 630, 2550),
				new Gun(shotgun, "Double Barreled", 800, 3230),
				new Gun(shotgun, "M3 Super 90", 805, 3250),
				new Gun(rifle, "Scout rifle", 755, 3050),
				new Gun(rifle, "G3SG1", 620, 2510),
				new Gun(knife, "Fisherman's knife", 125, 530),
				new Gun(knife, "Military knife", 200, 830),
				new Gun(misc, "Ammo", 240, 1010)
		};
		
		
		
	}

	/**
	 * Replaces the TextField show with the String input
	 *
	 * @param input
	 */
	public void replaceShow(String input) {
		show.clear();
		show.textProperty().set("Price: " + input);
	}
	
}
