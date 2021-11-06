public class Animal {
    String species;
    String name;
    Double weight;
    Integer age;
    Boolean alive;

    Animal(String species) {
        this.species = species;
        this.alive = true;
        System.out.println("zwierze utworzoned");
        if (this.species == "szczur") {
            this.weight = 10.0;
        } else if (this.species == "felis") {
            this.weight = 6.0;
        } else {
            this.weight = 1.0;
        }

    }

    void introduceYourself() {
        System.out.println("I'm " + this.name);
    }

    void doYouLike(String foodType) {
        if (this.species == "felis" && foodType == "mouse") {
            System.out.println("yes, i like " + foodType);
        } else {
            System.out.println("no you idiot");
        }

    }

    Integer getHumanAge() {
        if (this.species == "szczur") {
            return this.age * 7;
        } else {
            return this.species == "felis" ? this.age * 10 : this.age;
        }
    }

    void feed() {
        if (this.alive) {
            System.out.println("You fed your animal, its weight skyrockets xD");
            this.weight = this.weight + 1.0;
        }
        else {
            System.out.println("u can't feed dead animal retard");
        }

    }

    void takeForAWalk() {
        if (this.alive) {
            System.out.println("You took your animal for a walk, its weight lowers");
            this.weight = this.weight - 1.0;
            if (this.weight <= 0.0) {
                this.alive = false;
                System.out.println("u idiot, u killed ur pet...");
            }
        }
        else {
                System.out.println("u can't take dead animal for a walk retard");
        }
    }
    public String toString(){
        return species+" "+name+" "+weight+" "+age+" "+alive;
    }
}

