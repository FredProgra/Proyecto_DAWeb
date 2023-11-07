package edu.pe.cibertec.Proyecto_DAWeb.Controller.admi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admi/producto")

public class ProductoController {
    @GetMapping("/frmproducto")
    public String frmproducto(){
        return "/admi/frmproducto";
    }
}
