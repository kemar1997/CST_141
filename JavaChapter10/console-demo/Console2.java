import java.util.Scanner;

/**
 * The Plato formula--using variables and console input with class Scanner 
 * in combination with System.in (the "standard input stream").
 *
 * @author     Carl B. Struck
 * @version    Copyright (c) 2006 - SCCC West
 */
public class Console2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        char gender;
        int inputAge, outputAge = 0;

        System.out.print("What is your gender (m/f)?: ");
        gender = scanner.nextLine().toLowerCase().charAt(0);

        if (gender != 'm' && gender != 'f')
        {
	    	System.out.println("Invalid gender entered");
		}
		else
		{
            System.out.print("What is your age?: ");
            inputAge = scanner.nextInt();

            if (gender == 'm')
            {
                outputAge = inputAge / 2 + 7;
    	    }
    		else if (gender == 'f')
            {
                outputAge = inputAge * 2 - 14;
    	    }

            System.out.println("The ideal age of your spouse is "
            	+ outputAge + " years old.");
        }
    }
}






