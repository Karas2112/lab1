package devices;

public class Phone {
    public double display_size;
    public String producer;
    public String model;
    public String platform;
    public Integer rom_memory;

    public Phone(){
    }

    public String toString() {
        return producer + " " + model + " " + platform + " " + display_size + " " + rom_memory +"GB";
    }

}