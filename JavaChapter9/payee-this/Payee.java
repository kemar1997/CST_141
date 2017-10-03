/**
 * The Payee class calculates payroll for regular and overtime workers
 * 
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2010
 */
public class Payee
{
    // Instance variables (data fields)
    private double hoursWorked;
    private double payRate;

    /**
     * No parameter constructor for objects of class Payee
     */
    public Payee()
    {
        // Initialize hoursWorked and payRate instance variables to zero (0)
        this(0, 0);
    }

    /**
     * Constructor for objects of class Payee
     */
    public Payee(double hoursWroked, double payRate)
    {
        // Initialize hoursWorked and payRate instance variables
        // "this.hoursWorked" is the instance variable and "hoursWorked" is the param variable
        setHoursWorked(hoursWorked);
        setPayRate(payRate);
    }

    /**
     * Mutator method for hoursWorked.
     * Validate that hoursWorked is between 0.25 and 60.0.
     */
    public void setHoursWorked(double hoursWorked)
    {
        // an example of the keyword "this"
        if (hoursWorked >= 0.25 && hoursWorked <= 60 || hoursWorked == 0) {
            this.hoursWorked = hoursWorked;
        }
    }
    
    /**
     * Mutator method for payRate.
     * Validate that payRate is between 7.50 and 75.00.
     */
    public void setPayRate(double payRate)
    {
        // an example of the keyword "this"
        if (payRate >= 7.50 && payRate <= 75 || payRate == 0.0) {
            this.payRate = payRate;
        }
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
    public double getPayRate()
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
