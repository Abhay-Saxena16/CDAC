//5. Working with java.lang.Long
//
//b. Write a program to test how many bytes are used to represent a long value using
//the BYTES field. (Hint: Use Long.BYTES).

//public class LongBytesTest {
//    public static void main(String[] args) {
//        int bytesUsed = Long.BYTES;
//        System.out.println("The number of bytes used to represent a long value is: " + bytesUsed);
//    }
//}



//c. Write a program to find the minimum and maximum values of long using the MIN_VALUE 
//and MAX_VALUE fields. 
//(Hint: Use Long.MIN_VALUE and Long.MAX_VALUE).

//class test {
//	    public static void main(String[] args) {
//	        // Get the minimum and maximum values of a long
//	        long minValue = Long.MIN_VALUE;
//	        long maxValue = Long.MAX_VALUE;
//
//	        // Print the minimum and maximum values
//	        System.out.println("The minimum value of a long is: " + minValue);
//	        System.out.println("The maximum value of a long is: " + maxValue);
//	    }
//	}
   
//d. Declare a method-local variable number of type long with some value and 
//convert it to a String using the toString method. 
//(Hint: Use Long.toString(long)).

//class test{
//    public static void main(String[] args) {
//        long number = 123456789L;
//        String numberAsString = Long.toString(number);
//
//        System.out.println("The long value as a String is: " + numberAsString);
//    }
//}

//e. Declare a method-local variable strNumber of type String with some value and 
//convert it to a long value using the parseLong method. 
//(Hint: Use Long.parseLong(String)).

//class test {
//    public static void main(String[] args) {
//        String strNumber = "9876543210";
//        long number = Long.parseLong(strNumber);
//
//        System.out.println("The String value as a long is: " + number);       
//    }
//}


//f. Declare a method-local variable strNumber of type String with the 
//value "Ab12Cd3" and attempt to convert it to a long value. 
//(Hint: parseLong method will throw a NumberFormatException).

//class test {
//    public static void main(String[] args) {
//        String strNumber = "Ab12Cd3";
//        long number = Long.parseLong(strNumber);
//
//        System.out.println("The String value as a long is: " + number);
//    }
//}

//g. Declare a method-local variable number of type long with some value and 
//convert it to the corresponding wrapper class using Long.valueOf(). 
//(Hint: Use Long.valueOf(long)).

//class test{
//    public static void main(String[] args) {
//        long number = 123456789L;
//        Long numberWrapper = Long.valueOf(number);
//
//        System.out.println("The Long wrapper object is: " + numberWrapper);
//    }
//}

//h. Declare a method-local variable strNumber of type String with some long value
//and convert it to the corresponding wrapper class using Long.valueOf(). 
//(Hint: Use Long.valueOf(String)).

//class test {
//    public static void main(String[] args) {
//        String strNumber = "9876543210";
//        Long numberWrapper = Long.valueOf(strNumber);
//
//        System.out.println("The Long wrapper object is: " + numberWrapper);
//    }
//}

//i. Declare two long variables with values 1123 and 9845, and add them using a 
//method from the Long class. 
//(Hint: Use Long.sum(long, long)).

//class test {
//    public static void main(String[] args) {
//        long num1 = 1123L;
//        long num2 = 9845L;
//        long sum = Long.sum(num1, num2);
//
//        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
//    }
//}

//j. Declare two long variables with values 1122 and 5566, and find the minimum 
//and maximum values using the Long class. 
//(Hint: Use Long.min(long, long) and Long.max(long, long)).

//class test{
//    public static void main(String[] args) {
//        long num1 = 1122L;
//        long num2 = 5566L;
//        long minValue = Long.min(num1, num2);
//        long maxValue = Long.max(num1, num2);
//
//        System.out.println("The minimum value is: " + minValue);
//        System.out.println("The maximum value is: " + maxValue);
//    }
//}

//k. Declare a long variable with the value 7. Convert it to binary, octal, 
//and hexadecimal strings using methods from the Long class. 
//(Hint: Use Long.toBinaryString(long), Long.toOctalString(long), and
//Long.toHexString(long)).

class test{
    public static void main(String[] args) {
        long number = 7L;
        String binaryString = Long.toBinaryString(number);
        String octalString = Long.toOctalString(number);
        String hexString = Long.toHexString(number);
        
        System.out.println("The binary representation is: " + binaryString);
        System.out.println("The octal representation is: " + octalString);
        System.out.println("The hexadecimal representation is: " + hexString);
    }
}






