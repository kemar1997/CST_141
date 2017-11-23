package javafxevents1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author struckc
 */
public class JavaFXEvents1 extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
        Button button = new Button();
        button.setText("Click the Button");
        
        ButtonEventHandler eventHandler = new ButtonEventHandler();
        button.setOnAction(eventHandler);
        
        Scene scene = new Scene(button, 300, 250);
        
        primaryStage.setTitle("JavaFX Events");
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
    /*
     * The EventHandler for the Button control.
     * The example below is a template except for the class
     * name and whatever is inside the handle method.
     */
    private class ButtonEventHandler implements EventHandler<ActionEvent>
    {
        /**
         * Displays a message in a JOptionPane.showMessageDialog window.
         * 
         * @param e the ActionEvent parameter
         */
        @Override
        public void handle(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, "You clicked the button" );
        }
    } 
}
