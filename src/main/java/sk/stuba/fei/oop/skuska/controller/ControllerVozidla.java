package sk.stuba.fei.oop.skuska.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sk.stuba.fei.oop.skuska.ServiceAPI;
@Controller
@Data
public class ControllerVozidla {

    private final ServiceAPI serviceAPI;
    @Autowired
    public ControllerVozidla(ServiceAPI serviceAPI) {
        this.serviceAPI = serviceAPI;
    }



    @GetMapping("kartaVozidiel")
    public String vozidla( Model model) {

        model.addAttribute("vozidla",serviceAPI.getListVozidiel());



        return "kartaVozidiel";
    }

    @GetMapping("kartaVozidiel/detail/{id}")
    public String detailVozidla(@PathVariable int id, Model model) {


        model.addAttribute("vozidloDetail", serviceAPI.getListVozidiel().get(id));

        return "detailVozidla";
    }
}
