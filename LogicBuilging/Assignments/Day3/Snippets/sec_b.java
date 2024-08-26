
                                                               //  SECTION - B

/* Ques 01. Snippet 01: 	public class NestedLoopOutput { 
						public static void main(String[] args) { 
						for (int i = 1; i <= 3; i++) { 
						for (int j = 1; j <= 2; j++) { 
						System.out.print(i + " " + j + " "); 
						} 
						System.out.println(); 
								} 
							} 
						} 
// Guess the output of this nested loop. 
*/

/* Ans -  	1 1 1 2 
			2 1 2 2 
			3 1 3 2    */






/* Ques 02. Snippet 02:		public class DecrementingLoop { 
						public static void main(String[] args) { 
						int total = 0; 
						for (int i = 5; i > 0; i--) { 
						total += i; 
						if (i == 3) continue; 
						total -= 1; 
						} 
						System.out.println(total); 
							} 
						} 
// Guess the output of this loop.   */

/* Ans -  11  */










/* Ques 03. Snippet 03:	public class WhileLoopBreak { 
						public static void main(String[] args) { 
						int count = 0; 
						while (count < 5) { 
						System.out.print(count + " "); 
						count++; 
						if (count == 3) break; 
						} 
						System.out.println(count); 
							} 
						} 
// Guess the output of this while loop. 

*/

/* Ans -  0 1 2 3  */











/* Ques 04. Snippet 04:	public class DoWhileLoop { 
						public static void main(String[] args) { 
						int i = 1; 
						do { 
						System.out.print(i + " "); 
						i++; 
						} while (i < 5); 
						System.out.println(i); 
							} 
						} 
// Guess the output of this do-while loop.

*/

/* Ans - 1 2 3 4 5   */










/* Ques 05. Snippet 05:	public class ConditionalLoopOutput { 
					public static void main(String[] args) { 
					int num = 1; 
					for (int i = 1; i <= 4; i++) { 
					if (i % 2 == 0) { 
					num += i; 
					} else { 
					num -= i; 
					} 
					} 
					System.out.println(num); 
						} 
					} 
// Guess the output of this loop.

*/

/* Ans -  3  */






/* Ques 06. Snippet 06:  	public class IncrementDecrement { 
							public static void main(String[] args) { 
							int x = 5; 
							int y = ++x - x-- + --x + x++; 
							System.out.println(y); 
							} 
} 
// Guess the output of this code snippet.

*/

/* Ans -  8  */








/* Ques 07. Snippet 07/:  	public class NestedIncrement { 
							public static void main(String[] args) { 
							int a = 10; 
							int b = 5; 
							int result = ++a * b-- - --a + b++; 
							System.out.println(result); 
								} 
							} 
// Guess the output of this code snippet.

*/

/* Ans -  49  */







/* Ques 08. Snippet 08/:  	public class LoopIncrement { 
								public static void main(String[] args) { 
									int count = 0; 
									for (int i = 0; i < 4; i++) { 
										count += i++ - ++i; 
									} 
									System.out.println(count); 
								} 
							 
							 
							} 
// Guess the output of this code snippet. 
*/

/* Ans -   -4  */