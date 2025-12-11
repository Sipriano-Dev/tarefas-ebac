package br.com.sipriano.concessionaria.dao;

import br.com.sipriano.concessionaria.domain.Acessorio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AcessorioDAO {

    private static final EntityManagerFactory EMF =
            Persistence.createEntityManagerFactory("mod33");

    private EntityManager getEntityManager() {
        return EMF.createEntityManager();
    }

    public Acessorio cadastrar(Acessorio ac) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(ac);
            em.getTransaction().commit();
            return ac;
        } finally {
            if (em.isOpen()) em.close();
        }
    }

    public Acessorio buscarPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Acessorio.class, id);
        } finally {
            if (em.isOpen()) em.close();
        }
    }

    public static void closeFactory() {
        if (EMF.isOpen()) EMF.close();
    }
}
