// Q 5. Write a program to print the Fibonacci sequence up to the number 21. 

class fifth{
    public static void main(String[] args) {
	
		int n1 = 0 , n2 = 1 , n3 , i , count = 21;
		
		for(i=1;i<=21;i++){
			n3 = n1 + n2;
			System.out.println("Fibonacci sequence up to the number 21 : " + n1);
			n1 = n2;
			n2 = n3;
			
		}

    }
}
