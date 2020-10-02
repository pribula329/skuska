package sk.stuba.fei.oop.skuska;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sk.stuba.fei.oop.skuska.api.API;

import javax.validation.Valid;

@Slf4j
@Controller
@SpringBootApplication

public class SkuskaApplication implements CommandLineRunner {

    private final ServiceAPI serviceAPI;
    @Autowired
    public SkuskaApplication(ServiceAPI serviceAPI) {
        this.serviceAPI = serviceAPI;
    }




    public static void main(String[] args) {

        SpringApplication.run(SkuskaApplication.class, args);
        log.info("Open in browser: http://localhost:8080");
    }

    @GetMapping
    public String index(  Model model) {


        return "index";
    }

    @Override
    public void run(String... args) throws Exception {
        API api = new API(serviceAPI);
        api.vytvorVezaMaleDelo("male veza",35,25,"male delo",10,35,35,35);
        api.vytvorVezaVelkeDelo("velka veza", 45,55,"velke delo",52,35,38,12);
        api.vytvorPodvozokKolesovy("kolesa",85,85,55,5);
        api.vytvorPodvozokPasovy("pas",85,33,55,10);
        api.vytvorLahkyTank("T-21",1,8500,0,0);
        api.vytvorTazkyTank("TAzky",2,3588,1,1);

    }





}
