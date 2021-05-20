package com.projetos.dio.apicidades.cidades;

import com.projetos.dio.apicidades.cidades.repositorio.RepositorioCidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class RecursoCidade {

    @Autowired
    private RepositorioCidades rep;

    @GetMapping
    public Page<Cidade> cities(final Pageable page) {
        return rep.findAll(page);
    }
}
