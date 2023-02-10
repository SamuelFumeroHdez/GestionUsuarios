package com.gestionusuarios.usuarios.dao;

import com.gestionusuarios.usuarios.models.Usuario;

import java.util.List;

public interface UsuarioDAO {

    List<Usuario> getUsuarios();
    void eliminar(Long id);

    void insertUsuarios(Usuario usuario);

    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
