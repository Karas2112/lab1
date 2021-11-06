package devices;

public class Car {
    public String producer;
    public String model;
    public Double mileage;
    public Integer doorsQuantity;
    public Double value;

    public Car(String producer, String model, Double mileage, Integer doorsQuantity, Double value) {
        this.producer=producer;
        this.model=model;
        this.mileage=mileage;
        this.doorsQuantity=doorsQuantity;
        this.value=value;
    }

    public String toString() {
        return producer + " " + model + " " + mileage + " " + doorsQuantity + " " + value;
    }
}