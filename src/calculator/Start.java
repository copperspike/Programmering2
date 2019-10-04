package calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Start extends Application {

	int width = 5;
	int height = 6;
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane grid = new GridPane();
		Scene scene = new Scene(grid, 100 * (width + 1), 100 * (height + 1), Color.WHITE);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		grid.setVgap(10);
		grid.setHgap(10);
		
		Text show = new Text();
		show.setFill(Color.GREY);
		show.setText("()");
		
		grid.add(show, 0, 0, width, 1);
		
		Button[] buttons = new Button[width * (height - 1)];
		
		Button one = new Button();
		buttons[0] = one;
		
		grid.add(buttons[0], 0, 1);
		
		
	}

}
