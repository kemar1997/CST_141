package javafxanimation1;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Demo of the JavaFX PathTransition class.
 *
 * @author Prof. Carl B. Struck
 * @version Copyright (c) SCCC Spring 2016 - SCCC West 
 */
public class JavaFXAnimation1 extends Application
{
    /**
     * Instantiates JavaFX Rectangle and Circle objects and places them on 
     * a PathTransition object in which the circle object follows the rectangle
     * object.  The circle pauses when clicked by the mouse begins to move
     * again when the mouse button is released.
     * 
     * @param primaryStage a Stage window object
     */
    @Override
    public void start(Stage primaryStage)
    {
        Pane pane = new Pane();

        Rectangle rectangle = new Rectangle(100, 100, 300, 200);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.WHITE);
        pane.getChildren().add(rectangle);

        Circle circle = new Circle(0, 0, 25);
        circle.setFill(Color.AQUAMARINE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);

        // Create a path transition
        PathTransition path = new PathTransition();
        path.setDuration( Duration.millis(5000) );
        path.setPath(rectangle);
        path.setNode(circle);
        path.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        path.setCycleCount(Timeline.INDEFINITE);
        path.setAutoReverse(false);
        path.play();

        // Set object on path to pause when clicked by mouse
        // and to play again when mouse button is released
        circle.setOnMousePressed( e -> path.pause() );
        circle.setOnMouseReleased( e -> path.play() );

        Scene scene = new Scene(pane, 500, 400);
        primaryStage.setTitle("Path Transition Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
