/** HourlySalaryCheck class definition for employees who are payed an hourly 
 *  rate.  The field hoursWorked is multiplied by payRate to calculate gross 
 *  pay.
 *
 *  @author Carl B. Struck
 *  @version Copyright (c) 2001
 */

public class HourlySalaryCheck extends PayrollCheck
{
    private double hoursWorked;
    private double payRate;

    /** No argument constructor sets fields hoursWorked and payRate to default 
     *  values zero (0).  Implicit call to superclass PayrollCheck sets fields 
     *  employeeID and checkNumber to default values zero (0).
     */
    public HourlySalaryCheck()
    {
		// implicit call to superclass PayrollCheck constructor.
        this(0, 0, 0.0, 0.0);
    }

    /** The constructor sets initial values for fields hoursWorked and payRate.
     *  Explicit call to superclass PayrollCheck sets initial values for fields 
     *  employeeID and checkNumber.
     *  
     *  @param checkNumber Number of payroll check from superclass Payroll
     *  @param employeeID Employee's identification number from superclass Payroll
     *  @param hoursWorked Number of hours worked for the week
     *  @param payRate Employee's hourly pay rate
     */
    public HourlySalaryCheck(int checkNumber, int employeeID, double hoursWorked, double payRate)
    {
        super(checkNumber, employeeID); // Explicit call to superclass PayrollCheck constructor.
        setHoursWorked(hoursWorked);
        setPayRate(payRate);
    }

    /** Sets the value for the hoursWorked field which must be between 
     *  0.25 and 168.0.  A value of zero (0) indicates that hoursWorked 
     *  field is empty.
     *  
     *  @param hoursWorked Number of hours worked for the week
     */
    public void setHoursWorked(double hoursWorked)
    {
        if ( (hoursWorked >= 0.25 && hoursWorked <= 168.0) ||
             (hoursWorked == 0) )
        {
            this.hoursWorked = hoursWorked;
        }
    }

    /** Sets the value for the payRate field which must be between 7.25 and 
     *  75.00.  A value of zero (0) indicates that payRate field is empty.
     *  
     *  @param payRate Employee's hourly pay rate
     */
    public void setPayRate(double payRate)
    {
        if ( (payRate >= 7.25 && payRate <= 75.00) ||
             (payRate == 0) )
        {
            this.payRate = payRate;
        }
    }

    /** Returns current value of the hoursWorked field.
     * 
     *  @return Number of hours worked for the week
     */
    public double getHoursWorked()
    {
        return hoursWorked;
    }

    /** Returns current value of the payRate field.
     * 
     *  @return Employee's hourly pay rate
     */
    public double getPayRate()
    {
        return payRate;
    }

    /** Calculates and returns weekly gross pay.
     *  For employees who work 40 hours or less, field hoursWorked is 
     *  multiplied by payRate to calculate gross pay; for employees who 
     *  work more than 40 hours, gross pay calculated with time and a half 
     *  for overtime.
     *  
     *  @return Employee's weekly gross pay
     */
    public double getGrossPay()
    {
        if (getHoursWorked() > 40)
        {
            return getPayRate() * 40 + (getHoursWorked() - 40) * getPayRate() * 1.5;
        }
        else
        {
            return getPayRate() * getHoursWorked();
        }
    }

    /** Returns formatted hoursWorked and payRate fields, and calculated gross 
     *  pay including text labels.  Preceded by checkNumber and employeeID 
     *  fields from call to toString() method of superclass PayrollCheck.
     *  
     *  @return Formatted hours worked, pay rate and gross pay for an hourly 
     *          salary check as type String
     */
    @Override
    public String toString()
    {
        return super.toString()
            + "\nHours worked: " + twoDecimals.format( getHoursWorked() )
            + "\nPay rate: " + dollarsCents.format( getPayRate() )
            + "\nGross pay: " + dollarsCents.format( getGrossPay() );
    }
}
