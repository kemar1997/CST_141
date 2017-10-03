import java.util.Scanner;

/**
 * Demonstration of methods from the 'String' class.
 *
 * @author Prof. Carl B. Struck
 * @version CST141 - Fall 2013
 */
public class StringsDemo
{
    // Scanner instance variable
    private static Scanner reader = new Scanner(System.in);

    /**
     * Placeholder constructor for class String.
     */
    public StringsDemo()
    {
        // (No statements)
    }

    /**
     * Declaring String objects demonstration.
     */
    public static void declaringStringObjects()
    {
        String firstName = "Martin";
        String middleName = new String();
        String lastName = new String("Jennings");
        String generation = new String( new char[] {'I', 'V'} );

        System.out.print("Enter middle name > ");
        middleName = reader.nextLine();

        System.out.println(firstName + " " + middleName + " " + lastName
            + " " + generation);
    }

    /**
     * Testing the String.equals() and String.equalsIgnoreCase() methods.
     */
    public static void equalsAndEqualsIgnoreCaseMethods()
    {
        System.out.print("Enter the first string > ");
        String s1 = new String( reader.nextLine() );

        System.out.print("Enter the second string > ");
        String s2 = new String( reader.nextLine() );

        System.out.print("String 1.  \"" + s1 + "\"    ");
        System.out.println("String 2.  \"" + s2 + "\"");

        System.out.print("Case sensitive:  ");

        if ( s1.equals(s2) )
        {
            System.out.println("First string equals second string");
        }
        else
        {
            System.out.println("First string does not equal second string");
        }

        System.out.print("Case insensitive:  ");

        if ( s1.equalsIgnoreCase(s2) )
        {
            System.out.println("First string equals second string");
        }
        else
        {
            System.out.println("First string does not equal second string");
        }
    }

    /**
     * Testing the String.compareTo() and String.compareToIgnoreCase() methods.
     */
    public static void compareToAndCompareToIngoreCaseMethods()
    {
        System.out.print("Enter the first string > ");
        String s1 = new String( reader.nextLine() );

        System.out.print("Enter the second string > ");
        String s2 = new String( reader.nextLine() );

        System.out.print("String 1.  \"" + s1 + "\"    ");
        System.out.println("String 2.  \"" + s2 + "\"");

        System.out.print("Results of compareTo() method:  ");

        if ( s1.compareTo(s2) == 0 )
        {
            System.out.println("First string equals second string");
        }
        else if ( s1.compareTo(s2) > 0 )
        {
            System.out.println("First string is greater than second string");
        }
        else
        {
            System.out.println("First string is less than second string");
        }

        System.out.print("Results of compareToIgnoreCase() method:  ");

        if ( s1.compareToIgnoreCase(s2) == 0 )
        {
            System.out.println("First string equals second string");
        }
        else if ( s1.compareToIgnoreCase(s2) > 0 )
        {
            System.out.println("First string is greater than second string");
        }
        else
        {
            System.out.println("First string is less than second string");
        }
    }

    /**
     * Testing the String.regionMatches() method.
     */
    public static void regionMatchesMethod()
    {
        System.out.print("Enter the first string > ");
        String s1 = new String( reader.nextLine() );

        System.out.print("Enter the second string > ");
        String s2 = new String( reader.nextLine() );

        System.out.print("String 1.  \"" + s1 + "\"    ");
        System.out.println("String 2.  \"" + s2 + "\"");

        System.out.print("Results of regionMatches() method:  ");

        if ( s1.regionMatches(2, s2, 2, 5) )
        {
            System.out.println(
                "Region of first string matches region of second");
        }
        else
        {
            System.out.println(
                "Region of first string does not match region of second");
        }

        System.out.print(
            "Results of regionMatches() method--ignoreCase is True:  ");

        if ( s1.regionMatches(true, 2, s2, 2, 5) )
        {
            System.out.println(
                "Region of first string matches region of second");
        }
        else
        {
            System.out.println(
                "Region of first string does not match region of second");
        }
    }

    /**
     * Testing the String.startsWith() and String.endsWith() methods.
     */
    public static void startsWithAndEndsWithMethods()
    {
        System.out.print("Enter the string > ");
        String s1 = new String( reader.nextLine() );

        System.out.print("What characters does the string start with? > ");
        String starts = new String( reader.nextLine() );

        System.out.print("What characters does the string end with? > ");
        String ends = new String( reader.nextLine() );

        System.out.println("Starts with the startsWith() string: "
            + s1.startsWith(starts) );

        System.out.println("Ends with the endsWith() string: "
            + s1.endsWith(ends) );
    }

    /**
     * Testing the String.length() and String.charAt() methods.
     */
    public static void lengthAndCharAtMethods()
    {
        System.out.print("Enter the string > ");
        String s1 = new String( reader.nextLine() );

        int stringLength = s1.length();

        System.out.print(
            "Enter character location from zero (0) up to "
            + (stringLength - 1) + " > " );
        int stringPosition = Integer.parseInt( reader.nextLine() );

        System.out.println("Repeat the string:  \"" + s1 + "\"");
        System.out.println("Character at position " + stringPosition
            + " is '" + s1.charAt(stringPosition) + "'");
    }

    /**
     * Testing the String.concat() method.
     */
    public static void concatMethod()
    {
        System.out.print("Enter the first string > ");
        String s1 = new String( reader.nextLine() );

        System.out.print("Enter the second string > ");
        String s2 = new String( reader.nextLine() );

        System.out.println( s1.concat(s2) );
        System.out.println( s1 + " " + s2 );
    }

    /**
     * Testing the String.substring() method.
     */
    public static void substringMethod()
    {
        System.out.print("Enter the string > ");
        String s1 = new String( reader.nextLine() );

        System.out.print("Enter where the substring begins > ");
        int beginIndex = reader.nextInt();

        System.out.println("The substring to the end is \""
            + s1.substring( beginIndex ) + "\"");

        System.out.print("\nEnter where the substring ends > ");
        int endIndex = reader.nextInt();

        System.out.println("The substring to the end index exclusive is \""
            + s1.substring( beginIndex, endIndex ) + "\"");
    }

    /**
     * Testing the String.toLowerCase() and String.toUpperCase() methods.
     */
    public static void toLowerCaseAndToUpperCaseMethods()
    {
        System.out.print("Enter the string > ");
        String s1 = new String( reader.nextLine() );

        System.out.println("The string converted to lowercase is \""
            + s1.toLowerCase() + "\"");

        System.out.println("The string converted to uppercase is \""
            + s1.toUpperCase() + "\"");
    }

    /**
     * Testing the String.split() method.
     */
    public static void splitMethod()
    {
        System.out.print("Enter the string > ");
        String s1 = new String( reader.nextLine() );

        String[] t1 = s1.split(" ");

        System.out.println("String array has " + t1.length + " elements\n");

        for (String t : t1)
        {
            System.out.println( t );
        }
    }

    /**
     * Testing the String.indexOf() and String.lastIndexOf() methods.
     */
    public static void indexOfAndLastIndexOfMethods()
    {
        System.out.print("Enter the string > ");
        String s1 = new String( reader.nextLine() );

        System.out.print("Enter characters to search for > ");
        String s2 = new String( reader.nextLine() );

        System.out.println("The string \"" + s2 + "\" found in \""
            + s1 + "\"");

        System.out.println("The first time starting at position "
            + s1.indexOf(s2) );
        System.out.println("The last time starting at position "
            + s1.lastIndexOf(s2) );

        System.out.print("\nStart search at which location up to "
            + (s1.length() - 1) + " > ");
        int startPosition = Integer.parseInt( reader.nextLine() );

        System.out.println("Starting after position " +  startPosition
            + " the string \"" + s2 + "\" found in \"" + s1 + "\" "
            + "located at " + s1.indexOf(s2, startPosition) );

        System.out.println("Starting before position " + startPosition
            + " the string \"" + s2 + "\" found in \"" + s1 + "\" "
            + " located at " + s1.lastIndexOf(s2, startPosition) );
    }
}
