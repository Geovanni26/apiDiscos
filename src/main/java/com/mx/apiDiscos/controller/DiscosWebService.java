package com.mx.apiDiscos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.apiDiscos.model.Discos;
import com.mx.apiDiscos.service.DiscosImp;

@RestController // Marca esta clase como un controlador de REST
@RequestMapping(path="DiscosWebService") // Asigna las solicitudes web a este controlador
@CrossOrigin // Habilita la seguridad para que nuestra API sea accesible y segura
public class DiscosWebService {

    // Inyección de dependencia
    @Autowired
    DiscosImp discosImp;

    // Peticiones (get, post, etc.) para operaciones CRUD

    // URL: http://localhost:9000/DiscosWebService/listar
    @GetMapping(path="listar")
    public List<Discos> listar() {
        return discosImp.listar();
    }

    // @RequestBody convierte un JSON a objeto
    // URL: http://localhost:9000/DiscosWebService/guardar
    @PostMapping(path="guardar")
    public void guardar(@RequestBody Discos disco) {
        discosImp.guardar(disco);
    }

    // URL: http://localhost:9000/DiscosWebService/buscar
    @PostMapping(path="buscar")
    public Discos buscar(@RequestBody Discos disco) {
        return discosImp.buscar(disco.getId());
    }

    // URL: http://localhost:9000/DiscosWebService/editar
    @PostMapping(path="editar")
    public void editar(@RequestBody Discos disco) {
        discosImp.editar(disco);
    }

    // URL: http://localhost:9000/DiscosWebService/eliminar
    @PostMapping(path="eliminar")
    public void eliminar(@RequestBody Discos disco) {
        discosImp.eliminar(disco.getId());
    }
}

