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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		knapp1 = new Button("OK");
		knapp1.setOnAction(this);
		width = 300;
		height = 300;
		root = new Group();
		scene = new Scene(root, width, height);
		
		knapp1.setMinSize(width / 6.0, height / 6.0);
		knapp1.setTranslateX(width / 2.0 - width /12.0);
		knapp1.setTranslateY(height / 2.0 - height /12.0);
		
		root.getChildren().add(knapp1);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == knapp1) {
			Rectangle röd = new Rectangle(width, height);
			röd.setFill(Color.RED);
			root.getChildren().add(röd);
		}
	}

}
