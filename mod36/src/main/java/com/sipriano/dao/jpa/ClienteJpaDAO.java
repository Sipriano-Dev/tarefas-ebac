/**
 * 
 */
package com.sipriano.dao.jpa;

import com.sipriano.dao.generic.jpa.GenericJpaDB1DAO;
import com.sipriano.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
