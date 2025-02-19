public abstract class Vozilo {
    public String marka;
    public double brzina;

    public Vozilo(String marka, double brzina) {
        this.marka = marka;
        this.brzina = brzina;
    }

    public String getMarka() {
        return marka;
    }

    public double getBrzina() {
        return brzina;
    }

    public abstract String kretanje();

}