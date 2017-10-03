
/**
 * Write a description of class Undergraduate here.
 *
 * @author Kemar Golding
 * @version 10/11/17
 */
public class Undergraduate extends Student {
    // instance variables - replace the example below with your own
    private int satScore; // range: 600 - 2400
    private String classYear; // class year of the student

    /**
     * No arg constructor that set the default values to all of the fields available
     */
    public Undergraduate() {
        // initialise instance variables
        this("", "", 0, 0.0, 0, "");
    }
    
    /**
     * Constructor that takes arguments to set the field values to their initial values
     * 
     * @param firstName Member's first name
     * @param lastName Member's last name
     * @param studentID The student's ID number
     * @param gradePointAvg The student's grade point average
     * @param satScore The student's SAT score
     * @param classYear The class year of a student e.g. "sophmore"
     */
    public Undergraduate(String firstName, String lastName, int studentID, double gradePointAvg, int satScore, String classYear) {
        super(firstName, lastName, studentID, gradePointAvg);
        setSatScore(satScore);
        setClassYear(classYear);
    }

    /**
     * Sets the value for the SAT score variable field
     * 
     * @param satScore The student's SAT score
     */
    public void setSatScore(int satScore) {
        if (satScore >= 600 && satScore <= 2400) {
            this.satScore = satScore;
        } else {
            return;
        }
    }
    
    /**
     * Sets the value for the students class year.
     * e.g. ("sophmore", "freshman", "junior", "senior")
     * 
     * @param classYear The class year for a student
     */
    public void setClassYear(String classYear) {
        if (classYear.equals("")) {
            return;
        } else {
            this.classYear = classYear;
        }
    }
    
    /**
     * Accessor method that returns the SAT score of the student
     * 
     * @return The students SAT score
     */
    public int getSatScore() {
        return satScore;
    }
    
    /**
     * Accessor method that returns the class year of the student
     * 
     * @return The students class year
     */
    public String getClassYear() {
        return classYear;
    }
    
    /**
     * Returns a string representation of the students fields (classYear, satScore)
     * 
     * @return String representation of the students class year and SAT score
     */
    @Override
    public String toString() {
        return super.toString()
            + "\nClass Year: " + getClassYear()
            + "\nSAT Score: " + getSatScore();
    }
}
