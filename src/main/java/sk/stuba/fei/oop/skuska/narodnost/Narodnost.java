package sk.stuba.fei.oop.skuska.narodnost;

import lombok.Data;


public enum Narodnost {

    USA(1,"USA"),
    ZSSR(2,"ZSSR"),
    NEMECKO(3,"Nemecko"),
    GB(4,"Velka Britania");

    private int hodnota;
    private String nazov;

    Narodnost(int hodnota, String nazov) {
        this.hodnota = hodnota;
        this.nazov = nazov;
    }


}
