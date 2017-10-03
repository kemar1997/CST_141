import javax.swing.JOptionPane;
/**
 * Instantiate a Book object, get values for it, and display the book. 
 *
 * @author Kemar
 * @version 9/25/2017
 */
public class Main
{
    /**
     * Create and display the Book object.
     */
    public static void main(String[] args)
    {
        Book b1 = new Book();
        
        b1.setTitle( JOptionPane.showInputDialog("Enter book title") );
        b1.setAuthor( JOptionPane.showInputDialog("Enter author") );
        
        // wrapping parseInt into the setPages method
        b1.setPages( Integer.parseInt( 
            JOptionPane.showInputDialog("Enter number of pages") ) );
            
        JOptionPane.showMessageDialog(null, b1.toString() );
    }
}
