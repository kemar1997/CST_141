package javafx5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Create a calculator in a GridPane with the Button controls in a nested HBox.
 * 
 * @author Prof. Carl B. Struck
 * @version Copyright (c) SCCC Fall 2014 - SCCC West 
 */
public class JavaFX5 extends Application 
{
    /**
     * Create a calculator with Label, TextField and Button controls in a
     * GridPane layout.  The Button controls are placed in an HBox which 
     * is nested in a GridPane cell.  Place the GridPane into the Scene 
     * and the Scene into the Stage window.
     * 
     * @param primaryStage a Stage window object
     */
    @Override
    public void start(Stage primaryStage)
    {
        GridPane grid = new GridPane();
        HBox horizontalButtons = new HBox(20);

        grid.setVgap(5);
        grid.setHgap(5);
        
        grid.add( new Label("Enter first number:"), 0, 0);
        grid.add( new TextField(), 1, 0);
        grid.add( new Label("Enter second number:"), 0, 1);
        grid.add( new TextField(), 1, 1);

        horizontalButtons.getChildren().add( new Button("+") );
        horizontalButtons.getChildren().add( new Button("-") );
        //horizontalButtons.getChildren().add( new Button("*") );
        //horizontalButtons.getChildren().add( new Button("/") );
        horizontalButtons.getChildren().add( new Button("\u00D7") );
        horizontalButtons.getChildren().add( new Button("\u00F7") );

        grid.add(horizontalButtons, 1, 2);

        grid.add( new Label("Result:"), 0, 3);
        grid.add( new TextField(), 1, 3);

        Scene scene = new Scene(grid);

        primaryStage.setTitle("Calculator w/HBox and GridPane");
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
