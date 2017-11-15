package javafx7;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

/**
 *
 * @author Prof. Carl B. Struck
 * @version Copyright (c) SCCC Fall 2015 - SCCC West 
 */
public class JavaFX7 extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
        FlowPane flow = new FlowPane();

        Button buttonOK = new Button("OK");
        buttonOK.setFont( 
            Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.ITALIC, 20) );
        flow.getChildren().add(buttonOK);
        
        Circle circle = new Circle();
        circle.setRadius(100);
        circle.setFill(Color.PEACHPUFF);
        flow.getChildren().add(circle);
        
        //Image image = new Image("file:images/javafx.png");
        Image image = new Image("http://www2.sunysuffolk.edu/struckc/CST141/javafx.png");
        flow.getChildren().add( new ImageView(image) );
    
        Scene scene = new Scene(flow, 300, 400);
        
        primaryStage.setTitle("Fonts and Colors");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
