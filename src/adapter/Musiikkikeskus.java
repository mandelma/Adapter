package adapter;

public class Musiikkikeskus implements Laitteet220V {
    @Override
    public void start(int voltage) {
        System.out.println("Musiikkikeskus käynnistyy, jännite " + voltage + " V.");
    }

}
