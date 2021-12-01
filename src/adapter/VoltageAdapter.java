package adapter;

public class VoltageAdapter implements  Laitteet220V {
    private int currentVoltage;
    private Laitteet110V laitteet;

    public VoltageAdapter(Laitteet110V laitteetUSA) {
        this.laitteet = laitteetUSA;
        this.currentVoltage = 220;
    }

    @Override
    public void start(int voltage) {
        System.out.println("Käytetään adapteria -->");

        System.out.println("Laite tarvitse jännitettä 110 V");
        while(currentVoltage != voltage) {
            currentVoltage -= 10;
            System.out.println("Virtaa alennetaan --> " + currentVoltage);
        }
        laitteet.start(110);
    }
}
