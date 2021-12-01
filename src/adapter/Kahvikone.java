package adapter;

public class Kahvikone implements Laitteet110V {

    @Override
    public void start(int voltage) {
        System.out.println("Kahvikone käynnistyy, jännite " + voltage + " V.");
    }

}
