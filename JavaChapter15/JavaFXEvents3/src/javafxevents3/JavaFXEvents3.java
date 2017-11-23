package javafxevents3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javax.swing.JOptionPane;

/**
 * Create a calculator in a GridPane.
 * 
 * @author Prof. Carl B. Struck
 * @version Copyright (c) SCCC Fall 2014 - SCCC West 
 */
public class JavaFXEvents3 extends Application
{
    private TextField textFieldFirst;
    private TextField textFieldSecond;
    private TextField textFieldResult;

    private Button buttonAdd;
    private Button buttonSubtract;
    private Button buttonMultiply;
    private Button buttonDivide;
    /**
     * Instantiate a GridPane and place Label, TextField and Button controls
     * in it to create a calculator.  The EventHandler performs the arithmetic
     * processing and displays the result.
     * 
     * @param primaryStage a Stage window object
     */
    @Override
    public void start(Stage primaryStage)
    {
        GridPane grid = new GridPane();

        grid.add( new Label("Enter first number:"), 0, 0);
        textFieldFirst = new TextField();
        grid.add(textFieldFirst, 1, 0);

        grid.add( new Label("Enter second number: "), 0, 1);
        textFieldSecond = new TextField();
        grid.add(textFieldSecond, 1, 1);
        
        ButtonEventHandler eventHandler = new ButtonEventHandler();
        grid.setVgap(5);

        buttonAdd = new Button("+");
        buttonAdd.setOnAction(eventHandler);
        grid.add(buttonAdd, 0, 2);
        GridPane.setHalignment(buttonAdd, HPos.CENTER);

        buttonSubtract = new Button("-");
        buttonSubtract.setOnAction(eventHandler);
        grid.add(buttonSubtract, 0, 3);
        GridPane.setHalignment(buttonSubtract, HPos.CENTER);

        buttonMultiply = new Button("\u00D7");
        buttonMultiply.setOnAction(eventHandler);
        grid.add(buttonMultiply, 1, 2);
        GridPane.setHalignment(buttonMultiply, HPos.CENTER);

        buttonDivide = new Button("\u00F7");
        buttonDivide.setOnAction(eventHandler);
        grid.add(buttonDivide, 1, 3);
        GridPane.setHalignment(buttonDivide, HPos.CENTER);

        grid.add( new Label("Result:"), 0, 4);
        textFieldResult = new TextField();
        textFieldResult.setEditable(false);
        grid.add(textFieldResult, 1, 4);

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
    
    /*
     * The EventHandler for the "calculator" Button controls.
     */
    public class ButtonEventHandler implements EventHandler<ActionEvent>
    {
        /**
         * Performs either addition or subtraction or multiplication or division
         * depending on which Button was clicked.  Answer is displayed in the 
         * result TextField.
         * 
         * @param e the ActionEvent parameter
         */
        @Override
        public void handle(ActionEvent e)
        {
            try
            {
                double first = Double.parseDouble( textFieldFirst.getText() );
                double second = Double.parseDouble( textFieldSecond.getText() );
            
                if (e.getSource() == buttonAdd)
                {
                    textFieldResult.setText( 
                            String.format("%.2f + %.2f = %.2f", first, second, (first + second) ) );
                }
                else if (e.getSource() == buttonSubtract)
                {
                    textFieldResult.setText( 
                            String.format("%.2f - %.2f = %.2f", first, second, (first - second) ) );
                }
                else if (e.getSource() == buttonMultiply)
                {
                    textFieldResult.setText( 
                            String.format("%.2f \u00D7 %.2f = %.2f", first, second, (first * second) ) );
                }
                else // if (e.getSource() == buttonDivide)
                {
                    textFieldResult.setText( 
                            String.format("%.2f \u00F7 %.2f = %.2f", first, second, (first / second) ) );
                }
            }
            
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
}
