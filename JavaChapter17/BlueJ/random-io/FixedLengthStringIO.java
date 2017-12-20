import java.io.IOException;
import java.io.DataInput;
import java.io.DataOutput;

/**
 * A class whose methods write and retrieve fixed-length strings.
 * 
 * @author Carl B. Struck
 * @version SCCC West - Copyright (c) 2005
 */
public class FixedLengthStringIO
{
    /**
     * Reads and returns a string of fixed-length size from a
     * RandomAccessFile object.
     * 
     * @param size an int which is the number of characters to read
     * @param infile the RandomAccess file object which is assigned 
     *        to the DataInput object
     * 
     * @return The string of characters which was read from the 
     *         RandomAccessFile
     * 
     * @throws IOException
     */
    public static String readFixedLengthString(
            int size, DataInput inFile) throws IOException
    {
        char chars[] = new char[size];

        for (int ctr = 0; ctr < size; ctr++)
        {
            chars[ctr] = inFile.readChar();
        }

        return new String(chars);
    }

     /**
     * Writes a string of fixed-length size to a RandomAccessFile object.
     * 
     * @param outString the string to be written to the RandomAccessFile object
     * @param size an int which is the number of characters to be written
     * @param outfile the RandomAccess file object which is assigned 
     *        to the DataOutput object
     * 
     * @throws IOException
     */
    public static void writeFixedLengthString(String outString,
            int size, DataOutput outFile) throws IOException
    {
        char chars[] = new char[size];
        
        // If outString.length() is greater than size return size and assign it to length
        // If outString.length() is less than or equal to size return outString.length()
        // and asign it to length
        int length = ( outString.length() > size
                          ? size : outString.length() );
        
        // The getChars() method copies the String to a char array
        outString.getChars(0, length, chars, 0);

        // Fill the remaining chars with blank characters
        for (int ctr = length; ctr < size; ctr++)
        {
            chars[ctr] = ' ';
        }

        outFile.writeChars( new String(chars) );
    }
}