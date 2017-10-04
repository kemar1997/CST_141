/**
 * The Plato formula--console input from the command line with String[] args.
 *
 * @author     Carl B. Struck
 * @version    Copyright (c) 2006 - SCCC West
 */
public class Console3
{
    public static void main(String[] args)
    {
        char gender;
        int inputAge, outputAge = 0;

        if (args.length != 2)
        {
			System.out.println(
			   "Correct format is 'java Console3 <gender (m/f)> <age>'");
		}

        else
        {
			gender = args[0].toLowerCase().charAt(0);

        	if (gender != 'm' && gender != 'f')
        	{
	    		System.out.println("Invalid gender entered");
			}
			else
			{
	    	    inputAge = Integer.parseInt(args[1]);

        	    if (gender == 'm')
        	    {
        	        outputAge = inputAge / 2 + 7;
    		    }
    			else if (gender == 'f')
        	    {
        	        outputAge = inputAge * 2 - 14;
    		    }

        	    System.out.println("The ideal age of your spouse is " + outputAge + " years old.");
        	}
		}
    }
}
