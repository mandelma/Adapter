package adapter;

public class Suoristusrauta implements Laitteet110V {

    @Override
    public void start(int voltage) {
        System.out.println("Suoristusrauta käynnistyy, jännite " + voltage + " V.");
    }
}
