//**Rosendo Lugo Jr.

package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ColorAndFont extends Application {
    public static void main(String[] args) {
        Application.launch(args); }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new HBox(10);  
        pane.setPadding(new Insets(20,10,20,10));    
        Text text1 = new Text("JAVA"); 

        for (int index = 0; index < 5; index++)
        {
            text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
    		text1.setOpacity(Math.random());
            text1.setFill(Color.color(Math.random(), Math.random(), Math.random())); 
			pane.setStyle("-fx-background-color: lightgray;");
            text1.setRotate(90); 
    		text1.setTranslateY(20);
            pane.getChildren().add(text1); 
            text1 = new Text("JAVA");  }


        Scene window = new Scene(pane, 350, 100); 
        primaryStage.setTitle("Exercise 14_04");
        primaryStage.setScene(window);
        primaryStage.show();  
    }
}
