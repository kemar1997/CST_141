package javafxeventsbackup4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javax.swing.JOptionPane;

/**
 * Create a calculator for the Plato formula in a BorderPane.
 * 
 * @author Prof. Carl B. Struck
 * @version Copyright (c) SCCC Fall 2014 - SCCC West 
 */
public class JavaFXEventsBackup4 extends Application
{
    TextField textFieldAge;
    TextField textFieldResult;
    
    Button buttonMale;
    Button buttonFemale;
    Button buttonNotTelling;

    /**
     * Create the Plato formula calculator with TextField and Button controls 
     * and an EventHandler to calculate the ideal age of one's spouse.
     * 
     * @param primaryStage a Stage window object
     */
    @Override
    public void start(Stage primaryStage)
    {
        BorderPane border = new BorderPane();

        textFieldAge = new TextField("Enter your age here");
        border.setTop(textFieldAge);

        ButtonEventHandler eventHandler = new ButtonEventHandler();

        buttonMale = ( new Button("Male") );
        buttonMale.setOnAction(eventHandler);
        border.setLeft(buttonMale);

        buttonFemale = ( new Button("Female") );
        buttonFemale.setOnAction(eventHandler);
        border.setCenter(buttonFemale);

        buttonNotTelling = ( new Button("I'm not telling") );
        buttonNotTelling.setOnAction(eventHandler);
        border.setRight(buttonNotTelling);
        
        textFieldResult = new TextField();
        border.setBottom(textFieldResult);

        Scene scene = new Scene(border);

        primaryStage.setTitle("Plato Formula");
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
    
    /*
     * The EventHandler for the "Plato Calculator" with Button controls.
     */
    public class ButtonEventHandler implements EventHandler<ActionEvent>
    {
        /**
         * Uses Buttons and TextFields to implement the Plato formula for
         * for calculating the ideal age of one's spouse.  Answer is displayed 
         * in the result TextField.
         * 
         * @param e the ActionEvent parameter
         */
        @Override
        public void handle(ActionEvent e)
        {
            try
            {
                if (e.getSource() == buttonNotTelling)
                {
                    textFieldResult.setText("Well that seems obvious!");
                }
                else
                {
                    int age = Integer.parseInt( textFieldAge.getText() );
            
                    if (e.getSource() == buttonMale)
                    {
                        textFieldResult.setText( Integer.toString(age / 2 + 7) );
                    }
                    else if (e.getSource() == buttonFemale)
                    {
                        textFieldResult.setText( Integer.toString(age * 2 - 14) );
                    }
                }
            }

            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
}
