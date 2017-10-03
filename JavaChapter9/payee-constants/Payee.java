/**
 * The Payee class calculates payroll for regular and overtime workers
 * Demonstration of constants.
 * 
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2013
 */
public class Payee
{
    // Instance variable and constant (data fields)
    private double hoursWorked;
    
    // Example of an constant
    // Constants can never change and they are recognizable because it is defined with an uppercase name.
    private final double PAY_RATE = 10;

    /**
     * Constructor for objects of class Payee
     */
    public Payee(double newHoursWorked)
    {
        // Initialize hoursWorked instance variable
        hoursWorked = newHoursWorked;
    }

    /**
     * Mutator method for hoursWorked
     */
    public void setHoursWorked(double newHoursWorked)
    {
        hoursWorked = newHoursWorked;
        
        // Or PAY_RATE = 10 - Here
    }
    
    /**
     * Accessor method for hoursWorked
     */
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    
    /**
     * Calculates and returns gross pay;
     * if hours worked is greater than 40, calculates overtime pay
     */
    public double getGrossPay()
    {
        double regularPay, overtimePay;

        if (hoursWorked > 40)
        {
            regularPay = 40 * PAY_RATE;
            overtimePay = (hoursWorked - 40) * PAY_RATE * 1.5;
            return regularPay + overtimePay;
        }
        else
        {
            return hoursWorked * PAY_RATE;
        }
    }

    /**
     * Print method for Payee state
     */ 
    public void printPayee()
    {
        System.out.println("Hours worked:\t" + getHoursWorked() );
        System.out.println("Pay rate:\t" + PAY_RATE);
        System.out.println("Gross pay:\t" + getGrossPay() );
    }
}
