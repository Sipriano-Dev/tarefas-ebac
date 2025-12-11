package br.com.sipriano.concessionaria.dao;

import br.com.sipriano.concessionaria.domain.Carro;
import br.com.sipriano.concessionaria.domain.Marca;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroDAOTest {

    @Test
    public void deveSalvarCarroComMarca() {
        Marca marca = new Marca();
        marca.setNome("Honda");

        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.cadastrar(marca);

        Carro carro = new Carro();
        carro.setModelo("Civic");
        carro.setAno(2020);
        carro.setCor("Preto");
        carro.setMarca(marca);

        CarroDAO carroDAO = new CarroDAO();
        carro = carroDAO.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
        assertNotNull(carro.getMarca());
        assertEquals("Civic", carro.getModelo());
        assertEquals("Honda", carro.getMarca().getNome());
    }

    @Test
    public void deveBuscarCarroPorId() {
        Marca marca = new Marca();
        marca.setNome("Hyundai");

        MarcaDAO marcaDAO = new MarcaDAO();
        marca = marcaDAO.cadastrar(marca);

        Carro carro = new Carro();
        carro.setModelo("HB20");
        carro.setAno(2022);
        carro.setCor("Preto");
        carro.setMarca(marca);

        CarroDAO carroDAO = new CarroDAO();
        carroDAO.cadastrar(carro);

        Carro carroEncontrado = carroDAO.buscarPorId(carro.getId());

        assertNotNull(carroEncontrado);
        assertEquals("HB20", carroEncontrado.getModelo());
        assertEquals("Hyundai", carroEncontrado.getMarca().getNome());
    }

}