//8. Conversion between Primitive Types and Strings
//
//Initialize a variable of each primitive type with a user-defined value and 
//convert it into String:
//	
//o	First, use the toString method of the corresponding wrapper class. 
//(e.g., Integer.toString()).
//o	Then, use the valueOf method of the String class. (e.g., String.valueOf()).



class test{
  public static void main(String[] args) {
	  int intValue = 123;
      double doubleValue = 65.67;
      boolean booleanValue = true;
      char charValue = 'A';
      float floatValue = 12.34f;
      long longValue = 123456789L;
      short shortValue = 123;
      byte byteValue = 10;
      
   // Convert to String using wrapper class toString method
      String intString = Integer.toString(intValue);
      String doubleString = Double.toString(doubleValue);
      String booleanString = Boolean.toString(booleanValue);
      String charString = Character.toString(charValue);
      String floatString = Float.toString(floatValue);
      String longString = Long.toString(longValue);
      String shortString = Short.toString(shortValue);
      String byteString = Byte.toString(byteValue);
      
   // Convert to String using String.valueOf method
      String intValueOf = String.valueOf(intValue);
      String doubleValueOf = String.valueOf(doubleValue);
      String booleanValueOf = String.valueOf(booleanValue);
      String charValueOf = String.valueOf(charValue);
      String floatValueOf = String.valueOf(floatValue);
      String longValueOf = String.valueOf(longValue);
      String shortValueOf = String.valueOf(shortValue);
      String byteValueOf = String.valueOf(byteValue);

      // Print results
      System.out.println("Using wrapper class toString:");
      System.out.println("int: " + intString);
      System.out.println("double: " + doubleString);
      System.out.println("boolean: " + booleanString);
      System.out.println("char: " + charString);
      System.out.println("float: " + floatString);
      System.out.println("long: " + longString);
      System.out.println("short: " + shortString);
      System.out.println("byte: " + byteString);

      System.out.println("\nUsing String.valueOf:");
      System.out.println("int: " + intValueOf);
      System.out.println("double: " + doubleValueOf);
      System.out.println("boolean: " + booleanValueOf);
      System.out.println("char: " + charValueOf);
      System.out.println("float: " + floatValueOf);
      System.out.println("long: " + longValueOf);
      System.out.println("short: " + shortValueOf);
      System.out.println("byte: " + byteValueOf);
	  
  }
}