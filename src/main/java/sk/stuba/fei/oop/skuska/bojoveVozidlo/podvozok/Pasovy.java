package sk.stuba.fei.oop.skuska.bojoveVozidlo.podvozok;

public class Pasovy extends Podvozok {
    private double sirkaPasu;

    public Pasovy(int ID, String nazov, int nosnosť, double rýchlosťOtáčania, double maximálnaRýchlosť, double sirkaPasu) {
        super(ID, nazov, nosnosť, rýchlosťOtáčania, maximálnaRýchlosť);
        this.sirkaPasu = sirkaPasu;
    }
}
