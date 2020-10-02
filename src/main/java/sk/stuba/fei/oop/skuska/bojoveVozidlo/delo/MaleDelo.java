package sk.stuba.fei.oop.skuska.bojoveVozidlo.delo;

import lombok.Data;

@Data
public class MaleDelo extends Delo {

    private int pocetNabojov;

    public MaleDelo(int ID, String nazov, int kaliber, int kadencia, double rozptyl, int pocetNabojov) {
        super(ID, nazov, kaliber, kadencia, rozptyl);
        this.pocetNabojov = pocetNabojov;
    }
}
