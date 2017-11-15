package javafx6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Polygon;
import javafx.collections.ObservableList;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * Create Text, Circle and Line objects in a Pane layout object.
 * 
 * @author Prof. Carl B. Struck
 * @version Copyright (c) SCCC Fall 2014 - SCCC West 
 */
public class JavaFX6 extends Application 
{
    private Pane pane;
    private Line line;
    private Circle circle;
    private Rectangle rectangle;
    private Ellipse ellipse;
    private Arc arc;
    private Polygon polygon;
    private Text text;

    /**
     * The start() method instantiates a Pane layout object and calls methods 
     * to add javafx graphics objects into it.  The Image and ImageView, Line, 
     * Circle, Rectangle, Ellipse, Arc, Polygon and Text objects are inserted 
     * to the Pane.  Places the Pane into the Scene and the Scene into the 
     * Stage and displays it.
     * 
     * @param primaryStage a Stage window object
     * 
     * @throws IOException if "star.txt" file is not found or fails to open
     */
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        pane = new Pane();

        addLine();
        addCircle();
        addRectangle();
        addEllipse();
        addArc();
        addPolygon();
        addText();

        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setTitle("JavaFX Graphics");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /**
     * Add a diagonal Line object with a 5-pixel width and dark green color
     * to the Pane.  Bind the EndXProperty and EndYProperty of the line to
     * the WidthProperty and HeightProperty of the Pane minus 100 respectively.
     */
    public void addLine()
    {
        line = new Line(20, 50, 0, 0);
        line.endXProperty().bind( pane.widthProperty().subtract(100) );
        line.endYProperty().bind( pane.heightProperty().subtract(100) );
        line.setStrokeWidth(5);
        line.setStroke( Color.color(0, 0.5, 0) );

        pane.getChildren().add(line);
    }
    
    /**
     * Add a Circle with a 100 pixel radius, BLUE stroke color and WHEAT fill 
     * color to the center of the Scene.  Bind the centerX property and 
     * centerY property of the Circle to the center of the Pane.
     */
    public void addCircle()
    {
        circle = new Circle();
        circle.centerXProperty().bind( pane.widthProperty().divide(2) );
        circle.centerYProperty().bind( pane.heightProperty().divide(2) );
        circle.setRadius(100);
        circle.setStroke(Color.BLUE);
        circle.setFill(Color.WHEAT);
        
        pane.getChildren().add(circle);
    }
    
    /**
     * Add a Rectangle object to the Pane rotated 45 degrees.  The arcWidth 
     * property of the corners is set to 15 pixels and the arcHeight property 
     * set to 30 pixels.
     */
    public void addRectangle()
    {
        rectangle = new Rectangle(125, 350, 60, 150);
        rectangle.setArcWidth(15);
        rectangle.setArcHeight(30);
        rectangle.setRotate(45);
        
        pane.getChildren().add(rectangle);
    }
    
    /**
     * Add an Ellipse object to the Pane.
    */
    public void addEllipse()
    {
        ellipse = new Ellipse(400, 400, 75, 50);
        
        pane.getChildren().add(ellipse);
    }
    
    /**
     * Add a 270-degree Arc object to the Pane.  Set the ArcType to ROUND.
     */
    public void addArc()
    {
        arc = new Arc(400, 100, 75, 75, 45, 270);
        arc.setType(ArcType.ROUND);
        
        pane.getChildren().add(arc);
    }
    
    /**
     * Add a Polygon object as a star to the Pane.  The Polygon points come 
     * from an ObservableList object of type Double which are read in from 
     * a Scanner input file.
     * 
     * @throws IOException if "star.txt" file is not found or fails to open
     */
    public void addPolygon() throws IOException
    {
        polygon = new Polygon();
        Scanner inReader = new Scanner( new File("App_Data/star.txt") );
        
        ObservableList<Double> star = polygon.getPoints();
        
        while (inReader.hasNext() )
        {
            star.add( (double) inReader.nextInt() );
            star.add( (double) inReader.nextInt() );
        }
        
        pane.getChildren().add(polygon);
    }
    
    /**
     * Add a Text object graphic that reads "JavaFX" to the Pane.  Set its font 
     * property to Comic Sans MS, bold, and 24 points, and its stroke color to 
     * BLUE.
     */
    public void addText()
    {
        text = new Text(20, 50, "JavaFX");
        text.setFont( Font.font("Comic Sans MS", FontWeight.BOLD, 24) );
        text.setStroke(Color.BLUE);
        
        pane.getChildren().add(text);
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
