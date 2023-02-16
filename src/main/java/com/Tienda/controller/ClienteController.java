package com.Tienda.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ClienteController {

    @GetMapping("/")
    public String inicio(Model model) {

        var variable = "Saludos desde el Back End";
        model.addAttribute("variable", variable);

        return "Semana 4";
    }
}