import java.util.Scanner;

class CompoundInterestCalculator {
    private double principal;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int years;
    double futureValue;
    double totalInterest;
    

    
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter investment amount : ");
        principal = sc.nextDouble();

        System.out.println("Enter the annual interest rate (in percentage): ");
        annualInterestRate = sc.nextDouble() / 100;  

        System.out.println("Enter the number of times interest is compounded per year: ");
        numberOfCompounds = sc.nextInt();

        System.out.println("Enter the investment duration (in years): ");
        years = sc.nextInt();
    }

    public void calculateFutureValue(){
    	futureValue=principal * Math.pow((1 + annualInterestRate / numberOfCompounds), numberOfCompounds * years);
    }

    public void calculateTotalInterest(){
    	totalInterest = futureValue - principal;
    }

    public void printRecord() {
        System.out.printf("Future Value of the investment: %.2f\n", futureValue);
        System.out.printf("Total Interest Earned: %.2f\n", totalInterest);
        

    }
}

public class second {
    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        calculator.acceptRecord();
        calculator.calculateFutureValue();
        calculator.calculateTotalInterest();
        calculator.printRecord();
    }
}
