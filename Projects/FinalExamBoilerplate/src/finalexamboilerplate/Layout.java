package finalexamboilerplate;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

/**
 *
 * @author Kemar Golding
 */
public class Layout extends BorderPane {
    
    // Needs Two Buttons and TextFields
    // btWriteData needs to be linked to an event handler
    // so that it is capable of taking data input from two
    // TextFields and putting into an output file
    protected Button btWriteData = new Button("Write Data");
    
    // This Button needs to be capable of reading the data from
    // the output file and displaying it
    protected Button btDisplayData = new Button("Display Data");
    
    protected TextField tfOne = new TextField();
    protected TextField tfTwo = new TextField();
    
    private final FlowPane paneForInfo = new FlowPane(5, 5);
    private final HBox paneForButtons = new HBox(5);
    
    public Layout() {
        drawLayout();
    }
    
    private void drawLayout() {
        // Set column size for the text fields
        tfOne.setPrefColumnCount(23);
        tfTwo.setPrefColumnCount(23);
        
        // Place nodes in flow pane
        paneForInfo.setPadding(new Insets(10, 10, 0, 10));
        paneForInfo.getChildren().addAll(new Label("Text Field One"), tfOne,
                new Label("Text Field Two"), tfTwo);
        
        // Place nodes in the hbox
        paneForButtons.getChildren().addAll(btWriteData, btDisplayData);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setPadding(new Insets(10, 0, 10, 0));
        
        // Place nodes in pane
        setCenter(paneForInfo);
        setBottom(paneForButtons);
    }
    
    
}
