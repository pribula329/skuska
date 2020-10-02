package sk.stuba.fei.oop.skuska;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.Veza;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.delo.Delo;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.podvozok.Podvozok;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.vozidlo.Vozidlo;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
@Data
public class ServiceAPI {
    private final ArrayList<Vozidlo> listVozidiel;
    private final ArrayList<Veza> listVezi;
    private final ArrayList<Podvozok> listPodvozok;
    private final ArrayList<Delo> listDelo;
}
