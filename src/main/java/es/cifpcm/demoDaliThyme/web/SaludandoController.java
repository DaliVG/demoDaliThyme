package es.cifpcm.demoDaliThyme.web;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SaludandoController {
    @GetMapping("/greeting")
    public String saludando(@RequestParam(name="planeta", required=false, defaultValue = "patokill.jpg") String name, Model model){
        model.addAttribute("planeta", name);
        return "saludos";
    }
}
