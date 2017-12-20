import javax.swing.JOptionPane;

/**
 * A class whose methods implement a recursive solution to the power
 * of a base number for a given exponent.
 *
 * @author Carl B. Struck
 * @version SCCC West - Copyright (c) 2009
 */
public class Exponent
{
    /**
     * Gets an integer for base and exponent from the console, passes them to 
     * method power() and displays the resulting power of the base to a
     * showMessageDialog().
     * 
     * @throws NumberFormatException if user enters non-integer input for 'exponent'
     */
    public static void start()
    {
        try
        {
            int base = Integer.parseInt( JOptionPane.showInputDialog(
                "What is the base?") );
            int exponent = Integer.parseInt( JOptionPane.showInputDialog(
                "To what power?") );

            JOptionPane.showMessageDialog(null,
                "power(" + base + ", " + exponent + ") = " + power(base, exponent) );
        }

        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "Input is not an integer");
        }

        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }

        System.exit(0);
    }

    /**
     * A recursive method that calculates and returns an integer (base) raised to a 
     * given power (exponent).
     *
     * @param base the number to be raised to the power of the exponent parameter
     * @param exponent the power to which the base number will be raised
     * @return the result of raising the base number parameter to the power of the exponent parameter
     * @throws Exception thrown if the exponent parameter is a negative number
     */    
    public static int power(int base, int exponent) throws Exception
    {
        if (exponent < 0)
        {
            throw new Exception(
                "Exponent " + exponent + " may not be negative" );
        }
        
        if (exponent == 0)
        {
            return 1;
        }
        else
        {
            return base * power(base, exponent - 1);
        }
    }
}

