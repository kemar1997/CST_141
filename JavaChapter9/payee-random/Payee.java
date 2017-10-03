import java.util.Random;

/**
 * The Payee class uses a payroll example to demonstrate the 'Random' class.
 * 
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2013
 */
public class Payee
{
    // Instance variables (data fields)
    private double hoursWorked;
    private double payRate;

    // Random number generator object
    private Random randomizer = new Random();

    /**
     * Constructor for objects of class Payee
     */
    public Payee()
    {
        // Initialize random hours worked between 0.25 and 60.0
        hoursWorked = (double) ( randomizer.nextInt(240) + 1 ) / 4;

        // Initialize random pay rate between $7.25 and $75.00
        payRate = (double) ( randomizer.nextInt(6776) + 725 ) / 100;
    }

    /**
     * Mutator method for hoursWorked
     */
    public void setHoursWorked(double newHoursWorked)
    {
        hoursWorked = newHoursWorked;
    }

    /**
     * Mutator method for payRate
     */
    public void setPayRate(double newPayRate)
    {
        payRate = newPayRate;
    }

    /**
     * Calculates and returns gross pay.
     * If hours worked is greater than 40, calculates overtime pay.
     */
    public double getGrossPay()
    {
        double regularPay, overtimePay;

        if (hoursWorked > 40)
        {
            regularPay = 40 * payRate;
            overtimePay = (hoursWorked - 40) * payRate * 1.5;
            return regularPay + overtimePay;
        }
        else
        {
            return hoursWorked * payRate;
        }
    }

    /**
     * Print method for Payee state
     */
    public void printPayee()
    {
        System.out.println("Hours worked:\t" + hoursWorked);
        System.out.println("Pay rate:\t" + payRate);
        System.out.println("Gross pay:\t" + getGrossPay() );
    }
}
