package com.eventoapp.Interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    // Retornando requisição da camada de apresentação
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}