import java.io.Console;

public class App{
    public static void main (String[] args){
        Console myConsole = System.console();

        Animals scooby = new Animals("Scobby", "dog", "White", 4, true);
        Animals mylo = new Animals("Mylo", "cat", "Brown", 2, false);
        Animals stray = new Animals("Stray", "dog", "Black", 7, false);
        Animals bibble = new Animals("Bibble", "cat", "Golden", 1, true);

        Animals[] allAnimals = {scooby, mylo, stray, bibble};

        System.out.println("What species of animal would you like? ");

        String animalWanted = myConsole.readLine();

        for ( Animals eachAnimal : allAnimals) {
            if (eachAnimal.getAnimal(animalWanted)) {
                System.out.println("-----------------------");
                System.out.println("Name: " + eachAnimal.mName);
                System.out.println("Species: " + eachAnimal.mSpecies);
                System.out.println("Age: " + eachAnimal.mAge);
                System.out.println("Color: " + eachAnimal.mColor);
                if ( eachAnimal.mAdopted == true){
                    System.out.println("It can be adopted!");
                }else {
                    System.out.println("Cannot be adopted at the moment!");
                }
            }
        }
    }
}