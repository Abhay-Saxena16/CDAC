/* 26. Write a program to print the following pattern: 
		
		1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15 		*/
		 
		 
class twentysixth{
    public static void main(String[] args) {
        int n = 5; // no. of rows
		int k = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print(k+" ");
				k++;
            }
			System.out.println();
        }
    }
}
