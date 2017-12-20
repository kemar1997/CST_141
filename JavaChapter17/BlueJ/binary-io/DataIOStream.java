import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;

/**
 * Writes and reads student name, grade and credits data to and from
 * binary DataOutputStream and DataInputStream files.
 *
 * @author Carl B. Struck
 * @version  Copyright 2013 (c) SCCC West
 */
public class DataIOStream
{
    private static Scanner reader = new Scanner(System.in);

    /**
     * Writes output student name, grade and credits data to a binary
     * DataOutputStream file.
     *
     * @throws IOException for any file operation failure related to the 'temp.dat' file
     * @throws InputMismatchException if user enters non-integer input for 'credits'
     * @throws Exception when any unexpected exception occurs
     */
    public static void output()
    {
        try
        {
            DataOutputStream output = new DataOutputStream(
                new FileOutputStream("App_Data/temp.data") );

            System.out.print("Enter student first name==> ");
            String firstName = reader.next();

            while ( ! firstName.equalsIgnoreCase("0") )
            {

                System.out.print("Enter student last name==> ");
                String lastName = reader.next();

                System.out.print("Enter student grade==> ");
                String grade = reader.next();

                System.out.print("Enter number of credits==> ");
                int credits = reader.nextInt();

                output.writeUTF(firstName);
                output.writeUTF(lastName);
                output.writeUTF(grade);
                output.writeInt(credits);

                System.out.print("Enter student first name==> ");
                firstName = reader.next();
            }

            output.close();
        }

        catch (IOException ex)
        {
            System.out.println("File operation error");
        }

        catch (InputMismatchException ex)
        {
            System.out.println("Non-numeric or non-integer input");
        }

        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }

    /**
     * Reads input student name, grade and credits data from a binary
     * DataInputStream file and writes them to the terminal window.
     *
     * @throws EOFException for an attempt to read past the end of the 'temp.dat' file
     * @throws IOException for any file operation related to the 'temp.dat' file
     * @throws Exception when any unexpected exception occurs
     */
    public static void input()
    {
        try
        {
            DataInputStream input = new DataInputStream(
                new FileInputStream("App_Data/temp.data") );

            while (true)
            {
                System.out.println( input.readUTF() + " " + input.readUTF()
                    + "\t" + input.readUTF() + "\t" + input.readInt() );
            }
        }

        catch (EOFException ex)
        {
            System.out.println("End of file reached");
        }

        catch (IOException ex)
        {
            System.out.println("File operation error");
        }

        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }

}
