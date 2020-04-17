import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class VehicleApp {
    public static void main(String[] args) {
        Console myConsole = System.console();

        Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
        Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
        Vehicle sedan = new Vehicle(2015, "Toyota", "Camry", 50000, 30000);
        Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
        Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);

        List <Vehicle> allVehicles = new ArrayList<Vehicle>();
            allVehicles.add(hatchback);
            allVehicles.add(suv);
            allVehicles.add(sedan);
            allVehicles.add(truck);
            allVehicles.add(crossover);

            while( true ) {
                System.out.println("Welcome to our car dealership.");
                System.out.println("What would you like to do? Enter the number: 1. All Vehicles or 2. Search Price or 3. Add a new Vehicle");
                int navigationChoice = Integer.parseInt(myConsole.readLine());

                if (navigationChoice == 1) {
                    for (Vehicle individualVehicle : allVehicles) {
                        System.out.println("----------------------");
                        System.out.println(individualVehicle.mYear);
                        System.out.println(individualVehicle.mBrand);
                        System.out.println(individualVehicle.mModel);
                        System.out.println(individualVehicle.mMiles);
                        System.out.println(individualVehicle.mPrice);
                    }

                } else if (navigationChoice == 2) {

                    System.out.println("Welcome to Search! How much are you willing to spend?");
                    String inputMax = myConsole.readLine();
                    int userMaxBudget = Integer.parseInt(inputMax);

                    for (Vehicle individualVehicle : allVehicles) {
                        if (individualVehicle.worthBuying(userMaxBudget)) {
                            System.out.println("----------------------");
                            System.out.println("Manufacture Year: " + individualVehicle.mYear);
                            System.out.println("Vehicle Brand: " + individualVehicle.mBrand);
                            System.out.println("Vehicle Model: " + individualVehicle.mModel);
                            System.out.println("Miles Covered: " + individualVehicle.mMiles);
                            System.out.println("Vehicle Price: " + individualVehicle.mPrice);
                        }
                    }

                } else if (navigationChoice == 3) {
                    System.out.println("Here you can add a new car:");
                    System.out.println("First give us which year it was manufactured?");
                    int enteredYear = Integer.parseInt(myConsole.readLine());
                    System.out.println("Awesome! So what is the brand?");
                    String enteredBrand = myConsole.readLine();
                    System.out.println("Great! what about the model?");
                    String enteredModel = myConsole.readLine();
                    System.out.println("Let's talk distance. How many miles has it traveled?");
                    int enteredMiles = Integer.parseInt(myConsole.readLine());
                    System.out.println("Finally, What is its price? ");
                    int enteredPrice = Integer.parseInt(myConsole.readLine());

                    System.out.println("Amazing! Here is your new Vehicle: ");

                    System.out.println("----------------------");
                    System.out.println("Manufacture Year: " + enteredYear);
                    System.out.println("Vehicle Brand: " + enteredBrand);
                    System.out.println("Vehicle Model: " + enteredModel);
                    System.out.println("Miles Covered: " + enteredMiles);
                    System.out.println("Vehicle Price: " + enteredPrice);

                    Vehicle newVehicle = new Vehicle(enteredYear, enteredBrand, enteredModel, enteredMiles, enteredPrice);
                    allVehicles.add(newVehicle);

                } else {
                    System.out.println("Sorry that is not within our options!");
                }
            }
    }
}