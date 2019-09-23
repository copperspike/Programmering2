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
	Button knapp1;
	Scene scene;
	Group root;
	Rectangle bg;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		width = 300;
		height = 300;
		knapp1 = new Button("OK");
		knapp1.setOnAction(this);
		bg = new Rectangle(width, height, Color.BLACK);
		root = new Group();
		scene = new Scene(root, width, height);
		
		knapp1.setMinSize(width / 6.0, height / 6.0);
		knapp1.setTranslateX(width / 2.0 - width /12.0);
		knapp1.setTranslateY(height / 2.0 - height /12.0);
		
		root.getChildren().add(bg);
		root.getChildren().add(knapp1);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == knapp1) {
			root.getChildren().clear();
			
			if (!bg.getFill().equals(Color.RED)) {
				bg.setFill(Color.RED);
				root.getChildren().add(bg);
				root.getChildren().add(knapp1);
			} else {
				bg.setFill(Color.BLACK);
				root.getChildren().add(bg);
				root.getChildren().add(knapp1);
			}
		}
	}

}
