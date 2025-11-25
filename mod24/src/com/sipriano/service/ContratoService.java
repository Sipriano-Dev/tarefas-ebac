package com.sipriano.service;

import com.sipriano.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Encontrado";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizado";
    }

    @Override
    public String deletar() {
        contratoDao.deletar();
        return "Deletado";
    }
}
