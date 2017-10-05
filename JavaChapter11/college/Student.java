
/**
 * Write a description of class Student here.
 *
 * @author Kemar Golding
 * @version 10/2/17
 */
public class Student extends CommunityMember {
    // instance variables - variables for the student identification number and the students GPA
    private int studentID;
    private double gradePointAvg;

    /**
     * No arg constructor that sets the default variables
     */
    public Student() {
        // initialise nstance variables
        this("", "", 0, 0.0);
    }
    
    public Student(String firstName, String lastName, int studentID, double gradePointAvg) {
        super(firstName, lastName);
        setStudentID(studentID);
        setGPA(gradePointAvg);
    }
    
    /**
     * Sets the value for the studentID field. 
     * 
     * @param studentID Students ID number.
     */
    public void setStudentID(int studentID) {
        if (studentID >= 7000001 && studentID <= 9999999) {
            this.studentID = studentID;
        } else {
            return;
        }
    }
    
    /**
     * Sets the value for the gradePointAvg field.
     * 
     * @param gradePointAvg Students GPA
     */
    public void setGPA(double gradePointAvg) {
        if (gradePointAvg >= 0.0 && gradePointAvg <= 4.0) {
            this.gradePointAvg = gradePointAvg;
        } else {
            return;
        }
    }
    
    /**
     * Accessor method that returns the student ID number
     * 
     * @return The students ID number
     */
    public int getStudentID() {
        return studentID;
    }
    
    /**
     * Accessor method that returns the students grade point average.
     * 
     * @return The students GPA
     */
    public double getGPA() {
        return gradePointAvg;
    }
    
    /**
     * Returns a string representation of the field values.
     * 
     * @return A string representing the students grade point average and their ID number
     */
    @Override
    public String toString() {
        return super.toString()
            + "\nStudent ID #: " + getStudentID()
            + "\nGPA: " + getGPA();
    }

}
