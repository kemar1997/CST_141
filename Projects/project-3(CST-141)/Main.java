import javax.swing.JOptionPane;
/**
 * Driver for MyPoint class 
 *
 * @author Kemar Golding & Erik Zagarello
 * @version 10/02/2017
 */
public class Main
{
    public static void main (String[] args) {
        // Creating two points
        MyPoint a = new MyPoint();
        MyPoint b = new MyPoint(10, 30.5);
        
        // setting the coordinates from dialog boxes also wrapping them in the
        // Double wrapper class
        a.setXCoord( Double.parseDouble(
            JOptionPane.showInputDialog("Enter new x-coordinate for point a") ) );
            
        a.setYCoord( Double.parseDouble(
            JOptionPane.showInputDialog("Enter new y-coordinate for point a") ) );
            
        b.setXCoord( Double.parseDouble(
            JOptionPane.showInputDialog("Enter new x-coordinate for point b") ) );
            
        b.setYCoord( Double.parseDouble(
            JOptionPane.showInputDialog("Enter new y-coordinate for point b") ) );
            
        // displays the return value of the toString method and the distance method  
        JOptionPane.showMessageDialog(null, a.toString() + "\n" + b.toString() + "\n" + "The distance between a and b is: " + a.distance(b) );
    }
}
