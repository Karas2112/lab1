import java.util.Date;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Animal dog = new Animal("szczur");
        Animal cat = new Animal("felis");

        dog.name = "Poppy";
        dog.weight = 10.0;
        dog.age = 5;
        dog.alive = false;
        cat.name = "Cezary";
        cat.age = 19;

        cat.introduceYourself();

        System.out.println("waga kota: " + cat.weight);
        cat.doYouLike("mouse");

        Integer humanage = cat.getHumanAge();
        System.out.println("If I'll be human I'll be " + humanage + " years old");

        dog.introduceYourself();

        dog.doYouLike("mouse");

        Car pierdzikółko = new Car();
        pierdzikółko.producer = "Peugeot";
        pierdzikółko.model = "308SW";
        pierdzikółko.mileage = 123000.0;
        pierdzikółko.doorsQuantity = 5;
        pierdzikółko.value = 200000.0;

        Human me = new Human();
        me.firstName = "Bartosz";
        me.lastName = "Karaś";
        me.pet = cat;
        me.setSalary(5000.0);
        System.out.println("I have a " + me.pet.species);
        System.out.println("I call it  " + me.pet.name);
        me.setCar(pierdzikółko);
        System.out.println("I have a car, which is " + me.getCar().producer + " " + me.getCar().model);
        System.out.println("It has " + me.getCar().doorsQuantity + " doors and I was driving it for the last " + me.getCar().mileage + "km");
        System.out.println(me.pet.weight);
        me.pet.feed();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        System.out.println(me.pet.weight);
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();



    }

}
