package sk.stuba.fei.oop.skuska.bojoveVozidlo.vozidlo;

import lombok.Data;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.delo.VelkeDelo;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.podvozok.Pasovy;

@Data
public class Delostrelectvo extends Vozidlo{
    private Pasovy podvozok;
    private VelkeDelo delo;

    public Delostrelectvo(int ID, String nazovVozidla, int narodnost, double cena, Pasovy podvozok, VelkeDelo delo) {
        super(ID, nazovVozidla, narodnost, cena);
        this.podvozok = podvozok;
        this.delo = delo;
    }
}
