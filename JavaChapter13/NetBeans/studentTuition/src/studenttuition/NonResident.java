package studenttuition;

/**
 * The NonResident class definition which manages student tuition, county and
 * state fields.
 *
 * @author Carl B. Struck
 * @version Copyright 2002 (c) SCCC West
 */
public final class NonResident extends Student implements Tuition
{

    private String county;     // The student's county of residence
    private ValidState state;  // An object which stores the student's state location

    /**
     * Constructor sets default values for student first name, last name, grade,
     * credits, county and state fields.
     */
    public NonResident()
    {
        this("", "", "", 0, "", "");
    }

    /**
     * The constructor sets initial values for the student tuition and county
     * fields, and instantiates object from class State to store the state.
     * Explicit call to superclass Student constructor sets initial values for
     * the student first name, last name, grade and credits fields.
     *
     * @param firstName the student's first name
     * @param lastName the student's last name
     * @param grade the student's letter grade
     * @param credits the number of credits carried by the student
     * @param county the student's county of residence
     * @param state the student's state location
     */
    public NonResident(String firstName, String lastName,
            String grade, int credits,
            String county, String state)
    {
        super(firstName, lastName, grade, credits);
        this.state = new ValidState(state);
        setCounty(county);
    }

    /**
     * Sets value for student county of residence field.
     *
     * @param county the student's county of residence
     */
    public void setCounty(String county)
    {
        this.county = county;
    }

    /**
     * Passes the state location parameter to the setState(String) method of the
     * state object field for validation.
     *
     * @param state the student's state location
     */
    public void setState(String state)
    {
        this.state.setState(state);
    }

    /**
     * Returns the semester tuition for a student as an int based on number of
     * credits. If credits from superclass Student are less than 12, multiply
     * credits by the part-time tuition rate and double the result; otherwise
     * tuition is set to the flat full-time rate doubled. This method must be
     * implemented because class NonResident implements the Tuition interface
     * which defines the abstract getTuition() method.
     *
     * @return The student's tuition
     */
    @Override
    public int getTuition()
    {
        if (getCredits() < 12)
        {
            return (PT_TUITION * getCredits() * 2);
        } else
        {
            return FT_TUITION * 2;
        }
    }

    /**
     * Returns the student's county of residence as a String
     *
     * @return The student's county
     */
    public String getCounty()
    {
        return county;
    }

    /**
     * Returns the return value of the state object's getState() method which is
     * the student's state location as a string
     *
     * @return The student's state
     */
    public String getState()
    {
        return this.state.getState();
    }

    /**
     * Returns the formatted semester tuition, county of residence and state
     * location fields with labels as a string. This method must be implemented
     * because class SuffolkResident extends the Student class which defines
     * abstract getTuitionString() method.
     *
     * @return Formatted semester tuition value, as well as county of residence
     * and state location fields as a string
     */
    @Override
    public String getTuitionString()
    {
        return "Tuition: $" + getTuition()
                + "\nStudent from County: " + getCounty()
                + "  " + getState();
    }
}
