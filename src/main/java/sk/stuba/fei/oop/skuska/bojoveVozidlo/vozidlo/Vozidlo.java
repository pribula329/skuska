package sk.stuba.fei.oop.skuska.bojoveVozidlo.vozidlo;

import lombok.Data;
import sk.stuba.fei.oop.skuska.narodnost.Narodnost;
@Data
public abstract class Vozidlo {
    protected int ID;
    protected String nazovVozidla;
    protected Narodnost narodnost;
    protected double cena;

    public Vozidlo() {
    }

    public Vozidlo(int ID, String nazovVozidla, int hodnotaNarodnosti, double cena) {
        this.ID = ID;
        this.nazovVozidla = nazovVozidla;
        if (hodnotaNarodnosti==1)
        {
            this.narodnost = narodnost.USA;
        }
        else if (hodnotaNarodnosti==2)
        {
            this.narodnost = narodnost.ZSSR;
        }
        else if (hodnotaNarodnosti==3)
        {
            this.narodnost = narodnost.NEMECKO;
        }
        else if (hodnotaNarodnosti==4)
        {
            this.narodnost = narodnost.GB;
        }
        else
        {
            throw new ArithmeticException("Chyba");
        }

        this.cena = cena;
    }

}
