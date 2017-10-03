import java.util.Date;

/**
 * Driver for the immutable Payee class.
 * 
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2013
 */
public class Main
{
    /**
     * Instantiate and test an immutable Payee object
     */
    public static void main(String[] args)
    {
        // Instantiate a Payee object
        Payee pay1 = new Payee(40, 10);

        // Print the values of the Payee object
        pay1.printPayee();
    }
}
