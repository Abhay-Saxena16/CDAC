import java.util.Scanner;

class Bmitracker{
float weight;
float height;
float bmi;
String Result;

public void acceptRecord(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter weight: ");
	weight = sc.nextFloat();
	System.out.println("Enter height: ");
	height = sc.nextFloat();
	
}

public void calculatebmi(){
	bmi = weight / (height * height) ;
}

public void classifybmi(){ 
	if(bmi < 18.5){
		Result = "Underweight";
	}
	else if(bmi>=18.5 && bmi<24.9){
		Result = "Normal weight";}
	else if(bmi>=25 && bmi<29.9){
		Result = "Overweight";	}
		else {Result = "Obese";}
		
}

public void printRecord() {
	System.out.println("BMI is: "+bmi);
	System.out.println("Classification: "+Result);
}
}

public class third{
	public static void main(String[] args){
		Bmitracker u1 = new Bmitracker();
		u1.acceptRecord();
		u1.calculatebmi();
		u1.classifybmi();
		u1.printRecord();
		
		
	}
}