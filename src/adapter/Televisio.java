package adapter;

public class Televisio implements Laitteet220V {
    @Override
    public void start(int voltage) {
        System.out.println("Televisio käynnistyy, jännite " + voltage + " V.");
    }
}
