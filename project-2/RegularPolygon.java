
/**
 * The RegularPolygon class creates an n sided regular polygon which all sides have the same length
 * and all angles have the same degree.
 *
 * @author Kemar Golding & Erik Zagarello
 * @version 9/25/2017
 */
public class RegularPolygon
{
    // instance variables - replace the example below with your own
    private int n;          // defines the number of sides in the polygon
    private double side;    // stores the length of the side
    private double x;       // defines the x-coordinate of the polygon's center
    private double y;       // defines the y-coordinate of the polygon's center

    /**
     * Constructor that creates a regular polygon with default values.
     */
    public RegularPolygon() {
        // initialise instance variables with any default values
        this(3, 1, 0, 0);
    }
    
    /**
     * Constructor that creates a regular polygon with the spcified number of sides
     * and length of side, centered at (0, 0).
     */
    public RegularPolygon(int n, double side) {
        setLength(side);
        setSides(n);
    }
    
    /**
     * Constructor that creates a regular polygon with the specified number of sides,
     * length of side, and x- and y-coordinates.
     */
    public RegularPolygon(int n, double side, double x, double y) {
        setLength(side);
        setSides(n);
        setXCoord(x);
        setYCoord(y);
    }
    
    /**
     * Mutator method that assigns the n variable a new integer. Gives the polygon a new
     * number of sides.
     */
    
    public void setSides(int n) {
        this.n = n;
    }
    
    /**
     * Mutator method that assigns the side variable a new double. Gives the polygon the new
     * length of each side.
     */
    
    public void setLength(double side) {
        this.side = side;
    }
    
    /**
     * Mutator method that assigns the x variable a new double. Gives the polygon a new
     * x-coordinate for its center.
     */
    
    public void setXCoord(double x) {
        this.x = x;
    }
    
    /**
     * Mutator method that assigns the x variable a new double. Gives the polygon a new
     * x-coordinate for its center.
     */
    
    public void setYCoord(double y) {
        this.y = y;
    }
    
    /**
     * Accessor method that returns the number of sides of the polygon.
     */
    
    public int getSides() {
        return n;
    }
    
    /**
     * Accessor method that returns the length of each side of the polygon.
     */
    
    public double getLength() {
        return side;
    }
    
    /**
     * Accessor method that returns the x-coord of the polygon's center.
     */
    
    public double getXCoord() {
        return x;
    }
    
    /**
     * Accessor method that returns the y-coord of the polygon's center.
     */
    
    public double getYCoord() {
        return y;
    }
    
    /**
     * Returns the perimeter of the method
     */
    
    public double getPerimeter() {
        return n * side;
    }
    
    /**
     * Returns the Area of the method
     */
    
    public double getArea() {
        return (n * (side * side)) / (4 * (Math.tan(Math.PI / n)));
    }
    
    /**
     * Print method for RegularPolygon state.
     */
    public void printArea_Perimeter() {
        System.out.println("Area is:\t" + getArea() );
        System.out.println("Perimeter is:\t" + getPerimeter() );
    }
    
}
