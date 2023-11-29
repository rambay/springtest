package com.empresa.iglesia.controller;

import com.empresa.iglesia.modelo.Usuario;
import com.empresa.iglesia.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioRepositorio ur;

    @GetMapping("/")
    public String listarUsuario(Model model) {
        List<Usuario> usuarios = (List<Usuario>) ur.findAll();
        model.addAttribute("usuarios", usuarios);
        return "index";
    }

}
