//c. Declare a method-local variable strStatus of type String with 
//the value "true" and convert it to a boolean using the parseBoolean method. 
//(Hint: Use Boolean.parseBoolean(String)).

import java.util.Scanner;
import java.lang.*;

class third{
	public static void main(String[] args) {
		String strStatus = "true";
		boolean b = Boolean.parseBoolean(strStatus);
		System.out.println("The boolean value is:"+b);
		}
}