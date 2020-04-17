public class App{
    public static void main (String[] args){

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

        for ( Animals eachAnimal : allAnimals){
            System.out.println("-----------------------");
            System.out.println("Name: " + eachAnimal.mName);
            System.out.println("Species: " + eachAnimal.mSpecies);
            System.out.println("Age: " + eachAnimal.mAge);
            System.out.println("Color: " + eachAnimal.mColor);
        }
    }
}