package javafx1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Displays a Button control in a Stage window.
 * 
 * @author Prof. Carl B. Struck
 * @version Copyright (c) SCCC Fall 2014 - SCCC West
 */
public class JavaFX1 extends Application
{
    /**
     * Instantiates a Button object, places the Button into the Scene,
     * places the Scene onto the Stage window and displays it.
     * 
     * @param primaryStage a Stage window object
     */
    @Override
    public void start(Stage primaryStage)
    {
        Button buttonOK = new Button();
        buttonOK.setText("OK");
        
        // The scene object
        Scene scene = new Scene(buttonOK, 300, 300);
        
        /** An example of resizing the window */
        primaryStage.setResizable(true);
        /** Format: stageObject.setTitle(titleString); */
        primaryStage.setTitle("JavaFX No. 1");
        /** Format: stageObject.setScene(sceneObject); */
        primaryStage.setScene(scene);
        /** Format: stageObject.show(); */
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
