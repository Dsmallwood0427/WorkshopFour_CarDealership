import com.ps.Dealership;
import com.ps.Vehicle;

import java.util.List;
import java.util.Scanner;


    public static void main(String[] args) {
        Dealership dealership = new Dealership();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. List all vehicles");
            System.out.println("2. Add a vehicle");
            System.out.println("3. Remove a vehicle");
            System.out.println("4. Find vehicles by price range");
            System.out.println("5. Find vehicles by make/model");
            System.out.println("6. Find vehicles by year");
            System.out.println("7. Find vehicles by color");
            System.out.println("8. Find vehicles by mileage range");
            System.out.println("9. Find vehicles by type");
            System.out.println("10. Quit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    List<Vehicle> vehicles = dealership.listAllVehicles();
                    if (vehicles.isEmpty()) {
                        System.out.println("No vehicles available.");
                    } else {
                        for (Vehicle v : vehicles) {
                            System.out.println(v);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter make: ");
                    String make = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();
                    System.out.print("Enter mileage: ");
                    int mileage = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter type: ");
                    String type = scanner.nextLine();
                    dealership.addVehicle(new Vehicle(String make, String model, year, color, mileage, price, type));
                    System.out.println("Vehicle added.");
                    break;
                case 3:
                    System.out.print("Enter make: ");
                    String rmMake = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String rmModel = scanner.nextLine();
                    List<Vehicle> toRemove = dealership.findByMakeModel(rmMake, rmModel);
                    if (toRemove.isEmpty()) {
                        System.out.println("Vehicle not found.");
                    } else {
                        dealership.removeVehicle(toRemove.get(0)); // Remove the first match for simplicity
                        System.out.println("Vehicle removed.");
                    }
                    break;
                case 4:
                    System.out.print("Enter minimum price: ");
                    double minPrice = scanner.nextDouble();
                    System.out.print("Enter maximum price: ");
                    double maxPrice = scanner.nextDouble();
                    List<Vehicle> priceResults = dealership.findByPriceRange(minPrice, maxPrice);
                    if (priceResults.isEmpty()) {
                        System.out.println("No vehicles found in that price range.");
                    } else {
                        for (Vehicle v : priceResults) {
                            System.out.println(v);
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter make: ");
                    String fMake = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String fModel = scanner.nextLine();
                    List<Vehicle> makeModelResults = dealership.findByMakeModel(fMake, fModel);
                    if (makeModelResults.isEmpty()) {
                        System.out.println("No vehicles found.");
                    } else {
                        for (Vehicle v : makeModelResults) {
                            System.out.println(v);
                        }
                    }
                    break;
                case 6:
                    System.out.print("Enter year: ");
                    int fYear = scanner.nextInt();
                    List<Vehicle> yearResults = dealership.findByYear(fYear);
                    if (yearResults.isEmpty()) {
                        System.out.println("No vehicles found.");
                    } else {
                        for (Vehicle v : yearResults) {
                            System.out.println(v);
                        }
                    }
                    break;
                case 7:
                    System.out.print("Enter color: ");
                    String fColor = scanner.nextLine();
                    List<Vehicle> colorResults = dealership.findByColor(fColor);
                    if (colorResults.isEmpty()) {
                        System.out.println("No vehicles found.");
                    } else {
                        for (Vehicle v : colorResults) {
                            System.out.println(v);
                        }
                    }
                    break;
                case 8:
                    System.out.print("Enter minimum mileage: ");
                    int minMileage = scanner.nextInt();
                    System.out.print("Enter maximum mileage: ");
                    int maxMileage = scanner.nextInt();
                    List<Vehicle> mileageResults = dealership.findByMileageRange(minMileage, maxMileage);
                    if (mileageResults.isEmpty()) {
                        System.out.println("No vehicles found.");
                    } else {
                        for (Vehicle v : mileageResults) {
                            System.out.println(v);
                        }
                    }
                    break;