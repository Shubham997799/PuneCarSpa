package CarSpa;
import java.util.*;

public class CarStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Car Service Station");
            System.out.println("1. Buy a Car");
            System.out.println("2. Sell a Car");
            System.out.println("3. Service a Car");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    BuyCarService buyCarService = new BuyCarService();
                    buyCarService.buyCar(scanner);
                    break;
                case 2:
                    SellCarService sellCarService = new SellCarService();
                    sellCarService.sellCar(scanner);
                    break;
                case 3:
                    ServiceCarService serviceCarService = new ServiceCarService();
                    serviceCarService.serviceCar(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using our service. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
