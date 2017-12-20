import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Writes and reads a SuffolkResident student object to and from binary
 * ObjectOutputStream and ObjectInputStream files.
 *
 * @author Carl B. Struck
 * @version  Copyright 2013 (c) SCCC West
 */
public class ObjectIOStream
{
    private static Scanner reader = new Scanner(System.in);

    /**
     * Writes an output SuffolkResident object with student name, grade
     * and credits data to a binary ObjectOutputStream file.
     *
     * @throws IOException for any file operation failure related to the 'temp.dat' file
     * @throws InputMismatchException if user enters non-integer input for 'credits'
     * @throws Exception when any unexpected exception occurs
     */
    public static void output()
    {
        try
        {
            ObjectOutputStream output = new ObjectOutputStream(
                    new FileOutputStream("App_Data/temp.data") );

            SuffolkResident student = new SuffolkResident();

            System.out.print("Enter student first name==> ");
            student.setFirstName( reader.next() );

            System.out.print("Enter student last name==> ");
            student.setLastName( reader.next() );

            System.out.print("Enter student grade==> ");
            student.setGrade( reader.next() );

            System.out.print("Enter number of credits==> ");
            student.setCredits( reader.nextInt() );

            output.writeObject(student);
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
     * Reads an input SuffolkResident object with student name, grade
     * and credits data from a binary ObjectInputStream file and writes
     * the object's toString() method return value to the terminal window.
     *
     * @throws IOException for any file operation related to the 'temp.dat' file
     * @throws ClassNotFoundException if the JVM cannot load the SuffolkResident class
     * @throws Exception when any unexpected exception occurs
     */
    public static void input()
    {
        try
        {
            ObjectInputStream input = new ObjectInputStream(
                    new FileInputStream("App_Data/temp.data") );

            System.out.println( (SuffolkResident) input.readObject() );
            
            input.close();
        }

        catch (IOException ex)
        {
            System.out.println("File operation error");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("Cannot find class SuffolkResident");
        }

        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
