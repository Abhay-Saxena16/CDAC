/* 25. Write a program to print the following pattern: 
		
		1 
		12 
		123 
		1234
		12345		*/
		 
		 
class twentyfifth{
    public static void main(String[] args) {
        int n = 5; // no. of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print(j);
            }
			System.out.println();
        }
    }
}
