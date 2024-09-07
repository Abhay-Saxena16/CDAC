// Design Employee class, inside that create instances, display details of employees, eg empid, name, address, salary

import java.util.Scanner;
import java.lang.*;


class Employee{
	int empid;
	String empname;
	String empcity;
	
	
	public void getrecord(){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter employee id: ");
	empid = sc.nextInt();
 	sc.nextLine(); 
	System.out.println("Enter employee name : ");
	empname = sc.nextLine();
	System.out.println("Enter employee city : ");
	empcity = sc.nextLine();
	
	}
	
	public void postrecord(){
	System.out.println("Employee id is: "+empid);
	System.out.println("Employee name is: "+empname);
	System.out.println("Employee city is: "+empcity);
		
	}
	
	
}

class assign{
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.getrecord();
		emp1.postrecord();

		Employee emp2 = new Employee();
		emp2.getrecord();
		emp2.postrecord();
		
//		sc.close();
		

		}
}