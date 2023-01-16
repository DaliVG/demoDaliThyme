package es.cifpcm.demoDaliThyme.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Controller
public class PlanetasController {
    @GetMapping("/")
    public String index(Model model){
        List<String> Planetas = new ArrayList<String>();
        Planetas.add("jeje");
        Planetas.add("jejde");
        model.addAttribute("Planetas", Planetas);
        return "index";
    }
}
