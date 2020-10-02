package sk.stuba.fei.oop.skuska.bojoveVozidlo.delo;

import lombok.Data;


@Data
public abstract class Delo{

    protected int ID;
    protected String nazov;
    protected int kaliber;
    protected int kadencia;
    protected double rozptyl;

    public Delo() {
    }

    public Delo(int ID, String nazov, int kaliber, int kadencia, double rozptyl) {
        this.ID = ID;
        this.nazov = nazov;
        this.kaliber = kaliber;
        this.kadencia = kadencia;
        this.rozptyl = rozptyl;
    }
}
