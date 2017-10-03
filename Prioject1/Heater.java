
/**
 * The simple Heater class raises and lowers temperatures by a fixed amount of 
 * 5 degrees.
 * 
 * @author Kemar Golding 
 * @version Fall 2017
 */
public class Heater
{
    // place instance variables here
    private int temp;

    /**
     * Constructor for Heater class initializes temp field.
     */
    public Heater()
    {
        temp = 15;
    }

    /**
     * Mutator method that increases the temperature by 5 degrees.
     */
    public void warmer()
    {
        temp += 5;
    }
    
    /**
     * Mutator method that decreases the temperature by 5 degrees.
     */
    public void cooler()
    {
        temp -= 5;
    }
    
    /**
     * Accessor method that returns the value of temp field
     */
    
    public int getTemp()
    {
        return temp;
    }
}
