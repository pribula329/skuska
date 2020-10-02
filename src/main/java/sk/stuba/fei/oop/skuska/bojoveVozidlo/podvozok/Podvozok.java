package sk.stuba.fei.oop.skuska.bojoveVozidlo.podvozok;

import lombok.Data;


@Data
public abstract class Podvozok  {

    private int ID;
    private String nazov;
    private int nosnosť;
    private double rýchlosťOtáčania;
    private double maximálnaRýchlosť;

    public Podvozok() {
    }

    public Podvozok(int ID, String nazov, int nosnosť, double rýchlosťOtáčania, double maximálnaRýchlosť) {
        this.ID = ID;
        this.nazov = nazov;
        this.nosnosť = nosnosť;
        this.rýchlosťOtáčania = rýchlosťOtáčania;
        this.maximálnaRýchlosť = maximálnaRýchlosť;
    }
}
