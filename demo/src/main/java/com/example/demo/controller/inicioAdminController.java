package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class inicioAdminController {
    @GetMapping("/inicioAdmin")
    public String inicioAdmin() {
        return "inicioAdmin";
    }
}
