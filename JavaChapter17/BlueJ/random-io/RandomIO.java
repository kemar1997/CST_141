import java.util.Scanner;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.EOFException;
import java.util.InputMismatchException;

/**
 * Writes and reads student name, grade and credits data to and from
 * a binary RandomAccessFile.
 *
 * @author Carl B. Struck
 * @version  Copyright 2005 (c) SCCC West
 */
public class RandomIO
{
    private static Scanner reader = new Scanner(System.in);

    public static void output()
    {
        try
        {
            RandomAccessFile studentFile =
                new RandomAccessFile("App_Data/credits.data", "rw");

            for (int counter = 0; counter < 5; counter++)
            {
                System.out.print("Enter number of credits==> ");
                int credits = reader.nextInt();
                studentFile.writeInt(credits);
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
    }

    public static void input()
    {
        try
        {
            RandomAccessFile studentFile =
                new RandomAccessFile("App_Data/credits.data", "r");

            System.out.print("Enter student ID (1-5)==> ");
            long studentID = reader.nextLong();

            while (studentID >= 1 && studentID <= 5)
            {
                studentFile.seek( 4 * (studentID - 1) );

                int credits = studentFile.readInt();

                System.out.println("Student ID: " + studentID
                    + "\nCredits: " + credits + "\n");

                System.out.print("Enter student ID (1-5)==> ");
                studentID = reader.nextLong();
            }

            studentFile.close();
        }

        catch (EOFException ex)
        {
            System.out.println("End of file reached");
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
    }

    public static void update()
    {
        try
        {
            RandomAccessFile studentFile =
                new RandomAccessFile("App_Data/credits.data", "rw");

            System.out.print("Enter student ID (1-5)==> ");
            long studentID = reader.nextLong();

            System.out.print("Enter number of credits==> ");
            int credits = reader.nextInt();

            studentFile.seek( 4 * (studentID - 1) );
            studentFile.writeInt(credits);

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

        catch (NumberFormatException ex)
        {
            System.out.println(ex);
        }

        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
