/* 15. Write a program to print the following pattern: 
   
			   * 
			  * * 
			 * * * 
			* * * * 
		   * * * * *           */
		 
		 
class fifteenth {
    public static void main(String[] args) {
        int n = 5; // no. of rows

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            
            // to print stars with spaces in b/w
            for (int k = 0; k < i; k++) {
                if (k > 0) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
