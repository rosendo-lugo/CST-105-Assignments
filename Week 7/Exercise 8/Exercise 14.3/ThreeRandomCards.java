//**Rosendo Lugo Jr.

package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class ThreeRandomCards extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			int rando1 = (int)(Math.random() * 53);
			int rando2 =  (int)(Math.random() * 53);
			int rando3 =  (int)(Math.random() * 53);	
			
			Image card1 = new Image("file:///C:\\Users\\Lugo\\eclipse-workspace\\Exercise 14.3\\src\\Deck\\"+rando1+".png");
		    Image card2 = new Image("file:///C:\\\\Users\\\\Lugo\\\\eclipse-workspace\\\\Exercise 14.3\\\\src\\\\Deck\\\\"+rando2+".png");
		    Image card3 = new Image("file:///C:\\\\Users\\\\Lugo\\\\eclipse-workspace\\\\Exercise 14.3\\\\src\\\\Deck\\\\"+rando3+".png");		
		    
			Pane pane = new HBox(5);
			pane.setPadding(new Insets(5,5,5,5));
			ImageView cardone = new ImageView(card1);
			ImageView cardtwo = new ImageView(card2);
			ImageView cardthree = new ImageView(card3);
			
			pane.getChildren().addAll(cardone, cardtwo, cardthree);
			
			primaryStage.setTitle("Three Random Cards");
			Scene scene = new Scene(pane,800,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
