public class Automobil extends Vozilo {
    private int brojVrata;

    public Automobil(String marka, double brzina, int brojVrata) {
        super(marka, brzina);
        this.brojVrata = brojVrata;
    }

    @Override
    public String kretanje() {
        return "Automobil " + marka + ", s " + brojVrata + " vrata, kreće se brzinom od " + brzina + " km/h.";
    }
}
