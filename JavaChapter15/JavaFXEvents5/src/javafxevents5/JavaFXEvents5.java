package javafxevents5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javax.swing.JOptionPane;

/**
 * Demo of the JavaFX Button class and EventHandler interface.
 *
 * @author Prof. Carl B. Struck
 * @version Copyright (c) SCCC Fall 2014 - SCCC West 
 */
public class JavaFXEvents5 extends Application 
{
    /**
     * Instantiates two JavaFX Button controls and a event handlers that 
     * display messages when either Button is clicked.
     * 
     * @param primaryStage a Stage window object
     */
    @Override
    public void start(Stage primaryStage) 
    {
        BorderPane border = new BorderPane();
        StackPane stack = new StackPane();
        HBox box = new HBox(50);
        box.setAlignment(Pos.CENTER);

        stack.getChildren().add( new Label("Click button to open message box") );
        border.setTop(stack);
        
        Button buttonOK = new Button("OK");
        buttonOK.setOnAction( new EventHandler<ActionEvent>() 
        {
            /**
            * Displays an "OK" message in a JOptionPane.showMessageDialog window.
            * 
            * @param e the ActionEvent parameter
            */
            @Override
            public void handle(ActionEvent event) 
            {
                JOptionPane.showMessageDialog(null, "OK button was clicked" );
            }
        } );
        
        Button buttonCancel = new Button("Cancel");
        buttonCancel.setOnAction( new EventHandler<ActionEvent>() 
        {
            /**
            * Displays a "Cancel" message in a JOptionPane.showMessageDialog window.
            * 
            * @param e the ActionEvent parameter
            */
            @Override
            public void handle(ActionEvent event) 
            {
                JOptionPane.showMessageDialog(null, "Cancel button was clicked" );
            }
        } );
        
        box.getChildren().addAll(buttonOK, buttonCancel);
        border.setBottom(box);

        Scene scene = new Scene(border, 300, 50);

        primaryStage.setTitle("Buttons and EventHandler Demo");
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
