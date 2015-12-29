package com.carlos.avisamedelcochedaoejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Queue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.carlos.avisamedelcochebusiness.Coche;

/**
 * Session Bean implementation class AltaCocheJMS
 */
@Stateless
public class AltaCocheJMS {

	@Resource(lookup = "jndi/altaCochesQueueFactory")
	ConnectionFactory connectionFactory;
	@Resource(lookup = "altaCochesQueue")
	Queue queue;

	// Tipo de cola: queue
	final Destination dest = (Destination) queue;

	static final Logger logger = LogManager.getLogger(AltaCocheJMS.class.getName());


	/**
	 * Envia coches a la cola para el alta
	 * 
	 * @param coche
	 */
	public void altaCoche(Coche coche) {

		connectionFactory.createContext().createProducer().send(queue, coche);

	}

}
