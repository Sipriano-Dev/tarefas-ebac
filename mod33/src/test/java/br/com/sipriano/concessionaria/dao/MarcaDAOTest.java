package br.com.sipriano.concessionaria.dao;

import br.com.sipriano.concessionaria.domain.Marca;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarcaDAOTest {

    @Test
    public void deveSalvarMarca() {
        Marca marca = new Marca();
        marca.setNome("Toyota");

        MarcaDAO marcaDAO = new MarcaDAO();
        marca = marcaDAO.cadastrar(marca);

        assertNotNull(marca);
        assertNotNull(marca.getId());
        assertEquals("Toyota", marca.getNome());
    }

    @Test
    public void deveBuscarMarcaPorId() {
        Marca marca = new Marca();
        marca.setNome("BMW");

        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.cadastrar(marca);

        Marca marcaEncontrada = marcaDAO.buscarPorId(marca.getId());

        assertNotNull(marcaEncontrada);
        assertEquals("BMW", marcaEncontrada.getNome());
    }


}