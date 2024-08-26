// Q 9.Write a program to find and print the largest digit in the number 4825.  

class ninth{
    public static void main(String[] args) {
        int number = 4825;
        int largestDigit = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit > largestDigit) {
                largestDigit = digit; 
            }
            number /= 10; // Remove the last digit from the number
        }

        // Print the result
        System.out.println("The largest digit is: " + largestDigit);
    }
}
