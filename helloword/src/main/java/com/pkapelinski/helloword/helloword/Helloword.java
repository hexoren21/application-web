package com.pkapelinski.helloword.helloword;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // rodzaj beana (typu klasy zarządzanej przez Spring)
public class Helloword
{

    @RequestMapping("/hello") // wskazanie pod jakim adresem dostępna jest metoda
    public String hello()
    { // sygnatura metody
        return "Hello World!\nbeng beng :)";
    }
}