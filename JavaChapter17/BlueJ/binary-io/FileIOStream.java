import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Writes and reads student credits data to and from binary FileOutputStream
 * and FileInputStream files.
 *
 * @author Carl B. Struck
 * @version  Copyright 2013 (c) SCCC West
 */
public class FileIOStream
{
    private static Scanner reader = new Scanner(System.in);

    /**
     * Writes output student credits data to a binary FileOutputStream file.
     *
     * @throws IOException for any file operation failure related to the 'temp.dat' file
     * @throws InputMismatchException if user enters non-integer input for 'credits'
     * @throws Exception when any unexpected exception occurs
     */
    public static void output()
    {
        try
        {
            FileOutputStream output = new FileOutputStream("App_Data/temp.data");

            System.out.print("Enter number of credits==> ");
            int credits = reader.nextInt();

            while (credits > 0)
            {
                output.write(credits);

                System.out.print("Enter number of credits==> ");
                credits = reader.nextInt();
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
     * Reads input student credits data from a binary FileInputStream file and
     * write them to the terminal window.
     *
     * @throws IOException for any file operation related to the 'temp.dat' file
     * @throws Exception when any unexpected exception occurs
     */
    public static void input()
    {
        try
        {
            FileInputStream input = new FileInputStream("App_Data/temp.data");

            int credits;
            
            // A read that can't find a binary value will return -1
            while ( (credits = input.read() ) != -1)
            {
                System.out.println(credits);
            }

            input.close();
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
