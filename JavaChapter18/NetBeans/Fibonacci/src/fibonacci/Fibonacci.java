package fibonacci;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * A class whose methods implement a recursive solution to the 
 * Fibonacci Series.
 *
 * @author Carl B. Struck
 * @version SCCC West - Copyright (c) 2012
 */
public class Fibonacci
{
    /**
     * Gets an integer from the console, passes it to method fibonacci() and
     * displays the resulting Fibonacci series value to the terminal window.
     * 
     * @param args the String[] array command line parameter
     * @throws InputMismatchException if user enters non-integer input
     * @throws Exception if input integer is negative or greater than 40
     */
    public static void main(String[] args)
    {
        try
        {
            Scanner input = new Scanner(System.in);

            System.out.print("How many Fibonacci Series value?: ");
            int n = input.nextInt();
            
            if (n > 40)
            {
                throw new Exception(
                    "Value greater than 40 is invalid");
            }

            if (n < 0)
            {
                throw new Exception(
                    "Fibonacci Series for " + n + " not possible for negative numbers");
            }
        
            for (int ctr = 0; ctr <= n; ctr++)
            {
                System.out.println( "Fibonacci of " + ctr + " is: " + fibonacci(ctr) );
            }
        }

        catch (InputMismatchException ex)
        {
            System.out.println("Input is not an integer");
        }

        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    /**
     * A recursive method which calculates and returns a value in the Fibonacci series for
     * a positive integer or zero (0).
     *
     * @param n an integer whose Fibonacci Series value is to be calculated
     * @return the Fibonacci Series value of the input integer
     * @throws Exception thrown if the exponent parameter is a negative number
     */
    public static int fibonacci(int n) throws Exception
    {
        if (n == 0 || n == 1)
        {
            return n;
        }
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }    
}
