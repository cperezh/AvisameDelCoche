/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Pakno
 */
public class Avisador {
	
	static final Logger logger = LogManager.getLogger(Avisador.class.getName());

    /**
     * Envía un mensaje al usuario del sistema. Para ello, obtiene su email y le
     * envía el mensaje que recibe como parametro
     *
     * @param mensaje
     * @throws MessagingException
     */
    public static void avisarUsuario(Coche coche){
    	
        String emailUsuario = Usuario.obtenerEmail();
        
        Mensaje mensaje = componerMensaje(coche);

        enviarEmail(emailUsuario, mensaje);
    }
    
    private static Mensaje componerMensaje(Coche coche) {

        Mensaje mensaje = new Mensaje();
        String textoParcial = "";
        String nuevalinea = System.getProperty("line.separator");

        for (EstadoComponente estadoComponente : coche.getEstadoComponentes()) {

            textoParcial = mensaje.getTextoMensaje().concat(estadoComponente.getComponente().getNombre());

            textoParcial = textoParcial.concat(nuevalinea);

            mensaje.setTextoMensaje(textoParcial);
        }

        mensaje.setTextoMensaje(textoParcial);

        return mensaje;
    }


    private static void enviarEmail(String emailUsuario, Mensaje mensaje){

        // create some properties and get the default Session
        Properties mailProps = new Properties();
        mailProps.put("mail.smtps.host", "smtp.gmail.com");
        mailProps.put("mail.smtps.port", "465");
        mailProps.put("mail.transport.protocol", "smtps");

        Session session = Session.getInstance(mailProps, null);

        MimeMessage msg = new MimeMessage(session);

        try{
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
        catch(MessagingException ex){
        	logger.error("Error al enviar mensaje. Email: "+emailUsuario+" Mensaje: "+mensaje);
        }
    }

}
