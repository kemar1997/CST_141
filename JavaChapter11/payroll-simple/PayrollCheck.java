import java.text.DecimalFormat;

/** PayrollCheck class definition maintains and returns check number 
 *  and employee ID number.
 *
 *  @author Carl B. Struck
 *  @version Copyright (c) 2001
 */
public class PayrollCheck
{
    private int employeeID;
    private int checkNumber;
    
    protected 	DecimalFormat twoDecimals = new DecimalFormat("#,##0.00");
	protected DecimalFormat dollarsCents = new DecimalFormat("$#,##0.00");

    /** No argument constructor sets fields checkNumber and employeeID to 
     *  default values zero (0).
     */
    public PayrollCheck()
    {
        this(0, 0);
    }

    /** The constructor sets initial values for the checkNumber and 
     *  employeeID fields.
     *  
     *  @param checkNumber Number of payroll check.
     *  @param employeeID Employee's identification number.
     */
    public PayrollCheck(int checkNumber, int employeeID)
    {
        setCheckNumber(checkNumber);
        setEmployeeID(employeeID);
    }

    /** Sets the value for the checkNumber field which must be between 1 and 
     *  9999.  A value of zero (0) indicates that checkNumber field is empty.
     *  
     *  @param checkNumber Number of payroll check.
     */
    public void setCheckNumber(int checkNumber)
    {
        if (checkNumber >= 0 && checkNumber <= 9999)
        {
            this.checkNumber = checkNumber;
        }
    }

    /** Sets the value for the employeeID field which must be between 10001 and 
     *  99999.  A value of zero (0) indicates that employeeID field is empty.
     *  
     *  @param employeeID Employee's identification number.
     */
    public void setEmployeeID(int employeeID)
    {
        if ( (employeeID >= 10001 && employeeID <= 99999) ||
             (employeeID == 0) )
        {
            this.employeeID = employeeID;
        }
    }

    /** Returns current value of the checkNumber field.
     * 
     *  @return Number of payroll check.
     */
    public int getCheckNumber()
    {
        return checkNumber;
    }

    /** Returns current value of the employeeID field.
     * 
     *  @return Employee's identification number.
     */
    public int getEmployeeID()
    {
        return employeeID;
    }
}











