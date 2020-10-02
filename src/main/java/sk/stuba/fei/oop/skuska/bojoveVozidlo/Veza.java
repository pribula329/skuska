package sk.stuba.fei.oop.skuska.bojoveVozidlo;

import lombok.Data;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.delo.Delo;

@Data
public class Veza{
    private int ID;
    private String nazov;
    private double rýchlosťOtáčania;
    private int dohľad;
    private Delo typDela;

    public Veza(int ID, String nazov, double rýchlosťOtáčania, int dohľad, Delo typDela) {
        this.ID = ID;
        this.nazov = nazov;
        this.rýchlosťOtáčania = rýchlosťOtáčania;
        this.dohľad = dohľad;
        this.typDela = typDela;
    }
}
