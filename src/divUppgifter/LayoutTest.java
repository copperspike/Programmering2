package divUppgifter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LayoutTest extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane root = new BorderPane();

		Rectangle top = new Rectangle(0, 200);
		Label left = new Label("Left");
		Label center = new Label("Center");
		Label right = new Label("Right");
		HBox bottom = new HBox();

		Button exitButton = new Button("Exit");

		Button restartButton = new Button("Restart");

		Button homeButton = new Button("Home");

		Scene scene = new Scene(root, 500, 500);

		primaryStage.setScene(scene);
		primaryStage.show();

		root.setTop(top);
		root.setLeft(left);
		root.setCenter(center);
		root.setRight(right);
		root.setBottom(bottom);

		bottom.getChildren().add(exitButton);
		bottom.getChildren().add(restartButton);
		bottom.getChildren().add(homeButton);

		exitButton.setOnAction(event -> {
			primaryStage.close();
		});

		restartButton.setOnAction(event -> {

		});

		homeButton.setOnAction(event -> {

		});

	}

	public static void main(String[] args) {
		launch();
	}
}
