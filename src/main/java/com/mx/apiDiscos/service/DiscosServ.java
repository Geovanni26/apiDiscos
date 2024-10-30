package com.mx.apiDiscos.service;

import java.util.List;

import com.mx.apiDiscos.model.Discos;

public interface DiscosServ {
    // Declaración de métodos vacíos para CRUD

    public List<Discos> listar();

    public void guardar(Discos disco);

    public Discos buscar(Integer id);

    public void editar(Discos disco);

    public void eliminar(Integer id);

}
