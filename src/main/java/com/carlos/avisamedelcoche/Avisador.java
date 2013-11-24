/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Pakno
 */
class Avisador {

    static void avisarUsuario() {
        String emailUsuario = Usuario.obtenerEmail();
        
        enviarEmail(emailUsuario);
    }

    private static void enviarEmail(String emailUsuario) {
     MimeMessage mensaje;   
     Transport transporte;
    }

}
