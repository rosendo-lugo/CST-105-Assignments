//**Rosendo Lugo Jr.

package application;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class DisplayACheckerboard extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox pane = new VBox();
			
			for (int i = 0; i < 8; i++) {
				HBox row = new HBox();
				for (int j = 0; j < 4; j++) {
				if (i % 2 == 0) {
						row.getChildren().add(new Rectangle(50, 50, Color.BLACK));
						row.getChildren().add(new Rectangle(50, 50, Color.RED));
						
					} else {
						row.getChildren().add(new Rectangle(50, 50, Color.RED));
						row.getChildren().add(new Rectangle(50, 50, Color.BLACK));
					}
				}
				pane.getChildren().add(row);
				pane.setStyle("-fx-border-color: black;");
			}	
			
			Scene scene = new Scene(pane,400,400);
	        primaryStage.setTitle("Checkerboard");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
