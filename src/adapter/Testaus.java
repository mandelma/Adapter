package adapter;

public class Testaus {
    public static void main(String[] args) {
        Laitteet220V televisio = new Televisio();
        televisio.start(220);
        System.out.println("---------------------");

        Laitteet220V musiikkikeskus = new Musiikkikeskus();
        musiikkikeskus.start(220);
        System.out.println("----------------------");

        Laitteet220V uuni = new Uuni();
        uuni.start(220);
        System.out.println("-----------------------");

        Laitteet220V suoristusrauta = new VoltageAdapter(new Suoristusrauta());
        suoristusrauta.start(110);
        System.out.println("------------------------");

        Laitteet220V kahvikone = new VoltageAdapter(new Kahvikone());
        kahvikone.start(110);
    }
}
