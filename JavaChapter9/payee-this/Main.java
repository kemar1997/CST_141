/**
 * Driver for the Payee class to demonstate passing object so methods.
 * 
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2013
 */
public class Main
{
    /**
     * Instantiate a Payee object and demonstrate passing objects to methods.
     */
    public static void main(String[] args)
    {
        // Instantiate a Payee object
        Payee pay1 = new Payee(40, 10);

        // Call method to print heading lines
        printHeadingLines();

        // Iterate through and print values for a range of hoursWorked values
        for (int index = 35; index <= 45; index++)
        {
            printPayeeTable(pay1, index);
        }

        // Show final value for grossPay
        System.out.println("\nLast value of gross pay is " 
            + pay1.getGrossPay() );
    }

    /**
     * Print the heading lines.
     */
    public static void printHeadingLines()
    {
        System.out.println("Hours\tPay\tGross");
        System.out.println("Worked\tRate\tPay");
        System.out.println("======\t====\t=====");

    }

    /**
     * Update hoursWorked and print payee values.
     */
    public static void printPayeeTable(Payee p, int hoursWorked)
    {
        p.setHoursWorked(hoursWorked);
        System.out.println( p.getHoursWorked() 
            + "\t" + p.getPayRate() + "\t" + p.getGrossPay() );
    }
}
