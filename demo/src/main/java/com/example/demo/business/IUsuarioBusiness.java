package com.example.demo.business;

import com.example.demo.entity.Usuario;
import com.example.demo.entity.Rol;

public interface IUsuarioBusiness {
    Usuario insertUsuario(Usuario usuario);
    void deleteUsuario (String mail);
    Usuario actualizarNombreUsuario(String usuarioId, String nuevoNombre);
    Usuario asignarRol (String usuarioId, Rol rol);
}