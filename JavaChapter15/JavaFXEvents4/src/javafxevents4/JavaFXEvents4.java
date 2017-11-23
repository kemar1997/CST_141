package javafxevents4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
public class JavaFXEvents4 extends Application
{
    private TextField textFieldAge;
    private TextField textFieldResult;
    
    private Button buttonMale;
    private Button buttonFemale;
    private Button buttonNotTelling;

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
        PlatoEventHandler click = new PlatoEventHandler();

        textFieldAge = new TextField("Enter your age here");
        textFieldAge.selectAll();
        border.setTop(textFieldAge);

        buttonMale = ( new Button("Male") );
        buttonMale.setOnAction(click);
        border.setLeft(buttonMale);

        buttonFemale = ( new Button("Female") );
        buttonFemale.setOnAction(click);
        border.setCenter(buttonFemale);

        buttonNotTelling = ( new Button("I'm not telling") );
        buttonNotTelling.setOnAction(click);
        border.setRight(buttonNotTelling);
        
        textFieldResult = new TextField();
        textFieldResult.setEditable(false);
        border.setBottom(textFieldResult);

        Scene scene = new Scene(border);

        primaryStage.setTitle("Plato Formula");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /**
     * Class with an event handler to calculate Plato's formula. 
     */
    public class PlatoEventHandler implements EventHandler<ActionEvent> {
        /**
         * Calculates the ideal age for a spouse using the Plato
         * formula.
         * 
         * @param e the ActionEvent parameter
         */
        @Override
        public void handle(ActionEvent e) {
            int age = Integer.parseInt( textFieldAge.getText() );
            
            if ( e.getSource() == buttonMale ) {
                textFieldResult.setText("Ideal age of wife is " 
                        + (age / 2 + 7) );
            } else if ( e.getSource() == buttonFemale ) {
                textFieldResult.setText("Ideal age of husband is " 
                        + (age * 2 - 14) );
            } else {
                textFieldResult.setText("That was unexpected...");
            }
        }
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
