/**
 * The modified Heater class raises and lowers temperature
 * by a variable amount; when initialized it limits the
 * temperature to a min(imum) and max(imum) value
 * 
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2010
 */
public class Heater
{
    // Instance variables
    private int temperature;    // Current temperature for Heater object
    private int min;            // Minimum value for temperature field
    private int max;            // Maximum value for temperature field
    private int increment;      // Amount by which temperature increases (gets warmer) or decreases (gets cooler)

    /**
     * Constructor method initializes temperature and increment fields as 
     * constant values; takes two int parameters to initialize the min and max 
     * data fields.
     */
    public Heater(int initMin, int initMax)
    {
        temperature = 15;
        min = initMin;
        max = initMax;
        increment = 5;
    }

    /**
     * Mutator method that increases temperature by 5 degrees.
     * If new temperature value is greater than the max, set temperature 
     * back to max.
     */
    public void warmer()
    {
        temperature += increment;

        if (temperature > max)
        {
            temperature = max;
        }
    }

    /**
     * Mutator method that decreases temperature by 5 degrees.
     * If new temperature value is less than the min, set temperature 
     * back to min.
     */
    public void cooler()
    {
        temperature -= increment;

        if (temperature < min)
        {
            temperature = min;
        }
    }

    /**
     * Mutator method that updates value of increment instance variable.
     * If new increment value is negative or zero, do not update.
     */
    public void setIncrement(int newIncrement)
    {
        if (newIncrement > 0)
        {
            increment = newIncrement;
        }
        else
        {
            System.out.println("Do not enter negative value");
        }
    }

    /**
     * Accessor method that returns current value of temperature 
     * instance variable.
     */
    public int getTemperature()
    {
        return temperature;
    }
}
















