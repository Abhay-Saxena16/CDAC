// Q 7. Write a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6). 

// this program is similar to factorial pr.

class seventh{
    public static void main(String[] args) {
        int number = 9876;
        int sum = 0; 

        while (number != 0) {
            int r = number % 10; // get the last digit
            sum += r; // add r to sum
            number /= 10; // remove the last digit from the number
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
