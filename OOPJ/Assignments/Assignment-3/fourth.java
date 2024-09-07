import java.util.Scanner;

class DiscountCalculator {
    private double originalPrice;
    private double discountRate;
    private double discountAmount;
    private double finalPrice;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the original price of the item : ");
        originalPrice = sc.nextDouble();

        System.out.println("Enter the discount percentage: ");
        discountRate = sc.nextDouble();
    }

    public void calculateDiscount() {
        discountAmount = originalPrice * (discountRate / 100);
        finalPrice = originalPrice - discountAmount;
    }

    public void printRecord() {
        System.out.printf("Discount Amount: %.2f\n", discountAmount);
        System.out.printf("Final Price: %.2f\n", finalPrice);
    }
}

public class fourth{
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        calculator.acceptRecord();
        calculator.calculateDiscount();
        calculator.printRecord();
    }
}