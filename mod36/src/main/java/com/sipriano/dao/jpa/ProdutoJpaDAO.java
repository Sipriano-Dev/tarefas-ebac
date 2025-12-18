/**
 * 
 */
package com.sipriano.dao.jpa;

import com.sipriano.dao.generic.jpa.GenericJpaDB1DAO;
import com.sipriano.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
