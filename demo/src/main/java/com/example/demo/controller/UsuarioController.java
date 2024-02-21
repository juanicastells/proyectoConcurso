package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.business.UsuarioBusiness;
import com.example.demo.entity.Usuario;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioBusiness usuarioBusiness;

    @GetMapping("/usuarioEncontrado")
    public String usuarioEncontrado() {
        return "usuarioEncontrado";
    }

    @GetMapping("/listaUsuarios")
    public String mostrarListaDeUsuarios(Model model) {
        List<Usuario> usuarios = usuarioBusiness.obtenerTodosLosUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "listaUsuarios";
    }

    @PostMapping("/listaUsuarios/{mail}")
    public String eliminarUsuario(@PathVariable String mail){
        usuarioBusiness.deleteUsuario(mail);
        return "usuarioEliminado";
    }

}
