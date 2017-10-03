/** AnnualSalaryCheck class definition for employees who are payed based upon 
 *  an annual salary.  The field annualSalary is divided by 52 (weeks in a year) 
 *  to calculate gross pay.
 *
 *  @author Carl B. Struck
 *  @version Copyright (c) 2001
 */
public class AnnualSalaryCheck extends PayrollCheck
{
    private double annualSalary;

    /** No argument constructor sets field annualSalary to default value 
     *  zero (0).  Implicit call to superclass PayrollCheck sets fields 
     *  checkNumber and employeeID to default values zero (0).
     */
    public AnnualSalaryCheck()
    {
        // Implicit call to superclass PayrollCheck constructor.
        this(0, 0, 0.0);
    }

    /** The constructor sets initial value for the annualSalary field.
     *  Explicit call to superclass PayrollCheck sets initial values for 
     *  fields checkNumber and employeeID.
     *  
     *  @param checkNumber Number of payroll check from superclass Payroll
     *  @param employeeID Employee's identification number from superclass Payroll
     *  @param annualSalary Employee's annual salary
     */
    public AnnualSalaryCheck(int checkNumber, int employeeID, 
                             double annualSalary)
    {
        super(checkNumber, employeeID); // Explicit call to superclass PayrollCheck constructor.
        setAnnualSalary(annualSalary);
    }

    /** Sets the value for the annualSalary field which must be between 20,000 
     *  and 250,000.  A value of zero (0) indicates that annualSalary field 
     *  is empty.
     *  
     *  @param annualSalary Employee's annual salary
     */
    public void setAnnualSalary(double annualSalary)
    {
        if ( (annualSalary >= 20000 && annualSalary <= 250000) ||
             (annualSalary == 0) )
        {
            this.annualSalary = annualSalary;
        }
    }

    /** Returns current value of the annualSalary field.
     * 
     *  @return Employee's annual salary
     */
    public double getAnnualSalary()
    {
        return annualSalary;
    }

     /** Calculates and returns weekly gross pay which is the result of 
      *  dividing annual salary by 52 (weeks in a year).
      *  
     *   @return Employee's weekly gross pay
     */
    public double getGrossPay()
    {
        if ( getEmployeeID() >= 9000 )
        {
            return getAnnualSalary() / 52 * 1.25; // 25% bonus
        }
        else
        {
            return getAnnualSalary() / 52;
        }
    }

    /** Returns formatted annualSalary field and calculated gross pay including 
     *  text labels.  Preceded by checkNumber and employeeID fields from call 
     *  to toString() method of superclass PayrollCheck.
     *  
     *  @return Formatted annual salary and gross pay for an annual salary 
     *          check as type String
     */
    @Override
    public String toString()
    {
        return super.toString()
            + "\nAnnual salary: \t" + dollarsCents.format( getAnnualSalary() )
            + "\nGross pay: \t" + dollarsCents.format( getGrossPay() );
    }
}






