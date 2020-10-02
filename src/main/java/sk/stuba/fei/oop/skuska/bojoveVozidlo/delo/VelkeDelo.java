package sk.stuba.fei.oop.skuska.bojoveVozidlo.delo;

import lombok.Data;

@Data
public class VelkeDelo extends Delo {

    private int polomerVybuchu;

    public VelkeDelo(int ID, String nazov, int kaliber, int kadencia, double rozptyl, int polomerVybuchu) {
        super(ID, nazov, kaliber, kadencia, rozptyl);
        this.polomerVybuchu = polomerVybuchu;
    }
}
