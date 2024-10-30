package com.mx.apiDiscos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.apiDiscos.dao.DiscosDao;
import com.mx.apiDiscos.model.Discos;


@Service
public class DiscosImp implements DiscosServ {
    
    // Inyección de dependencia para el DAO de Discos
    @Autowired
    DiscosDao discosDao;

    @Transactional(readOnly=true)
    @Override
    public List<Discos> listar() {
        return discosDao.findAll();
    }

    @Transactional
    @Override
    public void guardar(Discos disco) {
        discosDao.save(disco);
    }

    @Transactional(readOnly=true)
    @Override
    public Discos buscar(Integer id) {
        return discosDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void editar(Discos disco) {
        discosDao.save(disco);
    }

    @Transactional
    @Override
    public void eliminar(Integer id) {
        discosDao.deleteById(id);
    }
}
