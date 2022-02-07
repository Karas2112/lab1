package creatures;

interface Edible {
     void beEaten();
}

public class FarmAnimal extends Animal {

    FarmAnimal(String species) {
        super(species);
    }

    void beEaten() {

    }

    @Override
    public void feed(Double foodWeight) {

    }
}
