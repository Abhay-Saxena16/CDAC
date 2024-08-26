class DayOfWeek {
    public static void main(String[] args) {
        
        int day = 2;

        switch(day) {
            case 1:
                System.out.print("Monday : ");
                switch(day) {
                    case 1:
                        System.out.println("Weekday");
                        break;
                }
                break;
            case 2:
                System.out.print("Tuesday : ");
                switch(day) {
                    case 2:
                        System.out.println("Weekday");
                        break;
                }
                break;
            case 3:
                System.out.print("Wednesday : ");
                switch(day) {
                    case 3:
                        System.out.println("Weekday");
                        break;
                }
                break;
            case 4:
                System.out.print("Thursday : ");
                switch(day) {
                    case 4:
                        System.out.println("Weekday");
                        break;
                }
                break;
            case 5:
                System.out.print("Friday : ");
                switch(day) {
                    case 5:
                        System.out.println("Weekday");
                        break;
                }
                break;
            case 6:
                System.out.print("Saturday : ");
                switch(day) {
                    case 6:
                        System.out.println("Weekend");
                        break;
                }
                break;
            case 7:
                System.out.print("Sunday : ");
                switch(day) {
                    case 7:
                        System.out.println("Weekend");
                        break;
                }
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                break;
        }
        
    }
}
