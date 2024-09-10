//e. Declare a method-local variable status of type boolean with the value true and convert it
//to the corresponding wrapper class using Boolean.valueOf(). 
//(Hint: Use Boolean.valueOf(boolean)).


import java.util.Scanner;
import java.lang.*;

class five{
	public static void main(String[] args) {
		boolean status = true;
		
		 // Convert the boolean value to the corresponding Boolean wrapper class
        boolean statusWrapper = Boolean.valueOf(status);

        System.out.println("The Boolean object is: " + statusWrapper);

		}
}