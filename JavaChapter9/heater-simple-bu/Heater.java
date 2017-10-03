/**
 * The simple Heater class raises and lowers temperature
 * by a fixed amount of 5 degrees.
 * 
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2010
 */
public class Heater
{
    // Instance variable
    private int temperature;

    /**
     * Constructor for Heater class initializes temperature field.
     */
    public Heater()
    {
        temperature = 15;
    }
    
    /**
     * Mutator method that increases temperature by 5 degrees.
     */
    public void warmer()
    {
        temperature += 5;
    }

    /**
     * Mutator method that decreases temperature by 5 degrees.
     */
    public void cooler()
    {
        temperature -= 5;
    }

    /**
     * Accessor method that returns current value of temperature field.
     */
    public int getTemperature()
    {
        return temperature;
    }
}
