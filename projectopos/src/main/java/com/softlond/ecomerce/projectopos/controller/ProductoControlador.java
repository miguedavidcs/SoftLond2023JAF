package com.softlond.ecomerce.projectopos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
public class ProductoControlador {
    @GetMapping("")
    public String show(){
        return "productos/show";
    }
    
}
