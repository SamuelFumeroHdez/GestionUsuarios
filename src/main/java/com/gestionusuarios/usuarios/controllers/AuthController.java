package com.gestionusuarios.usuarios.controllers;

import com.gestionusuarios.usuarios.dao.UsuarioDAO;
import com.gestionusuarios.usuarios.models.Usuario;
import com.gestionusuarios.usuarios.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class AuthController {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Autowired
    JWTUtil jwtUtil;

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String loginUsuario(@RequestBody Usuario usuario){

        Usuario usuarioLogueado = usuarioDAO.obtenerUsuarioPorCredenciales(usuario);
        if(usuarioLogueado != null){

            String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueado.getId()), usuarioLogueado.getEmail());
            return tokenJwt;
        }
        return "FAIL";

    }
}
