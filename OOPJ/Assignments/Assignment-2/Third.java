import java.util.Scanner;

class Third{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:  ");
		int age = sc.nextInt();
		System.out.println("Your age is: "+age);
	
		if(age < 18){
			System.out.println("Cannot Vote");
		}
		else if(age >=18 ) {
			System.out.println("You can Vote");
		}
		
	}
}


