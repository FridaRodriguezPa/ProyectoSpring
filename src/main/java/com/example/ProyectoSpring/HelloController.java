package com.example.ProyectoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //Por el método get nos va a regresar una respuesta
    @GetMapping("/")
    public String index() {
        return "*cactus*";
    }
}
