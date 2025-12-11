package br.com.sipriano.vendasonline;

import br.com.sipriano.vendasonline.domain.Produto;
import org.junit.Assert;
import org.junit.Test;

import br.com.sipriano.vendasonline.dao.IProdutoDAO;
import br.com.sipriano.vendasonline.dao.ProdutoDAO;


public class ProdutoTest {

    private IProdutoDAO produtoDAO;

    public ProdutoTest() {
        produtoDAO = new ProdutoDAO();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setNome("Pc Gamer");
        produto.setCategoria("Eletrônicos");

        produto = produtoDAO.cadastrar(produto);

        Assert.assertNotNull(produto);
        Assert.assertNotNull(produto.getId());
        Assert.assertEquals("Pc Gamer", produto.getNome());

    }

}