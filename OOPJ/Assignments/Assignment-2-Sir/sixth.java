//6. Working with java.lang.Float

//a. Explore the Java API documentation for java.lang.Float and observe its modifiers 
//and super types.

//b. Write a program to test how many bytes are used to represent a float value using 
//the BYTES field. (Hint: Use Float.BYTES).

//class test{
//    public static void main(String[] args) {
//        int bytesUsed = Float.BYTES;
//        
//        System.out.println("The num of bytes used to represent a float : " + bytesUsed);
//    }
//}

//c. Write a program to find the minimum and maximum values of float using the MIN_VALUE 
//and MAX_VALUE fields. 
//(Hint: Use Float.MIN_VALUE and Float.MAX_VALUE).

//class test {
//    public static void main(String[] args) {
//        float minValue = Float.MIN_VALUE;
//        float maxValue = Float.MAX_VALUE;
//        
//        System.out.println("The minimum positive value of a float is: " + minValue);
//        System.out.println("The maximum value of a float is: " + maxValue);
//    }
//}

//d. Declare a method-local variable number of type float with some value and 
//convert it to a String using the toString method. 
//(Hint: Use Float.toString(float)).

//class test{
//    public static void main(String[] args) {
//        float number = 123.45f;
//        String numberAsString = Float.toString(number);
//
//        System.out.println("The float value as a String is: " + numberAsString);
//    }
//}

//e. Declare a method-local variable strNumber of type String with some value and 
//convert it to a float value using the parseFloat method. 
//(Hint: Use Float.parseFloat(String)).

//class test {
//    public static void main(String[] args) {
//        String strNumber = "123.45";
//       
//        float number = Float.parseFloat(strNumber);
//        System.out.println("The String value as a float is: " + number);
//        
//    }
//}


//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" 
//and attempt to convert it to a float value. 
//(Hint: parseFloat method will throw a NumberFormatException).

//class test {
//    public static void main(String[] args) {
//        String strNumber = "Ab12Cd3";
//        float number = Float.parseFloat(strNumber);
//
//        System.out.println("The String value as a float is: " + number);
//        
//    }
//}

//g. Declare a method-local variable number of type float with some value and 
//convert it to the corresponding wrapper class using Float.valueOf(). 
//(Hint: Use Float.valueOf(float)).

//class test{
//    public static void main(String[] args) {
//        float number = 3.14f;
//        Float numberWrapper = Float.valueOf(number);
//
//        System.out.println("The Float wrapper object is: " + numberWrapper);
//    }
//}

//h. Declare a method-local variable strNumber of type String with some float value and 
//convert it to the corresponding wrapper class using Float.valueOf(). 
//(Hint: Use Float.valueOf(String)).

//class test{
//    public static void main(String[] args) {
//        String strNumber = "456.78";
//        Float numberWrapper = Float.valueOf(strNumber);
//
//        System.out.println("The Float wrapper object is: " + numberWrapper);
//    }
//}

//i. Declare two float variables with values 112.3 and 984.5, and 
//add them using a method from the Float class. (Hint: Use Float.sum(float, float)).

//class test{
//    public static void main(String[] args) {
//        float num1 = 112.3f;
//        float num2 = 984.5f;
//        
//        float sum = Float.sum(num1, num2);
//        
//        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
//    }
//}

//j. Declare two float variables with values 112.2 and 556.6, and find the minimum and 
//maximum values using the Float class. 
//(Hint: Use Float.min(float, float) and Float.max(float, float)).

//class test{
//    public static void main(String[] args) {
//        float num1 = 112.2f;
//        float num2 = 556.6f;
//        float minValue = Float.min(num1, num2);
//        float maxValue = Float.max(num1, num2);
//
//   
//        System.out.println("The minimum value is: " + minValue);
//        System.out.println("The maximum value is: " + maxValue);
//    }
//}

//k. Declare a float variable with the value -25.0f. Find the square root of this value. 
//(Hint: Use Math.sqrt() method).

//class test{
//    public static void main(String[] args) {
//        float number = -25.0f;
//        double sqrtValue = Math.sqrt(number);
//        
//        System.out.println("The square root of " + number + " is: " + sqrtValue);
//    }
//}

//l. Declare two float variables with the same value, 0.0f, and divide them. 
//(Hint: Observe the result and any special floating-point behavior).

//class test{
//    public static void main(String[] args) {
//        float num1 = 0.0f;
//        float num2 = 0.0f;
//        float result = num1 / num2;
//        System.out.println("The result of dividing is: " + result);
//    }
//}




//7. Working with java.lang.Double

//a. Explore the Java API documentation for java.lang.Double and observe its modifiers 
//and super types.

//b. Write a program to test how many bytes are used to represent a double value using 
//the BYTES field. 
//(Hint: Use Double.BYTES).

//class test{
//    public static void main(String[] args) {
//        int b = Double.BYTES;
//        System.out.println("The bytes are used to represent a double: " + b);
//    }
//}


//c. Write a program to find the minimum and maximum values of double using the 
//MIN_VALUE and MAX_VALUE fields. 
//(Hint: Use Double.MIN_VALUE and Double.MAX_VALUE).

//class test{
//    public static void main(String[] args) {
//        double minValue = Double.MIN_VALUE;
//        double maxValue = Double.MAX_VALUE;
//        
//        System.out.println("The minimum value of a double is: " + minValue);
//        System.out.println("The maximum value of a double is: " + maxValue);
//    }
//}


//d. Declare a method-local variable number of type double with some value and 
//convert it to a String using the toString method. 
//(Hint: Use Double.toString(double)).

//class test{
//    public static void main(String[] args) {
//        double d = 100.000023;
//        String s = Double.toString(d);
//        
//        System.out.println("The string : " +s );
//    }
//}


//e. Declare a method-local variable strNumber of type String with some value and 
//convert it to a double value using the parseDouble method. 
//(Hint: Use Double.parseDouble(String)).

//class test{
//  public static void main(String[] args) {
//      String strNumber = "12345";
//      double value = Double.parseDouble(strNumber);
//      
//      System.out.println("The value of a double is: " + value);
//  }
//}


//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" 
//and attempt to convert it to a double value. 
//(Hint: parseDouble method will throw a NumberFormatException).

//class test{
//  public static void main(String[] args) {
//      String strNumber = "Ab12Cd3";
//      double value = Double.parseDouble(strNumber);
//      
//      System.out.println("The value of a double is: " + value);
//  }
//}


//g. Declare a method-local variable number of type double with some value and convert 
//it to the corresponding wrapper class using Double.valueOf(). 
//(Hint: Use Double.valueOf(double)).

//class test{
//  public static void main(String[] args) {
//      double v = 1234;
//      Double wrap = Double.valueOf(v);
//      
//      System.out.println("The wrapper class double is: " + v);
//  }
//}


//h. Declare a method-local variable strNumber of type String with some double value and 
//convert it to the corresponding wrapper class using Double.valueOf(). 
//(Hint: Use Double.valueOf(String)).

//class test{
//	  public static void main(String[] args) {
//		  	String strNumber = "42.58";
//	        Double wrappernum = Double.valueOf(strNumber);
//
//	        System.out.println("Wrapper class Double: " + wrappernum);
//	  }
//	}


//i. Declare two double variables with values 112.3 and 984.5, and add them using a 
//method from the Double class. 
//(Hint: Use Double.sum(double, double)).

//class test{
//	  public static void main(String[] args) {
//		  double v = 1234.6;
//		  double w = 6789.7;
//
//	      System.out.println("Sum of double values is: " + Double.sum(v, w));
//	  }
//	}


//j. Declare two double variables with values 112.2 and 556.6, and find the minimum 
//and maximum values using the Double class. 
//(Hint: Use Double.min(double, double) and Double.max(double, double)).

//class test{
//    public static void main(String[] args) {
//        double m = 112.2;
//        double n= 556.6;
//        double minValue = Double.min(m,n);
//        double maxValue = Double.max(m,n);
//        
//        System.out.println("The minimum value of a double is: " + minValue);
//        System.out.println("The maximum value of a double is: " + maxValue);
//    }
//}


//k. Declare a double variable with the value -25.0. Find the square root of this 
//value. (Hint: Use Math.sqrt() method).

//class test{
//	  public static void main(String[] args){
//		  double v = -25.0;
//		  double sqrtValue = Math.sqrt(v);
//
//	      System.out.println("Sqaure root is: " + sqrtValue );
//  }
//}


//l. Declare two double variables with the same value, 0.0, and divide them. 
//(Hint: Observe the result and any special floating-point behavior).

class test{
	  public static void main(String[] args){
		  double v = 0.0;
		  double w = 0.0;
		  double x = v/w;

	      System.out.println("Divide is: " + x );
  }
}


//class test{
//  public static void main(String[] args) {
//      double minValue = Double.MIN_VALUE;
//      double maxValue = Double.MAX_VALUE;
//      
//      System.out.println("The minimum value of a double is: " + minValue);
//      System.out.println("The maximum value of a double is: " + maxValue);
//  }
//}

