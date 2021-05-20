package com.projetos.dio.apicidades.paises;

import com.projetos.dio.apicidades.paises.Pais;
import com.projetos.dio.apicidades.paises.repositorio.RepositorioPaises;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/paises")
public class RecursoPais {

    @Autowired
    private RepositorioPaises rep;

    @GetMapping
    public Page<Pais> paises(Pageable pagina) {
        return rep.findAll(pagina);
    }

    @GetMapping("/{id}")
    public ResponseEntity recuperar(@PathVariable Long id) {
        Optional<Pais> o = rep.findById(id);

        if (o.isPresent())
            return ResponseEntity.ok().body(o.get());
        else
            return ResponseEntity.notFound().build();
    }
}
