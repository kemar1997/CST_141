
/**
 * The RegularPolygon class creates an n sided regular polygon which all sides have the same length
 * and all angles have the same degree.
 *
 * @author Kemar Golding & Erik Zagarello
 * @version 9/25/2017
 */
public class RegularPolygon
{
    private int n;          // defines the number of sides in the polygon
    private double length;    // stores the length of the side
    private double x;       // defines the x-coordinate of the polygon's center
    private double y;       // defines the y-coordinate of the polygon's center

    /**
     * Constructor that creates a regular polygon with default values.
     */
    public RegularPolygon() {
        // Default constructor - requests no values when instantiating object
        this(3, 1, 0, 0);
    }

    /**
     * Constructor that creates a regular polygon with the spcified number of sides
     * and length of side, centered at (0, 0).
     */
    public RegularPolygon(int n, double length) {
        //Second constructor - takes values for lenght of side and number of sides only
        setLength(length);
        setSides(n);
    }

    /**
     * Constructor that creates a regular polygon with the specified number of sides,
     * length of side, and x- and y-coordinates.
     */
    public RegularPolygon(int n, double length, double x, double y) {
        //Third constructor. Takes length, # of sides, and x,y co-ordinates 
        setLength(length);
        setSides(n);
        setXCoord(x);
        setYCoord(y);
    }

    /**
     * Mutator method that assigns the n variable a new integer. Gives the polygon a new
     * number of sides.
     * Includes if statement to ensure number of sides is at least three.
     */

    public void setSides(int n) {
        if (n >=3)
        {
            this.n = n;
        } else 
        {
            this.n = 3;
            System.out.println("Needs at least three sides to form a shape. Value set to 3.");
        }
    }

    /**
     * Mutator method that assigns the side variable a new double. Gives the polygon the new
     * length of each side.
     * Includes if statement to ensure length of each side is at least 1
     */

    public void setLength(double length) {
        if (length >= 1)
        {
            this.length = length;
        } else{
            this.length = 1;
            System.out.println("Length must be greater or equal to 1. Value set to 1.");
        }
    }

    /**
     * Mutator method that assigns the x variable a new double. Gives the polygon a new
     * x-coordinate for its center.
     */
    public void setXCoord(double x) {
        this.x = x;
    }

    /**
     * Mutator method that assigns the y variable a new double. Gives the polygon a new
     * y-coordinate for its center.
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
        return length;
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
        return n * length;
    }

    /**
     * Returns the Area of the method
     */

    public double getArea() {
        return (n * (length * length)) / (4 * (Math.tan(Math.PI / n)));
    }

    /**
     * Print method for RegularPolygon state.
     */
    public void printArea_Perimeter() {
        System.out.println("Area is:\t" + getArea() );
        System.out.println("Perimeter is:\t" + getPerimeter() );
    }

}
