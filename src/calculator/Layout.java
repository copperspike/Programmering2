package calculator;

import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public interface Layout {

	int width = 6;
	int height = 4;
	TextField show = new TextField();
	HBox root = new HBox();
	Scene scene = new Scene(root, 100 * (width + 1), 100 * (height + 1.5), Color.WHITE);
	BorderPane border = new BorderPane();
	public GridPane numpad = new GridPane();
	
}
