//9. Default Values of Primitive Types
//Declare variables of each primitive type as fields of a class and check their 
//default values. (Note: Default values depend on whether the variables are instance 
//variables or static variables).


public class nine{

    // Instance variables (non-static)
    int intValue;
    double doubleValue;
    boolean booleanValue;
    char charValue;
    float floatValue;
    long longValue;
    short shortValue;
    byte byteValue;

    // Static variables
    static int staticIntValue;
    static double staticDoubleValue;
    static boolean staticBooleanValue;
    static char staticCharValue;
    static float staticFloatValue;
    static long staticLongValue;
    static short staticShortValue;
    static byte staticByteValue;

    public static void main(String[] args) {
    
        nine instance = new nine();

        // print default values of instance variables
        System.out.println("Instance variable default values:");
        System.out.println("int: " + instance.intValue);
        System.out.println("double: " + instance.doubleValue);
        System.out.println("boolean: " + instance.booleanValue);
        System.out.println("char: '" + instance.charValue + "'"); // char default value is '\u0000'
        System.out.println("float: " + instance.floatValue);
        System.out.println("long: " + instance.longValue);
        System.out.println("short: " + instance.shortValue);
        System.out.println("byte: " + instance.byteValue);

        // print default values of static variables
        System.out.println("\nStatic variable default values:");
        System.out.println("int: " + nine.staticIntValue);
        System.out.println("double: " + nine.staticDoubleValue);
        System.out.println("boolean: " + nine.staticBooleanValue);
        System.out.println("char: '" + nine.staticCharValue + "'"); // char default value is '\u0000'
        System.out.println("float: " + nine.staticFloatValue);
        System.out.println("long: " + nine.staticLongValue);
        System.out.println("short: " + nine.staticShortValue);
        System.out.println("byte: " + nine.staticByteValue);
    }
}
