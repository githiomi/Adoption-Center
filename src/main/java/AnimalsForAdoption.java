class Animals{
        public String mName;
        public String mSpecies;
        public String mColor;
        public int mAge;

        public boolean getAnimal(String animalWanted){
                return (animalWanted.equals(mSpecies));
        }
}