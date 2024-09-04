import java.util.Scanner;

class Second{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight(in kg): ");
		double w = sc.nextDouble();
		System.out.println("Enter height(in meter): ");
		double h = sc.nextDouble();

		double bmi = w/(h*h);
		System.out.println("Your BMI is: "+bmi);
		System.out.print("Catergory: ");

		if(bmi < 18.5){
			System.out.println("Underweight");
		}
		else if(bmi>=18.5 && bmi<=24.9) {
			System.out.println("Normal weight");
		}
		else if(bmi>=25 && bmi<=29.9) {
			System.out.println("Overweight");
		}
		else if(bmi >= 30.0) {
			System.out.println("Obesity");
		}
		
	}
}


