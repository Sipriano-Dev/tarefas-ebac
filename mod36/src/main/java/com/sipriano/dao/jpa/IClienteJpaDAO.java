/**
 * 
 */
package com.sipriano.dao.jpa;

import com.sipriano.dao.generic.jpa.IGenericJapDAO;
import com.sipriano.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
