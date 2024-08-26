/* Write a program to calculate the discount based on the total purchase amount. Use the following criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount.  */

class DiscountCalculator{
    public static void main(String[] args) {
        
        // total purchase amount
        double totalAmount = 600;
        
        // Variable to store the discount rate
        double discountRate;
        
        // Determine discount rate based on the total amount
        if (totalAmount >= 1000) {
            discountRate = 0.20; // 20% discount
        } else if (totalAmount >= 500) {
            discountRate = 0.10; // 10% discount
        } else {
            discountRate = 0.05; // 5% discount
        }
        
        // Calculate the discount and final amount
        double discount = totalAmount * discountRate;
        double finalAmount = totalAmount - discount;
        
        // Output the results
        System.out.println("Total Purchase Amount: Rs. " + totalAmount);
        System.out.println("Discount Applied: Rs. " + discount);
        System.out.println("Final Amount After Discount: Rs. " + finalAmount);
        
    }
}
