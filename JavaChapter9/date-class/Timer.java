import java.util.Date;

/**
 * Demonstration of the Date class.
 * 
 * @author Prof. Carl B. Struck 
 * @version CST141 Fall 2013
 */
public class Timer
{
    // Instance variable stores time that Date object was instantiated
    private Date time = new Date();

    /**
     * Constructor for objects of class Timer - no actions required
     */
    public Timer()
    {
    }

    /**
     * Update Date object and display number of seconds since time was reset.
     */
    public void resetTime()
    {
        // Instantiate a Date object with the new time
        Date newTime = new Date();

        // Print to terminal window the ellapsed seconds 
        // since the last time the timer was reset
        System.out.println("Ellapsed time since last reset: " 
            + (newTime.getTime() - time.getTime() ) / 1000 + " seconds");

        // Set instance variable Date object to the new time
        time.setTime( newTime.getTime() );
    }
}
