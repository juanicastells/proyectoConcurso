package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Rol;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;


@Service
public class UsuarioBusiness{
    
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario insertUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(String usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }

    public Usuario actualizarNombreUsuario(String usuarioId, String nuevoNombre) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);
        if (usuario != null) {
            usuario.setApellidoNombre(nuevoNombre);
            return usuarioRepository.save(usuario);
        } else {
            return null;
        }
    }

    public Usuario asignarRol (String usuarioId, Rol rol) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);
        if (usuario != null) {
            usuario.setRol(rol);
            return usuarioRepository.save(usuario);
        } else {
            return null;
        }
    }

    //CONCURSANTE
    //subirMaterial
    
    //VISITANTE
    //darLike
    
    //EVALUADOR
    //completarRubrica
        
}
