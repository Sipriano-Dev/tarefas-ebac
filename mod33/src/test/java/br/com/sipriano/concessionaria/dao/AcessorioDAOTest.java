package br.com.sipriano.concessionaria.dao;

import br.com.sipriano.concessionaria.domain.Acessorio;
import br.com.sipriano.concessionaria.domain.Carro;
import br.com.sipriano.concessionaria.domain.Marca;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcessorioDAOTest {

    @Test
    public void deveSalvarAcessorioComCarro() {

        Marca marca = new Marca();
        marca.setNome("Ford");
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.cadastrar(marca);

        Carro carro = new Carro();
        carro.setModelo("Focus");
        carro.setAno(2018);
        carro.setCor("Preto");
        carro.setMarca(marca);
        CarroDAO carroDAO = new CarroDAO();
        carroDAO.cadastrar(carro);

        Acessorio ac = new Acessorio();
        ac.setNome("Ar Condicionado");
        ac.setCarro(carro);

        AcessorioDAO acDAO = new AcessorioDAO();
        acDAO.cadastrar(ac);

        assertNotNull(ac);
        assertNotNull(ac.getCarro());
        assertNotNull(ac.getCarro().getMarca());
        assertEquals("Ar Condicionado", ac.getNome());
        assertEquals("Focus", ac.getCarro().getModelo());
        assertEquals("Ford", ac.getCarro().getMarca().getNome());

    }

    @Test
    public void deveBuscarAcessorioPorId() {

        Marca marca = new Marca();
        marca.setNome("Chevrolet");
        MarcaDAO marcaDAO = new MarcaDAO();
        marca = marcaDAO.cadastrar(marca);

        Carro carro = new Carro();
        carro.setModelo("Onix");
        carro.setAno(2019);
        carro.setCor("Preto");
        carro.setMarca(marca);
        CarroDAO carroDAO = new CarroDAO();
        carroDAO.cadastrar(carro);

        Acessorio ac = new Acessorio();
        ac.setNome("Multimídia");
        ac.setCarro(carro);
        AcessorioDAO acDAO = new AcessorioDAO();
        ac = acDAO.cadastrar(ac);

        Acessorio encontrado = acDAO.buscarPorId(ac.getId());

        assertNotNull(encontrado);
        assertEquals("Multimídia", encontrado.getNome());
        assertEquals("Onix", encontrado.getCarro().getModelo());
        assertEquals("Chevrolet", encontrado.getCarro().getMarca().getNome());
    }


}