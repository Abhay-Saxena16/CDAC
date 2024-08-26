// Q 4. Write a program to reverse the digits of the number 1234. The output should be 4321.

class fourth{
    public static void main(String[] args) {

		int num = 1234;
		int rev = 0;
		
		while(num != 0){
		int r = num%10;
		rev = rev*10 + r;
		num = num /10;
		}
        System.out.println("The reversed number is: " + rev);
    }
}
