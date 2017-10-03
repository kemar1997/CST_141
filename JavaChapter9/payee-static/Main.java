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
        // Initialize the static pay rate
        Payee.setPayRate(12);

        // Instantiate the Payee objects
        Payee pay1 = new Payee(40);
        Payee pay2 = new Payee(45);
        
        // Print the values of the Payee objects
        pay1.printPayee();
        pay2.printPayee();
        
        // Update static pay rate
        Payee.setPayRate(75);
        
        // Print the values of the Payee objects
        pay1.printPayee();
        pay2.printPayee();
    }
}
