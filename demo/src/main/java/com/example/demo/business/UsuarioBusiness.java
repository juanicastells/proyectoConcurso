package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;

//Finalmente para aplicar inserción de registro importamos Service y Autowired; 
@Service
public class UsuarioBusiness implements IUsuarioBusiness {
    //Referenciamos a nuestro IProductRepository e invocamos al método save del paquete JPARepository.

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario insertUsuario(Usuario usuario) {
        //save del paquete JPARepository.
        return usuarioRepository.save(usuario);
    }
    
}
