import java.util.*;
class first{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int year =sc.nextInt();
        int y=0;

        if((year%4==0) &&((year % 400==0)||( year % 100 !=0 ))){
             y++;
        }

        switch(y){
        case 0:
            System.out.println("Not a leap year");
            break;
        case 1:
            System.out.println("Leap year");
            break;
        }
       
    }
}