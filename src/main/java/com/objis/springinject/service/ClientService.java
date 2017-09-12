package com.objis.springinject.service;

import com.objis.springinject.dao.IClientDao;
import com.objis.springinject.domaine.Client;

public class ClientService {
	
	IClientDao dao; //Injection de l'interface : couplage faible

	
	public IClientDao getDao() {
		return dao;
	}



	public void setDao(IClientDao dao) {
		this.dao = dao;
	}
	
	
	

	public String insererClient(Client client) {
		return dao.ajouterClient(client);
	}








	

}
