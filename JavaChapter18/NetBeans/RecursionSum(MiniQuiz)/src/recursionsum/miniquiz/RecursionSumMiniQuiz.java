/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursionsum.miniquiz;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calculates the sum of values from 1 to 'n' as in sum(n) = 1 + 2 + ... + n
 * 
 *
 * @author Kemar Golding
 * @version 12/13/17
 */
public class RecursionSumMiniQuiz {

    /**
     * Gets the number n from which will be calculated 
     * the sum of values and display result.
     * 
     * @param args the command line arguments
     * @throws InputMismatchException if user enters non-integer input
     */
    public static void main(String[] args) {
        try {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("What is the number?: ");
            int n = sc.nextInt();
            
            int sumOfN = sum(n);
            
            System.out.println("The sum of numbers from 1 to " + n + 
                    " is " + sumOfN);
        
        } catch (InputMismatchException ex) {
            
            System.out.println(ex);
        
        } catch (Exception ex) {
            
            System.out.println(ex);
            
        }
    }
    
    /**
     * Uses a recursive algorithm to calculate the sum of all values
     * from 1 to 'n'.
     * 
     * @param n value for which the sum is calculated
     * @return the sum of all values from 1 to param n
     * @throws java.lang.Exception if param is 0 or less
     */
    public static int sum(int n) throws Exception {
        
        if (n <= 0) {
            throw new Exception("Input value must be 1 or greater!");
        }
        
        if (n == 1)
            return 1;
        else
            return n + sum(n - 1);
    }
}
