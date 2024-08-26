
                                                             //  SECTION - A

/* Ques 01. Snippet 1:  public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i--) { 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted? 

// Error - error comes because of update part of the loop (i--):

/* Expl - Decrementing Variable: The i-- operation decreases the value of i in each iteration. This means that i will move further away from the condition i < 10.

Condition Never Fails: Since i is always decreasing, it will always be less than 10 after the first iteration. Thus, the condition i < 10 is always true, and the loop never terminates.

Correction --		public class InfiniteForLoop { 
					public static void main(String[] args) { 
					for (int i = 0; i < 10; i++) { 
					System.out.println(i); 
							} 
						} 
					}
*/








/* Ques 02. Snippet 2 : public class IncorrectWhileCondition { 
						public static void main(String[] args) { 
						int count = 5; 
						while (count = 0) { 
						System.out.println(count); 
						count--; 
								} 
							} 
						} 
// Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the 
`while` loop?
} 
/* Error - The condition in the while loop is count = 0, which is an assignment rather than a comparison. 
*/
/* Expl - In the line while (count = 0):

          ** The expression count = 0 assigns 0 to count.
          ** The result of the assignment expression is 0, which evaluates to false in the while loop condition.
          ** As a result, the while loop does not execute because the condition evaluates to false immediately.

correction --        while (count > 0)         */










/* Ques 4. Snippet 4 : 	public class OffByOneErrorForLoop { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 10; i++) { 
            System.out.println(i); 
        } 
        // Expected: 10 iterations with numbers 1 to 10 
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
} 
// Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the 
expected output?
} */ 
// correction -- To adjust the loop to meet the expected output of numbers 1 to 9, modify the loop condition to i < 10










/* Ques 5 . Snippet 5: 	public class WrongInitializationForLoop { 
						public static void main(String[] args) { 
						for (int i = 10; i >= 0; i++) { 
						System.out.println(i); 
								} 
							} 
						} 
// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the 
initialization and update statements in the `for` loop?
*/
// Error - i++ 
/* 
correction - To print numbers in descending order from 10 to 0, you should use i-- (decrement) instead of i++ (increment) in the update statement.
*/









/* Ques 6. Snippet 6: 	public class MisplacedForLoopBody { 
						public static void main(String[] args) { 
						for (int i = 0; i < 5; i++) 
						System.out.println(i); 
						System.out.println("Done"); 
							} 
						} 
// Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to 
include all statements within the loop?
*/
/* 
Explanation -- loop body is defined by braces {}. When braces are omitted, only the immediate next statement is considered part of the loop body. 
*/








/* Ques 07. Snippet 07: 	public class UninitializedWhileLoop { 
							public static void main(String[] args) { 
							int count; 
 
 
							while (count < 10) { 
							System.out.println(count); 
							count++; 
									} 
								} 
							} 
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop 
variable properly? 
*/
/* 
Explanation -- The code you provided produces a compilation error because the variable count is used before it is initialized.Variables must be initialized before they can be used.
*/







/* Ques 08. Snippet 08: 	public class OffByOneDoWhileLoop { 
							public static void main(String[] args) { 
							int num = 1; 
							do { 
							System.out.println(num); 
							num--; 
							} while (num > 0); 
								} 
							} 
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the 
numbers from 1 to 5?
*/
// Error -  The loop only prints 1 because after the first iteration, num is decremented to 0, which causes the loop to stop.
/* correction -- 	public class CorrectDoWhileLoop { 
				public static void main(String[] args) { 
				int num = 1; // Start at 1
 
				do { 
				System.out.println(num); 
				num++; // Increment instead of decrement
				} while (num <= 5); // Continue until num is greater than 5
					} 
				}
*/








/* Ques 09. Snippet 09: public class InfiniteForLoopUpdate { 
						public static void main(String[] args) { 
						for (int i = 0; i < 5; i += 2) { 
						System.out.println(i); 
								} 
							} 
						} 
// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update 
expression be corrected?	
*/
// Error -  The code you provided does not run infinitely, but it produces unexpected results because of update expression in the for loop.
// correction -- Make increement to  i++








/* Ques 10. Snippet 10: 	public class IncorrectWhileLoopControl { 
							public static void main(String[] args) { 
							int num = 10; 
							while (num = 10) { 
							System.out.println(num); 
							num--; 
									} 
								} 
							} 
// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition? 
*/

// Error -  To fix the loop and make it terminate correctly, you should use the equality operator == for comparison in the loop condition.

// correction --  while (num > 0)  // Use comparison operator for a valid condition








/* Ques 11. Snippet 11: 	    public static void main(String[] args) { 
								int i = 0; 
								while (i < 5) { 
								System.out.println(i); 
								i += 2; // Error: This may cause unexpected results in output 
										} 
									} 
								} 
// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the 
desired result?
*/

// Answer -  o/p of loop is 0,2,4 








/* Ques 12. Snippet 12: 	public class LoopVariableScope { 
							public static void main(String[] args) { 
							for (int i = 0; i < 5; i++) { 
							int x = i * 2; 
							} 
							System.out.println(x); // Error: 'x' is not accessible here 
								} 
							} 
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope 
*/

// Error -  The code snippet has a compilation error due to variable scope. 

