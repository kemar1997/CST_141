package shapesbackup;

/**
 * The Circle class definition.
 * Implements method draw() which is abstract in class Shape.
 * Sets and maintains a radius for the circle.
 *
 * @author Prof. Carl B. Struck
 * @version Copyright (c) 2008 -- SCCC West
 */
public final class Circle extends Shape
{
    // The radius of the circle
    private int radius;

    /**
     * Constructor passes default values to Circle(int, int, int) constructor.
     */
    public Circle()
    {
        this(0, 0, 0);
    }    
    
    /**
     * Constructor sets radius of the circle and passes the point where it
     * will draw to the Shape superclass constructor.
     * 
     * @param x the x-coordinate where the shape draws
     * @param y the y-coordinate where the shape draws
     * @param radius the radius of the circle
     */    
    public Circle(int x, int y, int radius)
    {
        super(x, y);
        setRadius(radius);
    }

    /**
     * Sets the radius of the circle which must be greater than zero (0) 
     * or equal to zero if null (default).
     * 
     * @param radius the radius of the circle
     */
    public void setRadius(int radius)
    {
        if (radius >= 0)
        {
            this.radius = radius;
        }
    }

    /**
     * Returns the radius of the circle.
     * 
     * @return the radius of the circle.
     */
    public int getRadius()
    {
        return radius;
    }

    /**
     * Prints the radius of the circle to the terminal window.
     */
    @Override
    public void draw()
    {
        System.out.println( "Draw circle with radius " + getRadius() );
    }
}
