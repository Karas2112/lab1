package creatures;

public class Pet extends Animal implements Feedable{
    private static final double DEFAULT_FOOD_WEIGHT = 1.;


    public Pet(String species) {
        super(species);
    }


    @Override
    public void feed(Double foodWeight) {
        if(this.weight <= 0){
            System.out.println("Za późno na karmienie, zwierzak nie żyje... ");
        }
        else{
            this.weight += foodWeight;
            System.out.println("mniam ");
        }
    }
}
