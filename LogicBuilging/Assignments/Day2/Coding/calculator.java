//Write a program that acts as a simple calculator. It should accept two numbers and an operator (+, -, *, /) as input. Use a switch statement to perform //the appropriate operation. Use nested ifelse to check if division by zero is attempted and display an error message

class Calculator {
    public static void main(String[] args) {
        
        // Input numbers and operator
        int num1 = 5;
        int num2 = 2;
        char operator = '/';

        // Perform the operation based on the operator
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
                
            case '/':
                // Nested if-else to handle division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
                
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /");
                break;
        }

        
    }
}
