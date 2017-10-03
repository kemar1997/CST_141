
/**
 * Creating a test program using the Undergraduate subclass while also using field values from it superclasses directly and indirectly.
 *
 * @author Kemar Golding & Erik Zagarello & Peter Kaligeris
 * @version 10/11/17
 */

import javax.swing.JOptionPane;

public class Main
{
    public static void main(String[] args) {
        CommunityMember[] member = new CommunityMember[1];
        Undergraduate member2 = new Undergraduate();
        
        // created an array with an Undergraduate object to be called using the for loop below 
        member[0] = new Undergraduate("Kemar", "Golding", 7000003, 3.7, 2100, "freshman");
        
        // Input Dialogs to set the no arg constructor with the given info in these dialogs
        member2.setFirstName( JOptionPane.showInputDialog("Enter first name of a student") );
        member2.setLastName( JOptionPane.showInputDialog("Enter last name of a stdent") );
        member2.setStudentID( Integer.parseInt(
            JOptionPane.showInputDialog("Enter a valid student ID number (7000001 - 9999999)") ) );
        member2.setGPA( Double.parseDouble(
            JOptionPane.showInputDialog("Enter a students grade point average (0.0 - 4.0)") ) );
        member2.setSatScore( Integer.parseInt(
            JOptionPane.showInputDialog("Enter a students SAT score (600 - 2400)") ) );
        member2.setClassYear( JOptionPane.showInputDialog("Enter a students class year (ex: freshman)") );
        
        // Displaying the return value of the toString method from the above inputs
        JOptionPane.showMessageDialog(null, member2);
        
        // Displaying the return value of the toString method from the given parameters of the member array using a for loop
        for (int index = 0; index < member.length; index++)
        {
            JOptionPane.showMessageDialog(null, member[index] );
        }
        
        
        
        
        System.exit(0);
    }
}
