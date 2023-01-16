package es.cifpcm.demoDaliThyme.web;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SaludandoController {
    @GetMapping("/greeting")
    public String saludando(@RequestParam(name="nombre", required=false, defaultValue = "a todos") String name, Model model){
        model.addAttribute("nameAtributo", name);
        return "saludos";
    }
}
