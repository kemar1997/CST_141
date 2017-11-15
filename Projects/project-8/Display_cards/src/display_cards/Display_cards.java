package display_cards;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import java.util.ArrayList;

/**
 * The program performs a random shuffle which selects three cards 
 * from the whole deck and displays them using an HBox.
 *
 * @author Kemar Golding & Erik Zagarello & Peter Kaligeris
 */
public class Display_cards extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a list of card numbers
        ArrayList<Integer> cards = getCards();
        // Create a HBox pane
        HBox pane =  new HBox(5);
        pane.setPadding(new Insets(5, 5, 5, 5));
        
        // Add nodes to pane
        for (int i = 0; i < 3; i++) {
            pane.getChildren().add(new ImageView(new Image("file:image/card/" + 
                    cards.get(i) + ".png")));
        }
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Displaying Three Cards"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    
    /** Returns a list with numbers 1-52 stored in random order */
    private ArrayList<Integer> getCards() {
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            cards.add(i + 1);
        }
        java.util.Collections.shuffle(cards);
        return cards;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
