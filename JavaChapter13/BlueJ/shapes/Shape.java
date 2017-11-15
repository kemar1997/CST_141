/**
 * The Shape abstract class definition.
 * All classes that extend from Shape must implement abstract method draw().
 *
 * @author Prof. Carl B. Struck
 * @version Copyright (c) 2008 -- SCCC West
 */
public abstract class Shape extends Object
{
    // The point where the shape draws.
    private int point;

    /**
     * Constructor sets point where the shape draws.
     * 
     * @param point the point where the shape draws
     */
    public Shape(int point)
    {
        setPoint(point);
    }

    /**
     * Sets the point where the shape draws.
     * 
     * @param point the point where the shape draws
     */
    public void setPoint(int point)
    {
        this.point = point;
    }

    /**
     * Returns the point where the shape draws.
     * 
     * @return The point where the shape draws
     */
    public int getPoint()
    {
        return point;
    }

    /**
     * Prints the statistics of a shape to the terminal window.  Calls 
     * this class's method position() to print the position of the shape.
     * Calls a subclass method draw() to print the dimensions of a shape 
     * subclass object to the terminal window (demonstrates 'late binding').
     */
    public void printIt()
	 {
	     position();
	     draw();
	     System.out.println("");
    }

    /**
     * Prints the position of the shape to the terminal window.
     */
    public void position()
	 {
	     System.out.println( "Position at " + getPoint() );
    }

    /**
     * Abstract method definition to print dimension(s) of a shape subclass
     * object to the terminal window.
     */
    public abstract void draw();
}


















