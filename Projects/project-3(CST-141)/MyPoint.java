
/**
 * Create a point from either default value or any input value then
 * get the distance between that point and another point that is made
 * from the distance method.
 *
 * @author Kemar Golding, Erik Zagarello, Peter Kaligeris
 * @version 10/2/2017
 */

public class MyPoint
{
    // instance variables - initial x and y coordinates
    private double x;
    private double y;

    /**
     * No-arg constructor that creats a point at the default value of (0,0)
     */
    public MyPoint()
    {
        this(0, 0);
    }
    
    /**
     * Constructs a point with specified coordinates
     * 
     * @param double x
     * @param double y
     */
    
    public MyPoint(double x, double y)
    {
        setXCoord(x);
        setYCoord(y);
    }
    
    /**
     * Mutator method that updates the x instance variable
     * 
     * @param double x
     */
    
    public void setXCoord(double x)
    {
        this.x = x;
    }
    
    /**
     * Mutator method that updates the x instance variable
     * 
     * @param double y
     */
    
    public void setYCoord(double y)
    {
        this.y = y;
    }
    
    /**
     * Accessor method that retrieves the x instance variable
     * 
     * @return double Returns the x instance variable as a double
     */
    
    public double getXCoord()
    {
        return x;
    }
    
    /**
     * Accessor method that retrieves the y instance variable
     * 
     * @return double Returns the y instance variable as a double
     */
    
    public double getYCoord()
    {
        return y;
    }
    
    /**
     * Returns the distance from this point to another point with specified x-
     * and y-coordinates
     * 
     * @return double Returning a value representing the distance between two points
     */
    
    public double distance(double x, double y)
    {
        return Math.sqrt(Math.pow(x - this.x, 2) + 
             Math.pow(y - this.y, 2));
    }
    
    /**
     * Returns the distance from this point to a specified point of the MyPoint
     * type.
     * 
     * @return double The value of the distance from the given points
     */
    
    public double distance(MyPoint myPoint) {
        return myPoint.distance(this.x, this.y);
    }
    
    /**
     * Returns a String representation of the class
     * 
     * @return String A string holding the x and y values following the required format.
     */
    
    public String toString()
    {
        return "MyPoint coordinates: x = " + getXCoord() + "; y = " + getYCoord(); 
    }

    
}
