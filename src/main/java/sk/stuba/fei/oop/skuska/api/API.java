package sk.stuba.fei.oop.skuska.api;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import sk.stuba.fei.oop.skuska.ServiceAPI;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.Veza;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.delo.MaleDelo;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.delo.VelkeDelo;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.podvozok.Kolesovy;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.podvozok.Pasovy;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.vozidlo.Delostrelectvo;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.vozidlo.LahkyTank;
import sk.stuba.fei.oop.skuska.bojoveVozidlo.vozidlo.TazkyTank;

@Data

public class API {
/*
    private final ArrayList<Vozidlo> listVozidiel = new ArrayList<Vozidlo>();
    private final ArrayList<Veza> listVezi = new ArrayList<Veza>();
    private final ArrayList<Podvozok> listPodvozok = new ArrayList<>();
    private final ArrayList<Delo> listDelo = new ArrayList<>();
*/


    private final ServiceAPI serviceAPI;
    @Autowired
    public API(ServiceAPI serviceAPI) {
        this.serviceAPI = serviceAPI;

    }

    public void vytvorLahkyTank(String nazovVozidla, int narodnost, double cena, int podvozok, int malaVeza)
    {
        Kolesovy kolesa = (Kolesovy) serviceAPI.getListPodvozok().get(podvozok);
        LahkyTank lahkyTank = new LahkyTank(serviceAPI.getListVozidiel().size(), nazovVozidla, narodnost, cena, kolesa, serviceAPI.getListVezi().get(malaVeza));
        serviceAPI.getListVozidiel().add(lahkyTank);
    }

    public void vytvorTazkyTank( String nazovVozidla, int narodnost, double cena, int podvozok, int velkaVeza)
    {
        Pasovy kolesa = (Pasovy) serviceAPI.getListPodvozok().get(podvozok);
        TazkyTank tazkyTank = new TazkyTank(serviceAPI.getListVozidiel().size(), nazovVozidla, narodnost, cena, kolesa, serviceAPI.getListVezi().get(velkaVeza));
        serviceAPI.getListVozidiel().add(tazkyTank);
    }

    public void vytvorDelostrelectvo(String nazovVozidla, int narodnost, double cena, int podvozok, int velkaVeza)
    {
        VelkeDelo delo = (VelkeDelo) serviceAPI.getListDelo().get(velkaVeza);
        Pasovy kolesa = (Pasovy) serviceAPI.getListPodvozok().get(podvozok);
        Delostrelectvo delostrelectvo = new Delostrelectvo(serviceAPI.getListVozidiel().size(), nazovVozidla, narodnost, cena, kolesa, delo);
        serviceAPI.getListVozidiel().add(delostrelectvo);
    }


    public void vytvorPodvozokPasovy( String nazov, int nosnosť, double rýchlosťOtáčania, double maximálnaRýchlosť, double sirkaPasu)
    {
       Pasovy pasovy= new Pasovy( serviceAPI.getListPodvozok().size(), nazov,  nosnosť,  rýchlosťOtáčania, maximálnaRýchlosť, sirkaPasu);
       serviceAPI.getListPodvozok().add(pasovy);
    }
    public void vytvorPodvozokKolesovy( String nazov, int nosnosť, double rýchlosťOtáčania, double maximálnaRýchlosť, int pocetKolies)
    {
        Kolesovy kolesovy= new Kolesovy(serviceAPI.getListPodvozok().size(), nazov,  nosnosť,  rýchlosťOtáčania, maximálnaRýchlosť, pocetKolies);
        serviceAPI.getListPodvozok().add(kolesovy);
    }

    public void vytvorVezaMaleDelo( String nazov, double rýchlosťOtáčania, int dohľad, String nazov1,int kaliber, int kadencia, double rozptyl, int pocetNabojov)
    {
        MaleDelo maleDelo = new MaleDelo(serviceAPI.getListDelo().size(), nazov1, kaliber, kadencia,rozptyl, pocetNabojov);
        Veza veza = new Veza(serviceAPI.getListVezi().size(), nazov,  rýchlosťOtáčania,  dohľad, maleDelo);
        serviceAPI.getListDelo().add(maleDelo);
        serviceAPI.getListVezi().add(veza);
    }

    public void vytvorVezaVelkeDelo( String nazov, double rýchlosťOtáčania, int dohľad, String nazov1, int kaliber, int kadencia, double rozptyl, int polomerVybuchu)
    {
        VelkeDelo velkeDelo = new VelkeDelo(serviceAPI.getListDelo().size(), nazov1, kaliber, kadencia,rozptyl, polomerVybuchu);
        Veza veza = new Veza(serviceAPI.getListVezi().size(), nazov,  rýchlosťOtáčania,  dohľad, velkeDelo);
        serviceAPI.getListDelo().add(velkeDelo);
        serviceAPI.getListVezi().add(veza);
    }

/*
    @GetMapping("kartaVozidiel")
    public String vozidla( Model model) {

        model.addAttribute("vozidla",serviceAPI.getListVozidiel());



        return "kartaVozidiel";
    }
*/




}
