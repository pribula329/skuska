package sk.stuba.fei.oop.skuska.bojoveVozidlo.vozidlo;

import lombok.Data;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.Veza;

import sk.stuba.fei.oop.skuska.bojoveVozidlo.podvozok.Pasovy;
import sk.stuba.fei.oop.skuska.narodnost.Narodnost;

@Data
public class TazkyTank extends Vozidlo {
    private Pasovy podvozok;
    private Veza velkaVeza;

    public TazkyTank(int ID, String nazovVozidla, int narodnost, double cena, Pasovy podvozok, Veza velkaVeza) {
        super(ID, nazovVozidla, narodnost, cena);
        this.podvozok = podvozok;
        this.velkaVeza = velkaVeza;
    }
}
