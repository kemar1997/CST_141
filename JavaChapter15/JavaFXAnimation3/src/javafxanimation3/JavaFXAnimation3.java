package javafxanimation3;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * The "Flag Rising" JavaFX animation.
 *
 * @author Prof. Carl B. Struck
 * @version Copyright (c) SCCC Spring 2016 - SCCC West 
 */
public class JavaFXAnimation3 extends Application
{
    /**
     * Instantiates JavaFX Line and ImageView objects and places them on 
     * a PathTransition object in which the "US flag" image object follows 
     * the line object.  The flag rises five times.
     * 
     * @param primaryStage a Stage window object
     */    
    @Override
    public void start(Stage primaryStage)
    {
        Pane pane = new Pane();

        ImageView imageView = new ImageView("images/us.png");
        pane.getChildren().add(imageView);

        PathTransition path = new PathTransition();
        path.setDuration( Duration.millis(1000) );
        path.setPath( new Line(150, 450, 150, -50) );
        path.setNode(imageView);
        path.setCycleCount(90);
        path.play();

        Scene scene = new Scene(pane, 300, 400);
        primaryStage.setTitle("Flag Rising Animation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
