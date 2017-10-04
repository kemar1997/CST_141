import java.util.Scanner;

/**
 * Write a description of class StringBuilderDemo here.
 *
 * @author Prof. Carl B. Struck
 * @version CST141 - Fall 2013
 */
public class StringBuilderDemo
{
    // Instance variables (none)

    /**
     * Placeholder constructor for class StringBuilderDemo.
     */
    public StringBuilderDemo()
    {
        // (No statements)
    }

    /**
     * Testing the 'StringBuilder' class methods.
     */
    public static void stringBuilderDemo()
    {
        StringBuilder output = new StringBuilder();
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c1 = reader.nextLine().charAt(0);

        output.append("The char is: '" + c1 + "'");
        output.append("\nIs it defined?:  " + Character.isDefined(c1) );
        output.append("\nIs it a digit?:  " + Character.isDigit(c1) );
        output.append("\nIs it a letter?:  " + Character.isLetter(c1) );
        output.append("\nIs it a letter or digit?:  "
                        + Character.isLetterOrDigit(c1) );
        output.append("\nIs it lower case?:  " + Character.isLowerCase(c1) );
        output.append("\nIs it upper case?:  " + Character.isUpperCase(c1) );
        output.append("\nTo lower case:  " + Character.toLowerCase(c1) );
        output.append("\nTo upper case:  " + Character.toUpperCase(c1) );

        System.out.println("========= Initial output() =========\n" + output);

        // Delete all characters from index 12 to the end
        // (length of the StringBuilder object)
        output.delete(12, output.length() );
        System.out.println("========== After delete() ==========\n" + output);

        // Delete character at index 0
        output.deleteCharAt(0);
        System.out.println("======= After deleteCharAt() =======\n" + output);

        // Insert StringBuilder capacity at index position 6
        output.insert(6, output.capacity() );
        System.out.println("========== After insert() ==========\n" + output);

        // Replace the index 2 though index 4 characters with
        // the StringBuilder length
        output.replace(2, 4, String.valueOf(output.length() ) );
        System.out.println("========== After replace() =========\n" + output);

        // Reverse the order of characters in StringBuilder object
        output.reverse();
        System.out.println("========== After reverse() =========\n" + output);
    }
}

