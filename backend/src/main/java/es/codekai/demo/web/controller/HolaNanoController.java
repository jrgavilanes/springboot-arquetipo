package es.codekai.demo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaNanoController {
    @GetMapping("/hola")
    public String saludar() {
        return "que pasa jula!";
    }
}
