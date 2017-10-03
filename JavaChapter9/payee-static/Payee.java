/**
 * The Payee class calculates payroll for regular and overtime workers.
 * Demonstration of 'static' members.
 * 
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2013
 */
public class Payee
{
    // Instance and static class variables (data fields)
    private double hoursWorked;
    private static double payRate;

    /**
     * Constructor for objects of class Payee
     */
    public Payee(double hours)
    {
        // Initialize hoursWorked variable
        hoursWorked = hours;
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
    public static void setPayRate(double newPayRate)
    {
        payRate = newPayRate;
    }

    /**
     * Accessor method for hoursWorked
     */
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    
    /**
     * Accessor method for payRate
     */
    public static double getPayRate()
    {
        return payRate;
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
        System.out.println("Hours worked:\t" + getHoursWorked() );
        System.out.println("Pay rate:\t" + getPayRate() );
        System.out.println("Gross pay:\t" + getGrossPay() );
    }
}
