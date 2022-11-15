package controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }

    @RequestMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }
}
