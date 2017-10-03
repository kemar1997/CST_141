
/**
 * Multiplier takes two operands (multiplicand and multiplier), and returns product of operands 
 * 
 * @author Erik & Kemar
 * @version 9/11/2017
 */
public class Multiplier
{
    // instance variables - Operators x and y
    private double x;
    private double y;

    /**
     * Constructor for objects of class Multiplier
     * initializes object x as 0
     * initializes object y as 0
     */
    public Multiplier()
    {
        // x and y both initialized as 0
        x = 0;
        y = 0;
    }

    /**
     * setX: Takes a single parameter (newX), assigns newX as the value of x
     * 
     */
     
    public void setX(double newX)
    {
        x = newX;
        
    }
    /**
     * setY: Takes a single parameter (newY), assigns newY as the value of y
     */
    public void setY(double newY)
    {
        y = newY;
    }
    /**
     * Getter method for returning product of x and y
     */
    public double getProduct()
    {
        return x * y;
    }
    
}
