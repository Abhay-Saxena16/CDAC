import java.util.Scanner;
import java.lang.*;


class  LoanAmortizationCalculator{
	double principal;
	double rate;
	double term;
	double monthlyPayment;
	
	
	
	public void getrecord(Scanner sc){	
		
	System.out.println("Enter pricipal amount : ");
	principal = sc.nextInt();
	System.out.println("Enter rate of interest : ");
	rate = sc.nextDouble();
	System.out.println("Enter term : ");
	term = sc.nextDouble();
	
	}
	
	public void calculateMonthlyPayment(){
		 double mir = rate / 12 / 100 ;
		 double nom= term * 12 ;
		
		 
// monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1) 
		 
// monthlyPayment = principal * (monthlyInterestRate * ^()) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1) 		 
				 
				 
		monthlyPayment = principal * ( mir * Math.pow((1 + mir), nom )) / (Math.pow((1 + mir), nom ) -1  );		 
		}
	
	public void printrecord(){
	System.out.println("Monthly payment is: "+ monthlyPayment );	
	}
	
	
}

class first{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LoanAmortizationCalculator user1 = new LoanAmortizationCalculator();
		user1.getrecord(sc);
		user1.calculateMonthlyPayment();
		user1.printrecord();
		
		
		sc.close();
		
		}
}