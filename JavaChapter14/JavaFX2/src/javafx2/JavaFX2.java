package javafx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Places a Button control into a StackPane.
 *
 * @author Prof. Carl B. Struck
 * @version Copyright (c) SCCC Fall 2014 - SCCC West 
 */
public class JavaFX2 extends Application
{
    /**
     * Instantiates a StackPane object with a Button.  Places the StackPane 
     * into a Scene object, the Scene onto the Stage window and displays it.
     * 
     * @param primaryStage a Stage window object
     */    
    @Override
    public void start(Stage primaryStage) 
    {
        /** Expands to fill the scene */
        StackPane stack = new StackPane();
        
        /** Doesn't allow the button to expand to fill the whole scene */
        stack.getChildren().addAll( new Button("OK my friend"), new Button("OK") );

        Scene scene = new Scene(stack, 300, 250);

        primaryStage.setTitle("Button in a StackPane");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the String[] array command line parameter
     */
    public static void main(String[] args) 
    {
        launch(args);
    }
}
