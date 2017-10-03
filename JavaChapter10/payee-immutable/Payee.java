/**
 * The immutable Payee class calculates payroll for regular and overtime workers.
 * 
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2010
 */
public class Payee
{
    // Instance variables
    private double hoursWorked; // Employee number of hours worked
    private double payRate;     // Employee hourly rate of pay

    /**
     * Constructor for objects of class Payee with parameters that initialize
     * the hours worked and pay rate data fields.
     */
    public Payee(double newHours, double newRate)
    {
        // Initialize hoursWorked and payRate instance variables
        hoursWorked = newHours;
        payRate = newRate;
    }

    /**
     * Accessor method for the hours worked data field.
     */
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    
    /**
     * Accessor method for the pay rate data field.
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
            regularPay = 40 * getPayRate();
            overtimePay = (getHoursWorked() - 40) * getPayRate() * 1.5;
            return regularPay + overtimePay;
        }
        else
        {
            return getHoursWorked() * getPayRate();
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
