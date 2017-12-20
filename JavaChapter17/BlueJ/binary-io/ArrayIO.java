import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Writes and reads SuffolkResident student array objects to and from
 * binary ObjectOutputStream and ObjectInputStream files.
 *
 * @author Carl B. Struck
 * @version  Copyright 2013 (c) SCCC West
 */
public class ArrayIO
{
    private static Scanner reader = new Scanner(System.in);

    /**
     * Writes an array of three output SuffolkResident student objects with
     * student names, grades and credits to a binary ObjectOutputStream file.
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

            SuffolkResident[] student = new SuffolkResident[3];

            for (int index = 0; index < student.length; index++)
            {
                student[index] = new SuffolkResident();

                System.out.print("Enter student first name==> ");
                student[index].setFirstName( reader.next() );

                System.out.print("Enter student last name==> ");
                student[index].setLastName( reader.next() );

                System.out.print("Enter student grade==> ");
                student[index].setGrade( reader.next() );

                System.out.print("Enter number of credits==> ");
                student[index].setCredits( reader.nextInt() );
            }

            output.writeObject(student);
            output.close();
        }

        catch (IOException ex)
        {
            System.out.println(ex);
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
     * Reads an an array of input SuffolkResident student objects with student
     * name, grade and credits data from a binary ObjectInputStream file and writes
     * the objects' toString() method return values to the terminal window.
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

            SuffolkResident[] student = ( SuffolkResident[] ) input.readObject();

            for (SuffolkResident s: student)
            {
                System.out.println(s + "\n");
            }
            
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
