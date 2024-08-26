/* Q.13. Write a program to draw the following pattern: 
		
			1 
			2*2 
			3*3*3 
			4*4*4*4 
			5*5*5*5*5 
			5*5*5*5*5 
			4*4*4*4 
			3*3*3 
			2*2                   */

class thirteenth{
    public static void main(String[] args) {
        int maxNumber = 5;
        
        // Draw the upper part of the pattern
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 0; j < i; j++) {
                if (j > 0) {
                    System.out.print("*");
                }
                System.out.print(i);
            }
            System.out.println();
        }
        
        // Draw the lower part of the pattern
        for (int i = maxNumber; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (j > 0) {
                    System.out.print("*");
                }
                System.out.print(i - 1);
            }
            System.out.println();
        }
    }
}

