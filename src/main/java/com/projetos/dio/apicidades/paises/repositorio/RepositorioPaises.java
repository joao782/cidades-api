package com.projetos.dio.apicidades.paises.repositorio;

import com.projetos.dio.apicidades.paises.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPaises extends JpaRepository<Pais, Long> {
}
