import java.util.Scanner;
import java.lang.*;

//g. Declare a method-local variable number of type byte with some value and 
//convert it to the corresponding wrapper class using Byte.valueOf(). 
//(Hint: Use Byte.valueOf(byte)).



//class test{
//	public static void main(String[] args) {
//		byte number = 15;
//		
//		byte n = Byte.valueOf(number);
//
//        System.out.println("The Byte object is: " + n);
//		}
//}


//h. Declare a method-local variable strNumber of type String with some byte value and 
//convert it to the corresponding wrapper class using Byte.valueOf(). 
//(Hint: Use Byte.valueOf(String)).

//class test{
//	public static void main(String[] args) {
//		String strNumber = "15";
//		
//		byte n = Byte.valueOf(strNumber);
//
//        System.out.println("The Byte object is: " + n);
//		}
//}


//b. Write a program to test how many bytes are used to represent a short value using the BYTES field. 
//(Hint: Use Short.BYTES).

//class test{
//	public static void main(String[] args) {
//		String strNumber = "15";
//		
//		 int shortSize = Short.BYTES;
//
//		 System.out.println("The number of bytes used to represent a short value is: " + shortSize);
//		}
//}





//4.h. Declare a method-local variable strNumber of type String with some integer value and 
//convert it to the corresponding wrapper class using Integer.valueOf(). 
//(Hint: Use Integer.valueOf(String)).
//
//class test{
//	public static void main(String[] args) {
//		String strNumber = "123";
//        Integer integerValue = Integer.valueOf(strNumber);
//
//        System.out.println("The Integer value is: " + integerValue);
//		}
//}



//i. Declare two integer variables with values 10 and 20, and 
//add them using a method from the Integer class. 
//(Hint: Use Integer.sum(int, int)).

//class test{
//	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 20;
//		
//		 int sum = Integer.sum(num1, num2);
//		 System.out.println("The sum is: " + sum);
//		}
//}

//j. Declare two integer variables with values 10 and 20, and find the minimum and 
//maximum values using the Integer class. 
//(Hint: Use Integer.min(int, int) and Integer.max(int, int)).


//class test{
//	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 20;
//		
//		System.out.println("The min is: " +Integer.min(num1, num2) );
//		System.out.println("The max is: " +Integer.max(num1, num2) );
//		}
//}

//k. Declare an integer variable with the value 7. Convert it to binary, octal, and
//hexadecimal strings using methods from the Integer class. 
//(Hint: Use Integer.toBinaryString(int), Integer.toOctalString(int), and
//Integer.toHexString(int)).

class test{
	public static void main(String[] args) {
		int num = 15;
		String bin = Integer.toBinaryString(num);
		String oct = Integer.toOctalString(num);
		String hex = Integer.toHexString(num);
		
		
		System.out.println("The binary num is: " +bin);
		System.out.println("The octal num is: " +oct);
		System.out.println("The hexadecimal num is: " +hex);
		
		}
}



//class test{
//	public static void main(String[] args) {
//		String strNumber = "15";
//		
//		 int shortSize = Short.BYTES;
//
//		 System.out.println("The number of bytes used to represent a short value is: " + shortSize);
//		}
//}



