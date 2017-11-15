package studenttuition;

/** 
 * The SuffolkResident class definition which manages student tuition field.
 * 
 * @author Carl B. Struck
 * @version  Copyright 2002 (c) SCCC West
 */ 
public final class SuffolkResident extends Student implements Tuition
{
    /** 
     * Constructor sets default values for student first name, last name,
     * grade and credits fields.
     */
    public SuffolkResident()
    {
        this("", "", "", 0);
    }

    /** 
     * Explicit call to superclass constructor Student sets initial values 
     * for the student first name, last name, grade and credits fields.
     * 
     * @param firstName the student's first name
     * @param lastName the student's last name
     * @param grade the student's letter grade
     * @param credits the number of credits carried by the student
     */
    public SuffolkResident(String firstName, String lastName,
                           String grade, int credits)
    {
        super(firstName, lastName, grade, credits);
    }

    /** 
     * Returns the semester tuition for a student as an int based on number 
     * of credits.  If credits from superclass Student are less than 12, 
     * multiply credits by the part-time tuition rate; otherwise tuition 
     * is set to the flat full-time rate.  This method must be implemented 
     * because class SuffolkResident implements the Tuition interface which 
     * defines the abstract getTuition() method.
     * 
     * @return The student's tuition
     */
    @Override
    public int getTuition()
    {
        if (getCredits() < 12)
        {
            return (PT_TUITION * getCredits() );
        }
        else
        {
            return FT_TUITION;
        }
    }

    /** 
     * Returns the formatted semester tuition field with a label as a string.
     * This method must be implemented because class SuffolkResident extends
     * the Student class which defines abstract getTuitionString() method.
     * 
     * @return Formatted semester tuition value with label as a string
     */
    @Override
    public String getTuitionString()
	{
	     return "Tuition: $" + getTuition();
    }

}
