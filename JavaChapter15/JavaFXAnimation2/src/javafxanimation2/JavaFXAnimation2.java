package javaFXAnimation2;

import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * Moves a 'Stickman' around the JavaFX window
 *
 * @author struckc
 */
public class JavaFXAnimation2 extends Application
{
    private StickMan stickMan;

    private int x = 150;
    private int y = 150;

    @Override
    public void start(Stage primaryStage)
    {
        Pane pane = new Pane();

        stickMan = new StickMan();

        Scene scene = new Scene(stickMan, 300, 300);

        KeyEventHandler e = new KeyEventHandler();
        scene.setOnKeyPressed(e);

        primaryStage.setTitle("StickMan");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

        stickMan.requestFocus();

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

    public class KeyEventHandler implements EventHandler<KeyEvent>
    {
        /**
         * Validates for DOWN, UP, LEFT and RIGHT keys to move StickMan.
         *
         * @param e the KeyEvent parameter which stores keystroke information
         */
        @Override
        public void handle(KeyEvent e)
        {
            switch ( e.getCode() )
            {
                case DOWN:
                    y += 10;
                    break;
                case UP:
                    y -= 10;
                    break;
                case LEFT:
                    x -= 10;
                    break;
                case RIGHT:
                    x += 10;
                    break;
            }

            stickMan.drawStickMan();
        }
    }

    public final class StickMan extends Pane
    {
        private final Circle head;
        private final Line body;
        private final Line leftArmTop;
        private final Line leftArmBottom;
        private final Line rightArmTop;
        private final Line rightArmBottom;
        private final Line leftLegTop;
        private final Line leftLegBottom;
        private final Line rightLegTop;
        private final Line rightLegBottom;
        private final Rectangle leftShoe;
        private final Rectangle rightShoe;

        public StickMan()
        {
            head = new Circle(20);
            body = new Line();
            leftArmTop = new Line();
            leftArmBottom = new Line();
            rightArmTop = new Line();
            rightArmBottom = new Line();
            leftLegTop = new Line();
            leftLegBottom = new Line();
            rightLegTop = new Line();
            rightLegBottom = new Line();
            leftShoe = new Rectangle();
            rightShoe = new Rectangle();

            drawStickMan();
        }

        public void drawStickMan()
        {
			// Draw the head and body

            head.setStroke(Color.BLACK);
            head.setFill(Color.WHITE);
            head.setCenterX(x);
            head.setCenterY(y - 40);

            body.setStartX(x);
            body.setStartY(y - 20);
            body.setEndX(x);
            body.setEndY(y + 30);

			// Draw the arms

            leftArmTop.setStartX(x);
            leftArmTop.setStartY(y);
            leftArmTop.setEndX(x - 25);
            leftArmTop.setEndY(y + 5);

            leftArmBottom.setStartX(x - 25);
            leftArmBottom.setStartY(y + 5);
            leftArmBottom.setEndX(x - 40);
            leftArmBottom.setEndY(y + 30);

            rightArmTop.setStartX(x);
            rightArmTop.setStartY(y);
            rightArmTop.setEndX(x + 18);
            rightArmTop.setEndY(y + 8);

            rightArmBottom.setStartX(x + 18);
            rightArmBottom.setStartY(y + 8);
            rightArmBottom.setEndX(x + 42);
            rightArmBottom.setEndY(y - 25);

            // Draw the legs

            leftLegTop.setStartX(x);
            leftLegTop.setStartY(y + 30);
            leftLegTop.setEndX(x - 5);
            leftLegTop.setEndY(y + 60);

            leftLegBottom.setStartX(x - 5);
            leftLegBottom.setStartY(y + 60);
            leftLegBottom.setEndX(x - 35);
            leftLegBottom.setEndY(y + 50);

            rightLegTop.setStartX(x);
            rightLegTop.setStartY(y + 30);
            rightLegTop.setEndX(x + 35);
            rightLegTop.setEndY(y + 43);

            rightLegBottom.setStartX(x + 35);
            rightLegBottom.setStartY(y + 43);
            rightLegBottom.setEndX(x + 15);
            rightLegBottom.setEndY(y + 73);

            // Draw the shoes

            leftShoe.setX(x - 42);
            leftShoe.setY(y + 50);
            leftShoe.setWidth(8);
            leftShoe.setHeight(20);

            rightShoe.setX(x + 15);
            rightShoe.setY(y + 73);
            rightShoe.setWidth(20);
            rightShoe.setHeight(8);

            getChildren().addAll(head, body, leftArmTop, leftArmBottom,
                rightArmTop, rightArmBottom, leftLegTop, leftLegBottom,
                rightLegTop, rightLegBottom, leftShoe, rightShoe);
        }
    }
}
