import java.util.Scanner;

/**
 * Demonstration of methods from the 'Character' class.
 *
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2013
 */
public class CharactersDemo
{
    // Instance variables (none)

    /**
     * Placeholder constructor for class CharactersDemo.
     */
    public CharactersDemo()
    {
        // (No statements)
    }

    /**
     * Testing the 'Character' class methods.
     */
    public static void classCharacterMethods()
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the first character: ");
        char c1 = reader.nextLine().charAt(0);

        System.out.print("Enter the second character: ");
        char c2 = reader.nextLine().charAt(0);

        Character c3 = new Character(c1);

        System.out.println("\nThe first char is : '" + c1 + "'");
        System.out.println("The second char is : '" + c2 + "'");
        System.out.println("The charValue() is : '" + c3.charValue() + "'\n");

        System.out.println("The first char == the second char: "
            + c3.equals(c2) );
        System.out.println("The first char < or > or == the second char: "
            + c3.compareTo(c2) + "\n");

        System.out.println("Is it defined?:  " + Character.isDefined(c1) );
        System.out.println("Is it a digit?:  " + Character.isDigit(c1) );
        System.out.println("Is it a letter?:  " + Character.isLetter(c1) );
        System.out.println("Is it a letter or digit?:  "
            + Character.isLetterOrDigit(c1) );
        System.out.println("Is it lower case?:  " + Character.isLowerCase(c1) );
        System.out.println("Is it upper case?:  " + Character.isUpperCase(c1) );
        System.out.println("To lower case:  " + Character.toLowerCase(c1) );
        System.out.println("To upper case:  " + Character.toUpperCase(c1) );
    }
}
