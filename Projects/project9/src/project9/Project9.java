package project9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Random;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javax.swing.JOptionPane;

/**
 * A guessing game that picks a number from 1 to 1000
 * and stores that number then the user must guess that
 * number while having a label know if the user is too
 * high or too low from that chosen number and once they
 * get the number correct they have the option to restart
 * the game if they choose to do so.
 *
 * @author Kemar Golding & Erik Zagarello & Peter Kaligeris
 * @version 11/27/17
 */
public class Project9 extends Application {
    
    private TextField guessNumber;
    
    private Label guessResult;
    
    private int guess;
    
    @Override
    public void start(Stage primaryStage) {
        /**
         * Generates and stores a random number between 1 and 1000.
         */
        Random rand = new Random();
        guess = rand.nextInt(1000) + 1;
        
        /**
         * Creating a text field for the user to input their guess.
         */
        guessNumber = new TextField("Guess number here...");
        guessNumber.selectAll();
        
        /**
         * Creating a button that evaluates the guess from the user.
         */
        Button btn1 = new Button();
        btn1.setText("Evaluate Guess");
        btn1.setOnAction((ActionEvent e) -> {
            try {
                int userGuess = Integer.parseInt( guessNumber.getText() );
                if ( userGuess == guess ) {
                    guessResult.setText("Result: Correct");
                } else if (userGuess < guess) {
                    guessResult.setText("Result: Too low");
                } else if (userGuess > guess) {
                    guessResult.setText("Result: Too high");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "You must enter a "
                        + "valid number to continue with the game.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            
        });
        
        /**
         * Creating a second button that restarts the game with a brand new
         * number once their answer is correct.
         */
        Button btn2 = new Button();
        btn2.setText("Restart Game");
        btn2.setOnAction((ActionEvent e) -> {
            int guess1 = rand.nextInt(1000) + 1;
            // make sure the label prints correct before the user can restart
            if ( guessResult.getText().equals("Result: Correct") ) {
                this.guess = guess1;
                guessResult.setText("Restarted");
            } else {
                guessResult.setText("Must guess correctly to restart");
            }
        });
        
        /**
         * Creating a Label that shows if the user was correct or was too high
         * or too low from whatever they guessed
         */
        guessResult = new Label();
        
        /**
         * Creating text for the application
         */
        Text t = new Text(20, 50, "Guessing Game");
        t.setFont( Font.font("Comic Sans MS", FontWeight.BOLD, 24) );
        t.setFill(Color.CORAL);
        
        /**
         * Start of StackPane
         */
        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: darkgrey;");
        StackPane.setMargin(t, new Insets(0, 0, 190, 0));
        StackPane.setMargin(guessResult, new Insets(0, 0, -69, 0));
        StackPane.setMargin(guessNumber, new Insets(8, 8, 130, 8));
        StackPane.setMargin(btn1, new Insets(8, 145, 50, 8));
        StackPane.setMargin(btn2, new Insets(8, 8, 50, 145));
        root.getChildren().addAll(btn1, btn2, guessNumber, guessResult, t);
        /**
         * End of StackPane
         */
        
        // Creation of the scene with a specific width and height
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Guess a number game");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
