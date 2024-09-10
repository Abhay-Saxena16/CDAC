//f. Declare a method-local variable strStatus of type String with the value "true" and 
//convert it to the corresponding wrapper class using Boolean.valueOf(). 
//(Hint: Use Boolean.valueOf(String)).

import java.util.Scanner;
import java.lang.*;

class six{
	public static void main(String[] args) {
		String strStatus = "true";
		
		 // Convert the boolean value to the corresponding Boolean wrapper class
        boolean statusWrapper = Boolean.valueOf(status);

        System.out.println("The Boolean value is: " + statusWrapper);

		}
}