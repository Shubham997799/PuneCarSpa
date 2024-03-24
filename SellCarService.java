package CarSpa;

import java.util.Scanner;

public class SellCarService {
    public void sellCar(Scanner scanner) {
        System.out.println("You have selected to sell a car.");
        System.out.print("Enter the make of the car: ");
        String make = scanner.nextLine();
        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();
        System.out.print("Enter the year of manufacture: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("You have sold your " + year + " " + make + " " + model);
        
        generateBill(make, model, year);
    }
    
    private void generateBill(String make, String model, int year) {
        System.out.println("--------- Bill ---------");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Amount Received: To be calculated");
        System.out.println("------------------------");
    }
}
