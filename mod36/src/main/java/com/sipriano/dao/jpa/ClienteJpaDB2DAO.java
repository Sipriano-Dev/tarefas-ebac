/**
 * 
 */
package com.sipriano.dao.jpa;

import com.sipriano.dao.generic.jpa.GenericJpaDB2DAO;
import com.sipriano.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
