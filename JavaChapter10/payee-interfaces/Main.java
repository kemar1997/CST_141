/**
 * Driver for the Payee class.
 * 
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2013
 */
public class Main
{
    /**
     * Instantiate and test two Payee objects
     */
    public static void main(String[] args)
    {
        // Instantiate the Payee objects
        Payee pay1 = new Payee();
        Payee pay2 = new Payee(45, 15);
        
        // Print the values of the Payee objects
        pay1.printPayee();
        pay2.printPayee();
    }
}
