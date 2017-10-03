/**
 * The Payee class calculates payroll for regular and overtime workers.  
 * Updates data fields by calling the setHoursWorked() and setPayRate() methods.
 *
 * @author Carl B. Struck
 * @version CST141 - Fall 2013
 */

// The documentation uses the "javadoc" utility to create documentation that is similar to the Java documentation online
public class Payee
{
    // Instance variables
    private double hoursWorked; // Employee number of hours worked
    private double payRate;     // Employee hourly rate of pay

    /**
     * No parameter constructor for objects of class Payee.  Initializes the
     * hours worked and pay rate data fields to default values of zero (0).
     */
    public Payee()
    {
        this(0, 0);
    }

    /**
     * Constructor for objects of class Payee with parameters that initialize
     * the hours worked and pay rate data fields.
     *
     * @param hoursWorked the employee number of hours worked
     * @param payRate the employee hourly rate of pay
     */
    public Payee(double hoursWorked, double payRate)
    {
        //
        setHoursWorked(hoursWorked);
        setPayRate(payRate);
    }

    /**
     * Mutator method for the hours worked data field.
     * Validates that hours worked is between 0.25 and 60.0.
     *
     * @param hoursWorked the employee number of hours worked
     */
    public void setHoursWorked(double hoursWorked)
    {
        if (hoursWorked >= 0.25 && hoursWorked <= 60.0)
        {
            this.hoursWorked = hoursWorked;
        }
    }

    /**
     * Mutator method for the pay rate data field.
     * Validates that pay rate is between 7.50 and 75.00.
     *
     * @param payRate the employee hourly rate of pay
     */
    public void setPayRate(double payRate)
    {
        if (payRate >= 7.50 && payRate <= 75.00)
        {
            this.payRate = payRate;
        }
    }

    /**
     * Accessor method for the hours worked data field.
     *
     * @return Employee number of hours worked as a double
     */
    public double getHoursWorked()
    {
        return hoursWorked;
    }

    /**
     * Accessor method for the pay rate data field.
     *
     * @return Employee hourly rate of pay as a double
     */
    public double getPayRate()
    {
        return payRate;
    }

    /**
     * Calculates and returns employee gross pay.
     * If hours worked is greater than 40, calculates overtime pay.
     *
     * @return Employee gross pay as a double
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
     * Print method for Payee state.
     */
    public void printPayee()
    {
        System.out.println("Hours worked:\t" + getHoursWorked() );
        System.out.println("Pay rate:\t" + getPayRate() );
        System.out.println("Gross pay:\t" + getGrossPay() );
    }
}
