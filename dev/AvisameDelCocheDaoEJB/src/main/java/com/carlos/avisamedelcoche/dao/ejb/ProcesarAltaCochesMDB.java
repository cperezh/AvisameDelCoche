package com.carlos.avisamedelcoche.dao.ejb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.carlos.avisamedelcochebusiness.Coche;

/**
 * Message-Driven Bean implementation class for: AltaCochesMDB
 */
@MessageDriven(activationConfig = { @ActivationConfigProperty(propertyName = "destination", propertyValue = "altaCochesQueue"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue") }, mappedName = "altaCochesQueue")
public class ProcesarAltaCochesMDB implements MessageListener {

	static final Logger logger = LogManager.getLogger(ProcesarAltaCochesMDB.class.getName());

	public ProcesarAltaCochesMDB() {

	}

	/**
	 * @see MessageListener#onMessage(Message)
	 */
	public void onMessage(Message message) {
		Coche coche;

		logger.info("Mensaje de alta coche recibido");

		try {
			coche = message.getBody(Coche.class);
			logger.info("Coche recibido: "+coche.getMatricula());

		} catch (JMSException ex) {
			logger.info(ex);
		}
	}

}
