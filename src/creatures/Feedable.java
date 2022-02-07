package creatures;

public interface Feedable {
    public default void feed() {
    }

    public void feed(Double foodWeight);

}
