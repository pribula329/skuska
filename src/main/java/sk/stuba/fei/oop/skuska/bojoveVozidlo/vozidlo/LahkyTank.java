package sk.stuba.fei.oop.skuska.bojoveVozidlo.vozidlo;

import lombok.Data;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.Veza;

import sk.stuba.fei.oop.skuska.bojoveVozidlo.podvozok.Kolesovy;
import sk.stuba.fei.oop.skuska.narodnost.Narodnost;
@Data
public class LahkyTank extends Vozidlo {

    private Kolesovy typPodvozku;
    private Veza malaVeza;

    public LahkyTank(int ID, String nazovVozidla, int narodnost, double cena, Kolesovy typPodvozku, Veza malaVeza) {
        super(ID, nazovVozidla, narodnost, cena);
        this.typPodvozku = typPodvozku;
        this.malaVeza = malaVeza;
    }

}
