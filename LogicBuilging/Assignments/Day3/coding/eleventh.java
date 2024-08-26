// Q 11.  Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression. 

class eleventh{
    public static void main(String[] args) {
         
        int i = 5;
        int j = 10;

        System.out.println("Initial values:");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // pre-increment and post-decrement in a single expression
        int result = ++i + j--;

        // Display the result of the expression
        System.out.println("\nAfter the expression '++i + j--':");
        System.out.println("Result = " + result);
        System.out.println("i = " + i); // i should be incremented by 1
        System.out.println("j = " + j); // j should be decremented by 1      
       
    }
}
