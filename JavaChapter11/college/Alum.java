import java.util.ArrayList;
/**
 * The classs Alum manages the graduation year and the degree granted.
 *
 * @author Kemar Golding
 * @version 10/4/2017
 */
public class Alum extends CommunityMember {
    // instance variables for graduation year and degree granted
    private int gradYear;
    private String degree;
    
    // The list of degrees granted by the college
    private ArrayList<String> degrees = new ArrayList();

    /**
     * Constructor initializes values of firstName, lastName, gradYear, and degree granted to the values of the parameters.
     * Adds the five valid degrees to the ArrayList.
     * 
     * @param firstName CommunityMembers first name
     * @param firstName CommunityMembers last name
     * @param gradYear The Alum's graduation year
     * @param degree The degree granted to the Alum
     */
    public Alum(String firstName, String lastName, int gradYear, String degree) {
        // initialise instance variables
        super(firstName, lastName);
        
        // An ArrayList for degrees
        degrees.add("B.A.");
        degrees.add("B.s.");
        degrees.add("M.A.");
        degrees.add("M.S.");
        degrees.add("PH.D.");
        
        setGradYear(gradYear);
        setDegree(degree);
    }
    
    /**
     * Update the graduation year.
     * 
     * @param gradYear The Alum's graduation year
     */
    public void setGradYear(int gradYear) {
        if (gradYear >= 1960 && gradYear <= 2017 || gradYear == 0) {
            this.gradYear = gradYear;
        }
    }
    
    /**
     * Update the degree granted which must be a string from the ArrayList.
     * 
     * @param degree The degree granted to the Alum
     */
    public void setDegree(String degree) {
        if ( degrees.indexOf(degree) >= 0 ) {
            this.degree = degree;
        } else {
            return;
        }
    }
    
    /**
     * Returns the graduation year
     * 
     * @return Graduation year
     */
    public int getGradYear() {
        return gradYear;
    }
    
    /**
     * Returns the degree granted to an Alum
     * 
     * @return Degree granted
     */
    public String getDegree() {
        return degree;
    }
    
    /**
     * A String representation of gradYear and the degree granted to the Alum alongside the CommunityMember's full name from its
     * superclass.
     * 
     * @return A string representing the first name and the last name of the Alum and alongside the gradYear and the degree granted
     */
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        
        output.append( super.toString() );
        output.append( "\nGraduation Year: " );
        output.append( getGradYear() );
        output.append( "\nDegree Granted: " );
        output.append( getDegree() );
        
        return output.toString();
    }
    
}
