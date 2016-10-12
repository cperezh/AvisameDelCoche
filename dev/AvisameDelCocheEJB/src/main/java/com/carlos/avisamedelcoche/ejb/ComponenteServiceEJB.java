package com.carlos.avisamedelcoche.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.carlos.avisamedelcoche.dao.DAOComponente;
import com.carlos.avisamedelcoche.service.ComponenteService;
import com.carlos.avisamedelcochebusiness.Componente;

@Stateless
public class ComponenteServiceEJB implements ComponenteService {

	@EJB
	DAOComponente daoComponente;
	
	public List<Componente> getComponentes(){
		return daoComponente.getComponentes();
	}
}
