package javafx3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Create a calculator in a GridPane.
 * 
 * @author Prof. Carl B. Struck
 * @version Copyright (c) SCCC Fall 2014 - SCCC West 
 */
public class JavaFX3 extends Application
{
    /**
     * Instantiate a GridPane and place Label, TextField and Button controls
     * in it to create a calculator.  Place the GridPane in the Stage window.
     * 
     * @param primaryStage a Stage window object
     */
    @Override
    public void start(Stage primaryStage)
    {
        GridPane grid = new GridPane();
        
        grid.add( new Label("  Enter first number:"), 0, 0);
        grid.add( new TextField(), 1, 0);
        grid.add( new Label("  Enter second number:"), 0, 1);
        grid.add( new TextField(), 1, 1);
        
        grid.setHgap(5);
        grid.setVgap(5);

        Button buttonAdd = new Button("+");
        grid.add(buttonAdd, 0, 2);
        GridPane.setHalignment(buttonAdd, HPos.CENTER);

        Button buttonSubtract = new Button("\u2013");
        grid.add(buttonSubtract, 0, 3);
        GridPane.setHalignment(buttonSubtract, HPos.CENTER);

        Button buttonMultiply = new Button("\u00D7");
        grid.add(buttonMultiply, 1, 2);
        GridPane.setHalignment(buttonMultiply, HPos.CENTER);

        Button buttonDivide = new Button("\u00F7");
        grid.add(buttonDivide, 1, 3);
        GridPane.setHalignment(buttonDivide, HPos.CENTER);

        grid.add( new Label("Result:"), 0, 4);
        grid.add( new TextField(), 1, 4);

        Scene scene = new Scene(grid);

        primaryStage.setTitle("Calculator w/GridPane");
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
