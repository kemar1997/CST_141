import java.util.Date;

/**
 * The Payee class uses a payroll example to demonstrate the 'Date' class.
 * 
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2013
 */
public class Payee
{
    // Instance variables
    private double hoursWorked;
    private double payRate;
    private Date date = new Date();

    /**
     * Constructor for objects of class Payee
     */
    public Payee(double newHoursWorked, double newPayRate)
    {
        // Initialixe hoursWorked and payRate instance variables
        hoursWorked = newHoursWorked;
        payRate = newPayRate;
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
        System.out.println("Pay date:\t" + date.toString() );
    }
}











