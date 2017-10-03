/**
 * Driver for the Payee class to demonstrate arrays of objects.
 * 
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2013
 */
public class Main
{
    /**
     * Instantiate and test an array of five Payee objects
     */
    public static void main(String[] args)
    {
        Payee[] pay = new Payee[5];
        
        // Instantiate the Payee objects
        pay[0] = new Payee(40, 10);
        pay[1] = new Payee(45, 15);
        pay[2] = new Payee(37.5, 12);
        pay[3] = new Payee(30, 20);
        pay[4] = new Payee(41, 10);
        
        // Iterate through and print the values of the Payee objects
        for (int index = 0; index < pay.length; index++)
        {
            pay[index].printPayee();
            System.out.println("----------------------");
        }
    }
}
