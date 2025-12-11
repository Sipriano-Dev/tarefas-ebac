package br.com.sipriano.concessionaria.dao;

import br.com.sipriano.concessionaria.domain.Marca;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MarcaDAO {

    private static final EntityManagerFactory EMF =
            Persistence.createEntityManagerFactory("mod33");

    private EntityManager getEntityManager() {
        return EMF.createEntityManager();
    }

    public Marca cadastrar(Marca marca) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(marca);
            em.getTransaction().commit();
            return marca;
        } finally {
            if (em.isOpen()) em.close();
        }
    }

    public Marca buscarPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Marca.class, id);
        } finally {
            if (em.isOpen()) em.close();
        }
    }

    public static void closeFactory() {
        if (EMF.isOpen()) EMF.close();
    }


}
