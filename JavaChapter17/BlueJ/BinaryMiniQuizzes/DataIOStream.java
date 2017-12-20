import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
 * Quiz solution for the DataInputStream and DataOutputStream classes.
 * 
 * @author Kemar Golding
 * @version 12/4/2017
 */
public class DataIOStream {
    /**
     * Writes a product file to disk. 
     */
    public static void output() {
        try {
            DataOutputStream outFile = new DataOutputStream (
                    new FileOutputStream("product.data"));
                    
            for (int i = 0; i < 3; i++) {
                outFile.writeInt(
                    Integer.parseInt( JOptionPane.showInputDialog("Product ID: ") ) );
                    
                outFile.writeUTF( 
                    JOptionPane.showInputDialog("Item: ") );
                
                outFile.writeDouble( 
                    Double.parseDouble( JOptionPane.showInputDialog("Price: ") ) );
            }
            
            outFile.close();
        } catch (IOException ex) {
            System.out.println("File not saved");
        }
    }
    
    /**
     * Reads a product file from disk and displays contents in an output dialog.
     */
    public static void input() {
        try {
            DataInputStream inputFile = new DataInputStream( 
                new FileInputStream("product.data") );
                
            for (int i = 0; i < 3; i++) {
                StringBuilder output = new StringBuilder();
                
                output.append("Product ID: ");
                output.append( inputFile.readInt() );
                output.append("\n");
                output.append("Item: ");
                output.append( inputFile.readUTF() );
                output.append("\n");
                output.append("Price: ");
                output.append( inputFile.readDouble() );
                output.append("\n\n");
                
                JOptionPane.showMessageDialog(null, output);
            }
            
        } catch (IOException ex) {
            System.out.println("File not found");
        }
    }
}
