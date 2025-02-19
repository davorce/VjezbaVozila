import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vozilo> listaVozila = new ArrayList<>();
        listaVozila.add(new Automobil("Volvo", 250, 5));
        listaVozila.add(new Bicikl("Trek", 40, "planinski"));

        for (Vozilo popisVozila : listaVozila) {
            System.out.println(popisVozila.kretanje());
        }

    }
}