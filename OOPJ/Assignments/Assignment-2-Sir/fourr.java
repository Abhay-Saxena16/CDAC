
//d. Declare a method-local variable strStatus of type String with the value "1" or "0" and attempt 
//to convert it to a boolean. 
//(Hint: parseBoolean method will not work as expected with "1" or "0").

import java.util.Scanner;
import java.lang.*;

class four{
	public static void main(String[] args) {
		String strStatus = "0";

		boolean b = "1".equals(strStatus);
		System.out.println("The boolean value is:"+b);
		}
}


