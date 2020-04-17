class Animals{
        public String mName;
        public String mSpecies;
        public String mColor;
        public int mAge;
        public boolean mAdopted;

        public Animals(String name, String species, String color, int age, boolean adopted){
            mName = name;
            mSpecies = species;
            mColor = color;
            mAge = age;
            mAdopted = adopted;
        }
        public boolean getAnimal(String animalWanted){
                return (animalWanted.equals(mSpecies));
        }
}