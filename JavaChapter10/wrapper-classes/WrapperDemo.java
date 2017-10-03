/**
 * Class WrapperDemo includes static methods that demonstrate some
 * of the methods of wrapper classes.
 *
 * @author Prof. Carl B. Struck
 * @version CST141 - Fall 2013
 */
public class WrapperDemo
{
    /**
     * Constructor for objects of class WrapperDemo
     */
    public WrapperDemo()
    {
		// (No statements)
    }

    /**
     * Demonstrate the wrapper class MIN_VALUE and MAX_VALUE constants.
     */
    public static void printWrapperMinValueAndMaxValueConstants()
    {
        System.out.println("Byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Byte: " + Double.TYPE + " to " + Double.SIZE);
        System.out.println("Short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Integer: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Character: " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        System.out.println("(int) Character: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
    }

    /**
     * Demonstrate the wrapper class TYPE and SIZE constants.
     */
    public static void printWrapperTypeAndSizeConstants()
    {
        System.out.println("TYPE\tSIZE");

        System.out.println(Byte.TYPE + "\t" + Byte.SIZE);
        System.out.println(Short.TYPE + "\t" + Short.SIZE);
        System.out.println(Integer.TYPE + "\t" + Integer.SIZE);
        System.out.println(Long.TYPE + "\t" + Long.SIZE);
        System.out.println(Float.TYPE + "\t" + Float.SIZE);
        System.out.println(Double.TYPE + "\t" + Double.SIZE);
        System.out.println(Character.TYPE + "\t" + Character.SIZE);
        System.out.println(Boolean.TYPE);
    }

    /**
     * Demonstrate some of the wrapper conversion methods.
     */
    public static void printWrapperConversionMethods()
    {
        System.out.println("new Double(\"12.4\").intValue() = " + new Double("12.4").intValue() );
        System.out.println("new Integer(\"12\").doubleValue() = " + new Integer("12").doubleValue() );
        System.out.println("new Float(42.1F).longValue() = " + new Float(42.1F).longValue() );
        System.out.println("new Long(42).floatValue() = " + new Long(42).floatValue() );
    }

    /**
     * Demonstate the wrapper compareTo() methods.
     */
    public static void printCompareToMethods()
    {
        System.out.println("new Byte(\"12\").compareTo( new Byte(\"13\") ) = "
            + new Byte("12").compareTo( new Byte("13") ) );
        System.out.println("new Short( (short) 14 ).compareTo( new Short( (short) 13 ) ) ) = "
            + new Short( (short) 14 ).compareTo( new Short( (short) 13 ) ) );
        System.out.println("new Integer(13).compareTo( new Integer(13) ) = "
            + new Integer(13).compareTo(new Integer(13) ) );
        System.out.println("new Long(\"22\").compareTo( new Long(\"21\") ) = "
            + new Long(222).compareTo( new Long(221) ) );
        System.out.println("new Float(312.25F).compareTo(new Float(312.26F) ) = "
            + new Float(312.25F).compareTo(new Float(312.26F) ) );
        System.out.println("new Double(\"40.0\").compareTo( new Double(\"40.000\") ) = "
            + new Double("40.0").compareTo(new Double("40.000") ) );
    }

    /**
     * Demonstate some of the wrapper parse methods.
     */
    public static void printValueOfMethods(String integerValue, String floatValue)
    {
        System.out.println( Byte.valueOf(integerValue) );
        System.out.println( Short.valueOf(integerValue, 2) );
    }
}
