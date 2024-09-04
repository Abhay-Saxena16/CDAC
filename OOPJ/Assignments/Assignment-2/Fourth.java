import java.util.Scanner;

class Fourth{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month number:  ");
		int num = sc.nextInt();


    switch (num){
        case 1:  
        case 11:  
        case 12: 
            System.out.println("Winter");
            break;
        case 2:  
        case 3:  
        case 4:  
            System.out.println("Spring");
            break;
        case 5:  
        case 6:  
        case 7: 
	case 8:  
            System.out.println("Summer");
            break;
        case 9:  
        case 10:  
            System.out.println("Autumn");
            break;
        default:
            System.out.println("Invalid month number.");
            break;

		}
		
	}
}


