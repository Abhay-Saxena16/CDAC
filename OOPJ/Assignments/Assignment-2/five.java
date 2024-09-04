import java.util.Scanner;
public class five{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape to calculate its area:");
        System.out.println("1-Circle");
        System.out.println("2-Square");
        System.out.println("3-Rectangle");
        System.out.println("4-Triangle");

        System.out.print("Enter the number according to your choice: ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter the radius of circle: ");
                double radius = scanner.nextDouble();
                double cArea = Math.PI * radius * radius;
                System.out.printf("The area of the circle is: %.2f\n", cArea);
                break;

            case 2:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                double sArea = side * side;
                System.out.printf("The area of the square is: %.2f\n", sArea);
                break;

            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rArea = length * width;
                System.out.printf("The area of the rectangle is: %.2f\n", rArea);
                break;

            case 4:
                System.out.print("Enter the length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double tArea = 0.5 * base * height;
                System.out.printf("The area of the triangle is: %.2f\n", tArea);
                break;

            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
                break;
        }

    }
}
