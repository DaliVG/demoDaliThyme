package es.cifpcm.demoDaliThyme.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PlanetasoController {
    @GetMapping("/mostrado")
    public String mostrado(@RequestParam(name="planeta", required=false) String name, Model model){
        model.addAttribute("planeta", name);
        return "mostrar";
    }
}
