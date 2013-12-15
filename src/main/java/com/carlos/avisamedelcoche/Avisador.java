/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Pakno
 */
class Avisador {

    /**
     * Envía un mensaje al usuario del sistema. Para ello, obtiene su email y le
     * envía el mensaje que recibe como parametro
     *
     * @param mensaje
     * @throws MessagingException
     */
    static void avisarUsuario(Mensaje mensaje) throws MessagingException {
        String emailUsuario = Usuario.obtenerEmail();

        enviarEmail(emailUsuario, mensaje);
    }

    private static void enviarEmail(String emailUsuario, Mensaje mensaje) throws MessagingException {

        // create some properties and get the default Session
        Properties mailProps = new Properties();
        mailProps.put("mail.smtps.host", "smtp.gmail.com");
        mailProps.put("mail.smtps.port", "465");
        mailProps.put("mail.transport.protocol", "smtps");

        Session session = Session.getInstance(mailProps, null);

        MimeMessage msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(emailUsuario));
        InternetAddress[] address = {new InternetAddress(emailUsuario)};
        msg.setRecipients(Message.RecipientType.TO, address);
        msg.setSubject("Avisame del coche - Lista de repacion");
        msg.setSentDate(new Date());
        // If the desired charset is known, you can use
        // setText(text, charset)
        msg.setText(mensaje.getTextoMensaje());

        Transport tr = session.getTransport();
        tr.connect("cperezh@gmail.com", "M0t1v377");
        tr.sendMessage(msg, address);
    }

}
