package com.mycompany.evidencia2;

public class AuthControllerTest {

    @Test
    public void testLogin() {
        String usuario = "admin";
        String contraseña = "1234";
        String resultadoEsperado = "Login exitoso";
        String resultadoActual = login(usuario, contraseña);
        assertEquals(resultadoEsperado, resultadoActual);
            }
        
            private void assertEquals(String resultadoEsperado, String resultadoActual) {
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
        
            private String login(String usuario, String contraseña) {
        if ("admin".equals(usuario) && "1234".equals(contraseña)) {
            return "Login exitoso";
        }
        return "Credenciales inválidas";
    }
}
