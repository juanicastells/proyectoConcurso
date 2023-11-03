package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Rol;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepositoryLong;
import com.example.demo.repository.UsuarioRepositoryString;

//Finalmente para aplicar inserción de registro importamos Service y Autowired; 
@Service
public class UsuarioBusiness implements IUsuarioBusiness {
    //Referenciamos a nuestro IProductRepository e invocamos al método save del paquete JPARepository.

    @Autowired
    UsuarioRepositoryLong usuarioRepositoryLong;
    @Autowired
    UsuarioRepositoryString usuarioRepositoryString;

    @Override
    public Usuario insertUsuario(Usuario usuario) {
        //save del paquete JPARepository.
        return usuarioRepositoryString.save(usuario);
    }

    public void deleteUsuario(String usuarioId) {//el usuarioId es el mail
        usuarioRepositoryString.deleteById(usuarioId);
    }


    public Usuario actualizarNombreUsuario(String usuarioId, String nuevoNombre) {
        Usuario usuario = usuarioRepositoryString.findById(usuarioId).orElse(null);
        if (usuario != null) {
            usuario.setApellidoNombre(nuevoNombre);
            return usuarioRepositoryString.save(usuario);
        } else {
            //caso en el que el usuario no se encuentra.
            return null;
        }
    }

    public Usuario asignarRol (String usuarioId, Rol rol) {
        Usuario usuario = usuarioRepositoryString.findById(usuarioId).orElse(null);
        if (usuario != null) {
            usuario.setRol(rol);
            return usuarioRepositoryString.save(usuario);
        } else {
            //caso en el que el usuario no se encuentra.
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
