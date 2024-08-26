/* Ques 01. Snippet 1:  
				public class Main { 
				public void main(String[] args) { 
				System.out.println("Hello, World!"); 
					} 
				} 
 What error do you get when running this code?  */

/* Error -  'main' method is not declared 'public static'
*/

/* Expl -  The code snippet provided will not run successfully due to the incorrect signature of the main method. In Java, the main method must be declared with the exact signature: 
									public static void main(String[] args)

Method Signature: The main method in your code is declared as public void main(String[] args), but it should be public static void main(String[] args). The main method must be static so that it can be called by the Java Virtual Machine (JVM) without creating an instance of the class.


correction --
				public class Main { 
				public static void main(String[] args) { 
				System.out.println("Hello, World!"); 
					} 
				} 
*/








/* Ques 02. Snippet 2:  
				public class Main { 
    static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 
 What happens when you compile and run this code?   */

/* Error -   Main method not found in class Main, please define the main method as: 
			
				public static void main(String[] args)
*/

/* Expl - This signature is missing the public modifier and has void as the return type. While static is present, which is correct, the method needs to be public and static to be properly recognized as the entry point.


correction --		public class Main { 
						public static void main(String[] args) { 
							System.out.println("Hello, World!"); 
						} 
					}

*/









/* Ques 03. Snippet 3:  		public class Main { 
								public static int main(String[] args) { 
									System.out.println("Hello, World!"); 
									return 0; 
								} 
							 
							 
							}
				
 What happens when you compile and run this code?   */

/* Error -    Main method must return a value of type void in class Main, pleasedefine the main method as:
  
					public static void main(String[] args)
*/

/* Expl - The code will compile without any issues. The method signature 'public static int main(String[] args)' is syntactically correct. However, the main method in Java is conventionally expected to have a return type of void, and it should be declared public static.


correction --	public class Main { 
					public static void main(String[] args) { 
						System.out.println("Hello, World!"); 
						return 0; 
					} 
				 
				 
				}
*/








/* Ques 4. Snippet 4:  public class Main { 
							public static void main() { 
								System.out.println("Hello, World!"); 
							} 
						} 
 What happens when you compile and run this code? Why is String[] args needed? 
				  */

/* Error -     Main method not found in class Main, please define the main method as:
					
					public static void main(String[] args)
*/

/* Expl - The main method needs to have a String[] args parameter for the JVM to recognize it as the entry point of the program. This is how the JVM knows where to start executing the code when the program is run.

Q. Why is String[] args needed? 

The public static void main(String[] args) method in Java is used as the entry point for running a Java program. When a Java program is executed, the Java Virtual Machine (JVM) looks for the main method in the specified class and executes it.

The public access modifier allows the main method to be accessed from outside of the class. The static keyword allows the method to be called without creating an instance of the class, which is necessary because the JVM needs to call the method to start the program. The void return type means that the main method does not return any value.

The String[] args parameter allows the main method to accept command line arguments as an array of strings. These arguments can be passed to the program when it is executed, allowing the program to be customized at runtime.


correction --	public class Main { 
					public static void main(String[] args) { 
						System.out.println("Hello, World!"); 
					} 
				}
*/







/* Ques 05. Snippet 5:  	public class Main { 
								public static void main(String[] args) { 
									System.out.println("Main method with String[] args"); 
								} 
								public static void main(int[] args) { 
									System.out.println("Overloaded main method with int[] args"); 
								} 
							} 
 Can you have multiple main methods? What do you observe? 
				
*/
/* o/p - Main method with String[] args


 Explanation - The code will compile successfully. Java allows method overloading, so having two main methods with different parameter types (one with String[] and one with int[]) is syntactically correct.
 
 In Java, you can indeed have multiple methods named main within the same class, as long as they have different parameter lists. This is known as method overloading. Overloading is a feature in Java that allows multiple methods to have the same name but different parameter lists within the same class.

*/










/* Ques 06. Snippet 6: 	public class Main { 
						public static void main(String[] args) { 
							int x = y + 10; 
							System.out.println(x); 
							} 
						} 
 What error occurs? Why must variables be declared? 
				
*/

/* Error -     cannot find symbol
                                                        int x = y + 10;
                                                
*/

/* Expl - The error occurs because the variable y is used in the expression y + 10 without being declared or initialized. 


 Why must variables be declared?  --   Declaration of a variable in a computer programming language is a statement used to specify the variable name and its data type. Declaration tells the compiler about the existence of an entity in the program and its location. When you declare a variable, you should also initialize it.
*/

 







/* Ques 07. Snippet 7:  public class Main { 
							public static void main(String[] args) { 
								int x = "Hello"; 
								System.out.println(x); 
							} 
						} 
 What compilation error do you see? Why does Java enforce type safety?
				
*/

/* Error -   incompatible types: String cannot be converted to int
                                                                int x = "Hello";             */

/* Expl - Java enforces type safety to prevent operations that could lead to unexpected results or runtime errors. In this case:
int is a primitive data type that represents integer values.
"Hello" is a String, which is a sequence of characters.

Java's type safety mechanism ensures that:

Preventing Errors: Type safety helps catch errors at compile time rather than at runtime. This reduces the likelihood of bugs that could arise from invalid type operations.

Clear Code: It makes the code more readable and maintainable by enforcing clear and explicit type constraints.

Predictable Behavior: It ensures that operations on variables are consistent with their data types, making the behavior of the program more predictable and reliable.
*/







/* Ques 08. Snippet 8:  	public class Main { 
							public static void main(String[] args) { 
								System.out.println("Hello, World!" 
							} 
						} 
 What syntax errors are present? How do they affect compilation? 				
*/
/* Error -   ')' expected
                                                                System.out.println("Hello, World!"  
*/
/* Expl - missing Closing Parenthesis 

How do they affect compilation? -- Compilation Failure
*/


 



/* Ques 09. Snippet 9:  public class Main { 
							public static void main(String[] args) { 
								int class = 10; 
								System.out.println(class); 
							} 
						} 
 What error occurs? Why can't reserved keywords be used as identifiers?				
*/
/* Error -    not a statement
									int class = 10;
*/

/* Expl - class is a reserved keyword in Java. Reserved keywords are predefined by the Java language specification and have special meanings within the language. In this case, class is used to define a class in Java.

Q .Why can't reserved keywords be used as identifiers?

Ans -- No, reserved words in Java, such as int, class, static, etc. cannot be used as identifiers. Reserved words have predefined meanings in the language's syntax and using them as identifiers would lead to confusion and syntax errors.
*/








/* Ques 10. Snippet 10:  	public class Main { 
								public void display() { 
									System.out.println("No parameters"); 
								} 
								public void display(int num) { 
									System.out.println("With parameter: " + num); 
								} 
								public static void main(String[] args) { 
									display(); 
									display(5); 
								} 
							} 
 What happens when you compile and run this code? Is method overloading allowed?
				
*/

/* Error -     	non-static method display() cannot be referenced from a static context
                                                                        display();
                                                                        ^
				non-static method display(int) cannot be referenced from a static context
                                                                        display(5);
*/

/* Expl - Static Context Issue: The main method is static, meaning it belongs to the class itself rather than an instance of the class. In the main method, you are trying to call display() and display(5) directly. However, display() and display(5) are instance methods, which means they need to be called on an instance of the Main class.

Compilation Errors: Because display() and display(int num) are not static, the compiler will not be able to resolve the calls to these methods from within the static main method.

Q .Does Java allow method overloading?

Ans . Method Overloading in Java -
Method overloading in Java means having two or more methods (or functions) in a class with the same name and different arguments (or parameters). It can be with a different number of arguments or different data types of arguments.


correction --  	public class Main { 
					public void display() { 
						System.out.println("No parameters"); 
					} 
					public void display(int num) { 
						System.out.println("With parameter: " + num); 
					} 
					public static void main(String[] args) { 
						Main obj = new Main(); // Create an instance of Main
						obj.display();        // Call display() on the instance
						obj.display(5);       // Call display(int num) on the instance
					} 
				}

*/








/* Ques 11. Snippet 11:  		public class Main { 
									public static void main(String[] args) { 
										int[] arr = {1, 2, 3}; 
										System.out.println(arr[5]); 
									} 
								} 
 What runtime exception do you encounter? Why does it occur? 

				
*/

/* Exeception -   Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3 
*/

/*Q.  Why the Exception Occurs ?

Array Bounds: In Java, arrays are zero-indexed, which means the first element is at index 0 and the last element in an array of length n is at
 index n-1. Accessing an index outside this range (negative indices or indices greater than n-1) will result in an ArrayIndexOutOfBoundsException.

Safety Mechanism: This exception is a safety mechanism provided by Java to prevent accessing invalid memory locations, which could lead to undefined behavior or program crashes.
*/









/* Ques 12. Snippet 12:  	public class Main { 
								public static void main(String[] args) { 
									while (true) { 
										System.out.println("Infinite Loop"); 
									} 
								} 
							} 
 What happens when you run this code? How can you avoid infinite loops?				
*/
/* Expl - The program will enter an infinite loop. The while (true) loop condition is always true, so the loop will never terminate on its own.


Q .How can you avoid infinite loops? 

Ans . 	1.Proper Loop Conditions
		2.Break Statements
*/









/* Ques 13. Snippet 13:  	public class Main { 
								public static void main(String[] args) { 
									String str = null; 
									System.out.println(str.length()); 
								} 
							} 
 What exception is thrown? Why does it occur?				
*/

/* Exeception -   Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null 
*/

/* Expl - Method Invocation Requires an Object: Methods like length() are instance methods of the String class. They need to be called on an actual String object. Since str is null, there is no String object to invoke the method on, leading to the exception.
*/








/* Ques 14. Snippet 14:  public class Main { 
							public static void main(String[] args) { 
								double num = "Hello"; 
								System.out.println(num); 
							} 
						} 
 What compilation error occurs? Why does Java enforce data type constraints? 
				
*/

/* Error -     incompatible types: String cannot be converted to double
                                                                double num = "Hello";
*/


 





/* Ques 15. Snippet 15:  	public class Main { 
								public static void main(String[] args) { 
									int num1 = 10; 
									double num2 = 5.5; 
									int result = num1 + num2; 
									System.out.println(result); 
								} 
							} 
 What error occurs when compiling this code? How should you handle different data types 
in operations?
				
*/

/* Error -     incompatible types: possible lossy conversion from double to int
                                                                        int result = num1 + num2;
                                              
*/

/* Expl - The error occurs because of a type mismatch in the expression num1 + num2

In Java, when you perform an operation with mixed data types (an int and a double in this case), the result is implicitly promoted to the more precise type (in this case, double). Thus, num1 + num2 results in a double.
*/








/* Ques 16. Snippet 16:  	public class Main { 
								public static void main(String[] args) { 
									int num = 10; 
									double result = num / 4; 
									System.out.println(result); 
								} 
							} 
 What is the result of this operation? Is the output what you expected? 
*/
// Result -  2.0  









/* Ques 17. Snippet 17:  	public class Main { 
								public static void main(String[] args) { 
									int a = 10; 
									int b = 5; 
									int result = a ** b; 
									System.out.println(result);  
								} 
							} 
 What compilation error occurs? Why is the ** operator not valid in Java?
*/
/* Error -    not a statement
									int result = a ** b;
*/
/* Q .Why is the ** operator not valid in Java?

Ans . In java ** operator exponentiation is not present like other programming languages instead of this java has math class.
*/








/* Ques 18. Snippet 18:  	public class Main { 
								public static void main(String[] args) { 
									int a = 10; 
									int b = 5; 
									int result = a + b * 2; 
									System.out.println(result); 
								} 
							} 
 What is the output of this code? How does operator precedence affect the result? 
*/
/* o/p -  20  

Q .How does operator precedence affect the result? 

Ans .In Java, multiplication (*) has higher precedence than addition (+). This means that multiplication is performed before addition in the expression.
*/



 





/* Ques 19. Snippet 19:  	public class Main { 
								public static void main(String[] args) { 
									int a = 10; 
									int b = 0; 
									int result = a / b; 
									System.out.println(result); 
								} 
							} 
 What runtime exception is thrown? Why does division by zero cause an issue in Java?				
*/
// Exception -  Exception in thread "main" java.lang.ArithmeticException: / by zero

// Expl - This Program throw Arithmetic exception because of due any number divide by 0 is undefined in Mathematics. 










/* Ques 20. Snippet 20:  	public class Main { 
								public static void main(String[] args) { 
									System.out.println("Hello, World") 
								} 
							} 
 What syntax error occurs? How does the missing semicolon affect compilation? 				
*/
/* Error -     ';' expected
								System.out.println("Hello, World")
*/
/* Expl - Forgetting a semicolon in a programming language that requires them can cause a syntax error. The interpreter or compiler will not be able to understand the code and will produce an error message.

The missing semicolon prevents the Java compiler from understanding where the System.out.println statement ends. Because of this, the compiler cannot correctly parse the code and thus cannot proceed with compilation.
*/








/* Ques 21. Snippet 21:  	public class Main { 
								public static void main(String[] args) { 
									System.out.println("Hello, World!"); 
								// Missing closing brace here 
							} 
 What does the compiler say about mismatched braces? 				
*/

// Error -  reached end of file while parsing                                                      }  

/* Expl - In Java, every opening brace { must have a corresponding closing brace }. Braces are used to define the beginning and end of blocks of code, such as methods, classes, loops, and conditionals.
*/








/* Ques 22. Snippet 22:  	public class Main { 
								public static void main(String[] args) { 
									static void displayMessage() { 
										System.out.println("Message"); 
									} 
								} 
							} 
 What syntax error occurs? Can a method be declared inside another method?				
*/
/* Error -     illegal start of expression
                                                                        static void displayMessage() {
                                                                        ^
Main.java:592: error: class, interface, enum, or record expected                                                        }
*/
/* Expl -   In Java, you cannot declare a method inside another method. Methods must be declared at the class level, not within other methods.


correction --   public class Main { 
					public static void main(String[] args) { 
						displayMessage(); // Calling the method from main
					} 

					// Method declaration at the class level
					static void displayMessage() { 
						System.out.println("Message"); 
					} 
				}
*/








/* Ques 23. Snippet 23:  	public class Confusion { 
								public static void main(String[] args) { 
									int value = 2; 
									switch(value) { 
										case 1: 
											System.out.println("Value is 1"); 
										case 2: 
											System.out.println("Value is 2"); 
										case 3: 
											System.out.println("Value is 3"); 
										default: 
											System.out.println("Default case"); 
									} 
								} 
							} 
 Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent 
the program from executing the default case?
*/
// Expl - To prevent the default case from executing, you need to add break statements to terminate each case block. 










/* Ques 24. Snippet 24:  	public class MissingBreakCase { 
								public static void main(String[] args) { 
									int level = 1; 
									switch(level) { 
										case 1: 
											System.out.println("Level 1"); 
										case 2: 
											System.out.println("Level 2"); 
										case 3: 
											System.out.println("Level 3"); 
										default: 
											System.out.println("Unknown level"); 
									} 
								} 
							} 
 Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? What is the role of the break statement in this situation?				
*/
/* Expl - When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? 
Ans . because break statement is not used.

The break statement is used to terminate the execution of the switch statement. Without break, the execution continues through all subsequent cases until it either finds a break statement or reaches the end of the switch block. This is known as fall-through.
*/








/* Ques 25. Snippet 25:  	public class Switch { 
								public static void main(String[] args) { 
									double score = 85.0; 
									switch(score) { 
										case 100: 
											System.out.println("Perfect score!"); 
											break; 
										case 85: 
											System.out.println("Great job!"); 
											break; 
										default: 
											System.out.println("Keep trying!"); 
									} 
								} 
							} 
 Error to Investigate: Why does this code not compile? What does the error tell you about the 
types allowed in switch expressions? How can you modify the code to make it work?
				
*/
/* Error -    patterns in switch statements are a preview feature and are disabled by default.
                                                                        switch(score) {
                                                                              ^
  (use --enable-preview to enable patterns in switch statements)
Main.java:691: error: constant label of type int is not compatible with switch selector type double
                                                                                case 100:
                                                                                     ^
Main.java:694: error: constant label of type int is not compatible with switch selector type double
                                                                                case 85: 
*/
/* Expl - The error in code is because to the use of a double type in the switch statement. Java's switch statement does not support double (or any floating-point types) for case labels.


correction --	public class SwitchExample { 
					public static void main(String[] args) { 
						double score = 85.0; 
						int intScore = (int) score;  // Cast double to int
						switch(intScore) { 
							case 100: 
								System.out.println("Perfect score!"); 
								break; 
							case 85: 
								System.out.println("Great job!"); 
								break; 
							default: 
								System.out.println("Keep trying!"); 
						} 
					} 
				}
*/




public class Main { 
								public static void main(String[] args) { 
									int number = 5; 
									switch(number) { 
										case 5: 
											System.out.println("Number is 5"); 
											break; 
										case 5: 
											System.out.println("This is another case 5"); 
											break; 
										default: 
											System.out.println("This is the default case"); 
									} 
								} 
							} 



/* Ques 26. Snippet 26:  	public class Switch { 
								public static void main(String[] args) { 
									int number = 5; 
									switch(number) { 
										case 5: 
											System.out.println("Number is 5"); 
											break; 
										case 5: 
											System.out.println("This is another case 5"); 
											break; 
										default: 
											System.out.println("This is the default case"); 
									} 
								} 
							} 
 Error to Investigate: Why does the compiler complain about duplicate case labels? What 
happens when you have two identical case labels in the same switch block? 
				
*/

/* Error -    
*/

/* Expl - 


correction --
*/