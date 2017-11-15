package proj7;

import javax.swing.JOptionPane;

/**
 * The driver class that instantiates an object from each subclass
 * using the features of a for each loop and also using the JOptionPane
 * methods for input and output.
 *
 * @author Kemar Golding, Erik Zagarello, Peter Kaligeris
 */
public class Main {
    public static void main(String[] args) {
        
        Employee[] employee1 = {  
            new Executive()
        };
        
        
        for (Employee e1 : employee1) {
            e1.setName( JOptionPane.showInputDialog("Enter a name: ") );
            e1.setAddress( JOptionPane.showInputDialog("Enter an address: ") );
            try {
                e1.setSalary( Double.parseDouble(
                    JOptionPane.showInputDialog("Enter a salary: ") ));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            
            JOptionPane.showMessageDialog(null, e1.toString());
        }
        
        Salesperson[] employee2 = {
            new Salesperson()
        };
        
        for (Salesperson e2 : employee2) {
            e2.setName( JOptionPane.showInputDialog("Enter a name: ") );
            e2.setAddress( JOptionPane.showInputDialog("Enter an address: ") );
            
            try {
                e2.setSalary( Double.parseDouble(
                    JOptionPane.showInputDialog("Enter a salary: ") ));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            
            try {
                e2.setSales( Integer.parseInt(
                    JOptionPane.showInputDialog("Enter the amount "
                            + "of sales made: ")) );
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            
            JOptionPane.showMessageDialog(null, e2.toString());
        }
        
    }
}
