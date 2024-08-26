// Q 6.Write a program to find and print the first 5 prime numbers. 

class sixth{
    public static void main(String[] args) {
        int count = 0; // Number of primes found
        int number = 2; // Number to check for primality
        int limit = 5; // Number of primes to find

        System.out.println("The first " + limit + " prime numbers are:");

        while (count < limit) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true; // 2 is the only even prime number
        }
        if (num % 2 == 0) {
            return false; // Other even numbers are not prime
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false; // Divisible by i
            }
        }
        return true; // Number is prime
    }
}
