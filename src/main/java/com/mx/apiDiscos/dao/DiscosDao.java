package com.mx.apiDiscos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.apiDiscos.model.Discos;

// JpaRepository incluye los métodos CRUD y soporte para paginación.
public interface DiscosDao extends JpaRepository<Discos, Integer> {
    
}