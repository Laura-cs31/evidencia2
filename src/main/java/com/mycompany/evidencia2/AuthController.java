package com.mycompany.evidencia2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestParam String usuario, @RequestParam String contraseña) {
        if ("admin".equals(usuario) && "1234".equals(contraseña)) {
            return "Login exitoso";
        }
        return "Credenciales inválidas";
    }

    @PostMapping("/register")
    public String register(@RequestParam String usuario, @RequestParam String contraseña) {
        return "Usuario registrado: " + usuario;
    }
}
