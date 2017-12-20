import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
/**
 * Writes and reads Object IO Stream objects.
 * 
 * @author Kemar Golding 
 * @version 12/6/2017
 */
public class ObjectIOStream
{
    /**
     * Writes a product object output stream object to disk. 
     */
    public static void output() {
        try {
            ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("product.data") );
                
            StringBuilder builder = new StringBuilder();
            
            builder.append("Product ID: ");
            builder.append( Integer.parseInt( JOptionPane.showInputDialog("Product ID: ") ) );
            builder.append("\n");
            
            output.writeObject(builder);
            
            output.close();
        } catch (IOException ex) {
            
        }
    }
}
