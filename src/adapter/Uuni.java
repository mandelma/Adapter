package adapter;

public class Uuni implements Laitteet220V {
    @Override
    public void start(int voltage) {
        System.out.println("Uuni käynnistyy, jännite " + voltage + " V.");
    }
}
