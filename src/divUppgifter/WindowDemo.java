package divUppgifter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class WindowDemo extends Application implements EventHandler<ActionEvent> {

	double width, height;
	Button[] knappar;
	Scene scene;
	Group root;
	Rectangle bg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		knappar = new Button[3];
		width = 300;
		height = 300;
		bg = new Rectangle(width, height, Color.BLACK);
		root = new Group();
		scene = new Scene(root, width, height);

		for (int i = 0; i < knappar.length; i++) {
			knappar[i] = new Button("OK");
			knappar[i].setOnAction(this);

			knappar[i].setMinSize(width / 6.0, height / 6.0);
			knappar[i].setTranslateX(width / 2.0 - width / 12.0);
			knappar[i].setTranslateY(height / 2.0 - height / 12.0);
		}

		root.getChildren().add(bg);
		root.getChildren().add(knappar[0]);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	@Override
	public void handle(ActionEvent event) {
		root.getChildren().clear();

		if (event.getSource() == knappar[0]) {
			
			bg.setFill(Color.RED);
			root.getChildren().add(bg);
			root.getChildren().add(knappar[1]);
		} else if (event.getSource() == knappar[1]) {
			
			bg.setFill(Color.YELLOW);
			root.getChildren().add(bg);
			root.getChildren().add(knappar[2]);
		} else if (event.getSource() == knappar[2]) {

			bg.setFill(Color.BLACK);
			root.getChildren().add(bg);
			root.getChildren().add(knappar[0]);
		}
	}

}
