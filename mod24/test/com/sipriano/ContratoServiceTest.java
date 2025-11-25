package com.sipriano;

import com.sipriano.dao.ContratoDao;
import com.sipriano.dao.IContratoDao;
import com.sipriano.dao.mocks.ContratoDaoMock;
import com.sipriano.service.ContratoService;
import com.sipriano.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        Assert.assertEquals("Sucesso", service.salvar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        Assert.assertEquals("Sucesso", service.salvar());
    }
    //Buscar
    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        Assert.assertEquals("Encontrado", service.buscar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        Assert.assertEquals("Encontrado", service.buscar());
    }

    //Atualizar
    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        Assert.assertEquals("Atualizado", service.atualizar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        Assert.assertEquals("Atualizado", service.atualizar());
    }

    //Deletar
    @Test
    public void deletarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        Assert.assertEquals("Deletado", service.deletar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoDeletarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        Assert.assertEquals("Deletado", service.deletar());
    }


}
