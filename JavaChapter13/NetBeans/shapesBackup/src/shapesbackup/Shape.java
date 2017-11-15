package shapesbackup;

/**
 * The Shape abstract class definition.
 * All classes that extend from Shape must implement abstract method draw().
 *
 * @author Prof. Carl B. Struck
 * @version Copyright (c) 2008 -- SCCC West
 */
public abstract class Shape extends Object
{
    // The x- and y-coordinates where the shape draws.
    private int x;
    private int y;

    /**
     * Constructor sets point where the shape draws.
     * 
     * @param x the x-coordinate where the shape draws
     * @param y the y-coordinate where the shape draws
     */
    public Shape(int x, int y)
    {
        setX(x);
        setY(y);
    }

    /**
     * Sets the x-coordinate where the shape draws.
     * 
     * @param x the x-coordinate where the shape draws
     */
    public void setX(int x)
    {
        this.x = x;
    }

    /**
     * Sets the y-coordinate where the shape draws.
     * 
     * @param y the y-coordinate where the shape draws
     */
    public void setY(int y)
    {
        this.y = y;
    }

    /**
     * Returns the x-coordinate where the shape draws.
     * 
     * @return The x-coordinate where the shape draws
     */
    public int getX()
    {
        return x;
    }

    /**
     * Returns the y-coordinate where the shape draws.
     * 
     * @return The y-coordinate where the shape draws
     */
    public int getY()
    {
        return y;
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
	     System.out.println( "Position at x = " + getX() 
                + ", y = " +getY() );
    }

    /**
     * Abstract method definition to print dimension(s) of a shape subclass
     * object to the terminal window.
     */
    public abstract void draw();
}

