package javafx4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Create a calculator for the Plato formula in a BorderPane.
 * 
 * @author Prof. Carl B. Struck
 * @version Copyright (c) SCCC Fall 2014 - SCCC West 
 */
public class JavaFX4 extends Application
{
    /**
     * Create the Plato formula calculator with TextField and Button controls 
     * in a BorderPane layout.  Place the BorderPane into the Scene and the 
     * Scene into the Stage window.
     * 
     * @param primaryStage a Stage window object
     */
    @Override
    public void start(Stage primaryStage)
    {
        BorderPane border = new BorderPane();

        border.setTop( new TextField("Enter your age here") );
        border.setLeft( new Button("Male") );
        border.setCenter( new Button("Female") );
        border.setRight( new Button("I'm not telling") );
        border.setBottom( new TextField() );

        Scene scene = new Scene(border);

        primaryStage.setTitle("Plato w/BorderLayout");
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
    public static void main(String[] args) {
        launch(args);
    }
}
