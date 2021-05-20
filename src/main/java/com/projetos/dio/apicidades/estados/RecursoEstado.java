package com.projetos.dio.apicidades.estados;

import java.util.List;

import com.projetos.dio.apicidades.estados.repositorio.RepositorioEstados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estados")
public class RecursoEstado {

    @Autowired
    private RepositorioEstados rep;

    @GetMapping
    public List<Estado> estados() {
        return rep.findAll();
    }
}