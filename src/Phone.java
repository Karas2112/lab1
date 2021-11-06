public class Phone {
    String producer;
    String model;
    String platform;
    Integer rom_memory;
    Double display_size;

    public Phone(){
    }

    public String toString() {
        return producer + " " + model + " " + platform + " " + display_size + " " + rom_memory +"GB";
    }

}