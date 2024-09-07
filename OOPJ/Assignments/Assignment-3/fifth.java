import java.util.Scanner;

class TollBoothRevenueManager {
    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int numberOfCars;
    private int numberOfTrucks;
    private int numberOfMotorcycles;
    private double totalRevenue;
    private int totalVehicles;

    public void setTollRates() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the toll rate for a Car : ");
        carRate = sc.nextDouble();

        System.out.println("Enter the toll rate for a Truck : ");
        truckRate = sc.nextDouble();

        System.out.println("Enter the toll rate for a Motorcycle : ");
        motorcycleRate = sc.nextDouble();
    }

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Cars passing through: ");
        numberOfCars = sc.nextInt();

        System.out.println("Enter the number of Trucks passing through: ");
        numberOfTrucks = sc.nextInt();

        System.out.println("Enter the number of Motorcycles passing through: ");
        numberOfMotorcycles = sc.nextInt();
    }

 
    public void calculateRevenue() {
        totalRevenue = (numberOfCars * carRate) + (numberOfTrucks * truckRate) + (numberOfMotorcycles * motorcycleRate);
        totalVehicles = numberOfCars + numberOfTrucks + numberOfMotorcycles;
    }

    public void printRecord() {
        System.out.printf("Total number of vehicles: %d\n", totalVehicles);
        System.out.printf("Total revenue collected: %.2f\n", totalRevenue);
    }
}

public class fifth{
    public static void main(String[] args) {
        TollBoothRevenueManager manager = new TollBoothRevenueManager();
        
        manager.setTollRates();
        
        manager.acceptRecord();
        
        manager.calculateRevenue();
        
        manager.printRecord();
    }
}
