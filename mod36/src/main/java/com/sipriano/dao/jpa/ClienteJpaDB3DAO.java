/**
 * 
 */
package com.sipriano.dao.jpa;

import com.sipriano.dao.generic.jpa.GenericJpaDB3DAO;
import com.sipriano.domain.jpa.ClienteJpa2;

public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}
