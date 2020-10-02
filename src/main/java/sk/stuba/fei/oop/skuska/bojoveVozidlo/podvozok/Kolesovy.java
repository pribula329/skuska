package sk.stuba.fei.oop.skuska.bojoveVozidlo.podvozok;

public class Kolesovy extends Podvozok {
    private int pocetKolies;

    public Kolesovy(int ID, String nazov, int nosnosť, double rýchlosťOtáčania, double maximálnaRýchlosť, int pocetKolies) {
        super(ID, nazov, nosnosť, rýchlosťOtáčania, maximálnaRýchlosť);
        this.pocetKolies = pocetKolies;
    }
}
