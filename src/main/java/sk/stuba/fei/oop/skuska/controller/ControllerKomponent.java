package sk.stuba.fei.oop.skuska.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sk.stuba.fei.oop.skuska.ServiceAPI;

@Data
@Controller
public class ControllerKomponent {

    private final ServiceAPI serviceAPI;
    @Autowired
    public ControllerKomponent(ServiceAPI serviceAPI) {
        this.serviceAPI = serviceAPI;
    }

    @GetMapping("kartaKomponentov")
    public String komponent( Model model) {


        return "kartaKomponent";
    }

    @GetMapping("kartaVeza")
    public String veza( Model model) {

        model.addAttribute("veza",serviceAPI.getListVezi());
        return "kartaVeza";
    }

    @GetMapping("kartaVeza/detail/{id}")
    public String detailVeza(@PathVariable int id, Model model) {


        model.addAttribute("vezaDetail", serviceAPI.getListVezi().get(id));

        return "detailVeza";
    }

    @GetMapping("kartaPodvozok")
    public String podvozok( Model model) {

        model.addAttribute("podvozok",serviceAPI.getListPodvozok());
        return "kartaPodvozok";
    }

    @GetMapping("kartaPodvozok/detail/{id}")
    public String detailPodvozok(@PathVariable int id, Model model) {


        model.addAttribute("podvozokDetail", serviceAPI.getListPodvozok().get(id));

        return "detailPodvozok";
    }


    @GetMapping("kartaDela")
    public String delo( Model model) {

        model.addAttribute("delo",serviceAPI.getListDelo());
        return "kartaDelo";
    }

    @GetMapping("kartaDela/detail/{id}")
    public String detailDelo(@PathVariable int id, Model model) {


        model.addAttribute("deloDetail", serviceAPI.getListDelo().get(id));

        return "detailDelo";
    }


}
