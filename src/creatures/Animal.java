package creatures;

public abstract class Animal implements Feedable{
    private static final double DEFAULT_FOOD_WEIGHT = 1.;
    String species;
    String name;
    Double weight;
    Integer age;
    Boolean alive;

    public Animal(String species) {
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


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Double getWeight() {
        return weight;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getSpecies() {
        return species;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }




    public void introduceYourself() {
        System.out.println("I'm " + this.name);
    }

    public void doYouLike(String foodType) {
        if (this.species == "felis" && foodType == "mouse") {
            System.out.println("yes, i like " + foodType);
        } else {
            System.out.println("no you idiot");
        }

    }

    public Integer getHumanAge() {
        if (this.species == "szczur") {
            return this.age * 7;
        } else {
            return this.species == "felis" ? this.age * 10 : this.age;
        }
    }

    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }
    public void feed(Double foodWeight){
        if(this.weight <= 0){
            System.out.println("Za późno na karmienie, zwierzak nie żyje... ");
        }
        else{
            this.weight += foodWeight;
            System.out.println("mniam ");
        }
    }

    public void takeForAWalk() {
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

