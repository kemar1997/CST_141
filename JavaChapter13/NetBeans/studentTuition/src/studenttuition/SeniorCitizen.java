package studenttuition;

/** 
 * The SeniorCitizen class definition which manages student tuition field.
 * 
 * @author Carl B. Struck
 * @version  Copyright 2002 (c) SCCC West
 */ 
public final class SeniorCitizen extends Student implements Tuition
{
    /** 
     * Constructor sets default values for student first and last name fields.
     */
    public SeniorCitizen()
    {
        this("", "");
    }

    /** 
     * Explicit call to superclass Student constructor sets initial values for 
     * the student first name, last name, grade and credits fields.  Grade for 
     * senior citizens always is set to an empty string and grade always is set 
     * to zero(0) since seniors pay no tuition and receive no college credit.  
     * 
     * @param firstName the student's first name
     * @param lastName the student's last name
     */

    public SeniorCitizen(String firstName, String lastName)
    {
        super(firstName, lastName, "", 0);
    }

    /** 
     * Returns the student's semester tuition field as an int value.  The 
     * value returned always is zero (0) since senior citizens pay no tuition.
     * This method must be implemented because class SeniorCitizen implements 
     * the Tuition interface which defines the abstract getTuition() method.
     *  
     * @return The student's tuition
     */
    @Override
    public int getTuition()
    {
        return 0;
    }

    /** 
     * Returns the formatted semester tuition field with a label as a string.
     * This method must be implemented because class SeniorCitizen extends
     * the Student class which defines abstract getTuitionString() method.
     * 
     * @return formatted tuition field with label as a String.
     */
    @Override
    public String getTuitionString()
	{
	     return "Tuition: $" + getTuition() + " (Senior citizen)";
    }
}
