import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class App{
    public static void main (String[] args) {
        Console myConsole = System.console();

        Animals scooby = new Animals("Scobby", "dog", "White", 4, true);
        Animals mylo = new Animals("Mylo", "cat", "Brown", 2, false);
        Animals stray = new Animals("Stray", "dog", "Black", 7, false);
        Animals bibble = new Animals("Bibble", "cat", "Golden", 1, true);

        List<Animals> allAnimals = new ArrayList<Animals>();
            allAnimals.add(scooby);
            allAnimals.add(mylo);
            allAnimals.add(stray);
            allAnimals.add(bibble);

        boolean whileLoop = true;

        while (whileLoop) {

            System.out.println("Welcome to the animal adoption center! Where would you like to go?");
            System.out.println("Please select a number: 1. View all animals. 2. Choose a species. 3. Add a new animal. 4.Exit Application");
            int navigation = Integer.parseInt(myConsole.readLine());


            if (navigation == 1) {

                for (Animals everyAnimal : allAnimals) {
                    System.out.println("-----------------------");
                    System.out.println("Name: " + everyAnimal.mName);
                    System.out.println("Species: " + everyAnimal.mSpecies);
                    System.out.println("Age: " + everyAnimal.mAge);
                    System.out.println("Color: " + everyAnimal.mColor);

                    if (everyAnimal.mAdopted == true) {
                        System.out.println("It can be adopted!");
                    } else {
                        System.out.println("Cannot be adopted at the moment!");
                    }
                }
            } else if (navigation == 2) {

                System.out.println("What species of animal would you like? ");

                String animalWanted = myConsole.readLine();

                for (Animals eachAnimal : allAnimals) {
                    if (eachAnimal.getAnimal(animalWanted)) {
                        System.out.println("-----------------------");
                        System.out.println("Name: " + eachAnimal.mName);
                        System.out.println("Species: " + eachAnimal.mSpecies);
                        System.out.println("Age: " + eachAnimal.mAge);
                        System.out.println("Color: " + eachAnimal.mColor);
//                boolean adoptedState = eachAnimal.mAdopted;

//                eachAnimal.adoptedOrNo(adoptedState);

                        if (eachAnimal.mAdopted == true) {
                            System.out.println("It can be adopted!");
                        } else {
                            System.out.println("Cannot be adopted at the moment!");
                        }
                    }
                }
            }else if( navigation == 3){

                System.out.println("Welcome admin! Too add a new pet fill in the following:");
                System.out.println("Please enter his/her name");
                    String enteredName = myConsole.readLine();
                System.out.println("Great please enter the species (eg: dog / cat): ");
                    String enteredSpecies = myConsole.readLine();
                System.out.println("Awesome! Now how old is " + enteredName);
                    int enteredAge = Integer.parseInt(myConsole.readLine());
                System.out.println("Finally, what is" + enteredName + " color?");
                    String enteredColor= myConsole.readLine();
                System.out.println("And of course he can be adopted!");

                Animals newAnimal = new Animals(enteredName, enteredSpecies, enteredColor, enteredAge, true);
                    allAnimals.add(newAnimal);

            }

            else if (navigation == 4) {
                whileLoop = false;
                System.out.println("Thank you for visiting our app! Come back soon");
            }

            else{
                System.out.println("Sorry! Invalid choice");
            }
        }
    }
}