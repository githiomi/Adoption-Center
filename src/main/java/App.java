import java.io.Console;

public class App{
    public static void main (String[] args){
        Console myConsole = System.console();

        Animals Scobby = new Animals();
            Scobby.mName = "Scobby";
            Scobby.mSpecies = "Dog";
            Scobby.mAge = 1;
            Scobby.mColor = "White";


        Animals Mylo = new Animals();
            Mylo.mName = "Mylo";
            Mylo.mSpecies = "Cat";
            Mylo.mAge = 1;
            Mylo.mColor = "White";

        Animals[] allAnimals = {Scobby, Mylo};

        System.out.println("What species of animal would you like? ");
        String animalWanted = myConsole.readLine();

        for ( Animals eachAnimal : allAnimals) {
            if (eachAnimal.getAnimal(animalWanted)) {
                System.out.println("-----------------------");
                System.out.println("Name: " + eachAnimal.mName);
                System.out.println("Species: " + eachAnimal.mSpecies);
                System.out.println("Age: " + eachAnimal.mAge);
                System.out.println("Color: " + eachAnimal.mColor);
            }
        }
    }
}