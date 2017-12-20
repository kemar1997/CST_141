package factorial;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * A class whose methods implement a recursive solution to factorials.
 *
 * @author Carl B. Struck
 * @version SCCC West - Copyright (c) 2009
 */
public class Factorial
{
    /**
     * Gets an integer from the console, passes it to method factorial() 
     * and displays the resulting factorial to the console.
     * 
     * @param args the String[] array command line parameter
     * @throws InputMismatchException if user enters non-integer input
     */
    public static void main(String[] args)
    {
        try
        {
            Scanner input = new Scanner(System.in);

            System.out.print("Which factorial?: ");
            int n = input.nextInt();

            System.out.println( n + "! = " + factorial(n) );
        }

        catch (InputMismatchException ex)
        {
            System.out.println(ex + "--Input is not an integer");
        }

        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }

    /**
     * A recursive method which calculates and returns the factorial of
     * a positive integer or zero (0).
     *
     * @param n an integer whose factorial is to be calculated
     * @return The factorial of the input integer
     * @throws Exception if the integer parameter is a negative value
     */
    public static int factorial(int n) throws Exception
    {
        if (n < 0)
        {
            throw new Exception(
            "Factorial " + n + "! not possible for negative numbers" );
        }
        
        if (n == 0 || n == 1)   // Base Case (Only thing we know)
        {
            return 1;
        }
        else    // Recursive Case
        {
            return n * factorial(n - 1); // n! = n * (n - 1)!
        }
    }
    
}
