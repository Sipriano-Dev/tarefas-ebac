package br.com.sipriano.concessionaria.dao;

import br.com.sipriano.concessionaria.domain.Carro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarroDAO {

    private static final EntityManagerFactory EMF =
            Persistence.createEntityManagerFactory("mod33");

    private EntityManager getEntityManager() {
        return EMF.createEntityManager();
    }

    public Carro cadastrar(Carro carro) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(carro);
            em.getTransaction().commit();
            return carro;
        } finally {
            if (em.isOpen()) em.close();
        }
    }

    public Carro buscarPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Carro.class, id);
        } finally {
            if (em.isOpen()) em.close();
        }
    }

    public static void closeFactory() {
        if (EMF.isOpen()) EMF.close();
    }
}


