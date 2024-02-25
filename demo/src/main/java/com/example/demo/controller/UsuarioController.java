package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.business.UsuarioBusiness;
import com.example.demo.entity.Usuario;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioBusiness usuarioBusiness;

    @GetMapping("/registro")
    public String registro() {
        return "registro";
    }

    @GetMapping("/usuarioRegistrado")
    public String usuarioRegistrado() {
        return "usuarioRegistrado";
    }

    @PostMapping("/registro")
    public String altaUsuario(Usuario usuario) {
        usuarioBusiness.insertUsuario(usuario);
        return "usuarioRegistrado";  
    }

    @GetMapping("/listaUsuarios")
    public String mostrarListaDeUsuarios(Model model) {
        List<Usuario> usuarios = usuarioBusiness.obtenerTodosLosUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "listaUsuarios";
    }

    @PostMapping("/eliminarUsuario/{mail}")
    public String eliminarUsuario(@PathVariable String mail){
        usuarioBusiness.deleteUsuario(mail);
        return "usuarioEliminado";
    }

    @PostMapping("/formularioModificarUsuario")
    public String formularioModificarUsuario() {
        return "formularioModificarUsuario";
    }
    
    @PostMapping ("/buscarUsuario/{mail}")
    public String buscarUsario (@PathVariable String mail, Model model){
        Usuario usuario = usuarioBusiness.obtenerPorMail(mail);

        if (usuario != null) {
            model.addAttribute("usuario", usuario);
            return "formularioModificarUsuario";
        } else {
            // Puedes agregar un mensaje de error si el usuario no se encuentra
            model.addAttribute("error", "Usuario no encontrado");
            return "modificacion";
        }
    }

}