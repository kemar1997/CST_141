import java.util.Scanner;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.EOFException;
import java.util.InputMismatchException;

/**
 * Writes to and reads from a RandomAccessFile with fixed-length String
 * and int variables.
 *
 * @author Carl B. Struck
 * @version  Copyright 2005 (c) SCCC West
 */
public class RandomWithStringsIO
{
    private static Scanner reader = new Scanner(System.in);
    //private static final long BYTES = 69;

    /**
     * Writes student name, grade and credits data to a RandomAccessFile with
     * fixed-length String and int variables.
     *
     * @throws IOException
     * @throws InputMismatchException
     * @throws Exception
     */
    public static void output()
    {
        try
        {
            RandomAccessFile studentFile = new RandomAccessFile(
                    "App_Data/studentFile.data", "rw");

            System.out.print("Enter student first name==> ");
            String firstName = reader.next();

            while ( ! firstName.equals("0") )
            {
                System.out.print("Enter student last name==> ");
                String lastName = reader.next();

                System.out.print("Enter student grade==> ");
                String grade = reader.next();

                System.out.print("Enter number of credits==> ");
                int credits = reader.nextInt();
                
                studentFile.seek( studentFile.length() );

                FixedLengthStringIO.writeFixedLengthString(
                    firstName, 15, studentFile);
                    
                FixedLengthStringIO.writeFixedLengthString(
                    lastName, 15, studentFile);
                    
                FixedLengthStringIO.writeFixedLengthString(
                    grade, 2, studentFile);
                    
                studentFile.writeInt(credits);

                System.out.print("Enter student first name==> ");
                firstName = reader.next();
            }

            studentFile.close();
        }

        catch (IOException ex)
        {
            System.out.println(ex);
        }

        catch (InputMismatchException ex)
        {
            System.out.println(ex);
        }

        catch (Exception ex)
        {
            System.out.println(ex);
        }

        System.exit(0);
    }

    /**
     * Reads student name, grade and credits data from a RandomAccessFile
     * with fixed-length String and int variables, and prints the data to
     * the terminal window.
     *
     * @throws EOFException
     * @throws IOException
     * @throws InputMismatchException
     * @throws Exception
     */
    public static void input()
    {
        try
        {
            RandomAccessFile studentFile = new RandomAccessFile(
                    "App_Data/studentFile.data", "r");

            System.out.print("Enter student ID (1-"
                + ( studentFile.length() / 68 ) + ")==> ");
            long studentID = reader.nextLong();

            while (studentID >= 1 && studentID <= ( studentFile.length() / 68 ) )
            {
                studentFile.seek( 68 * (studentID - 1) );

                String firstName = FixedLengthStringIO.readFixedLengthString(
                        15, studentFile);
                        
                String lastName = FixedLengthStringIO.readFixedLengthString(
                        15, studentFile);
                        
                String grade = FixedLengthStringIO.readFixedLengthString(
                        2, studentFile);
                        
                int credits = studentFile.readInt();

                System.out.println("Student name: " + firstName.trim() + " " + lastName
                    + "\nGrade: " + grade
                    + "\nCredits: " + credits + "\n");
                //
                System.out.print("Enter student ID (1-"
                    + ( studentFile.length() / 68 ) + ")==> ");
                studentID = reader.nextLong();
            }

            studentFile.close();
        }

        catch (EOFException ex)
        {
            System.out.println(ex);
        }

        catch (IOException ex)
        {
            System.out.println(ex);
        }

        catch (InputMismatchException ex)
        {
            System.out.println(ex);
        }

        catch (Exception ex)
        {
            System.out.println(ex);
        }

        System.exit(0);
    }

}
