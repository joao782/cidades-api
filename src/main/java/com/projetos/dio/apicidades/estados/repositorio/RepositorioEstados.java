package com.projetos.dio.apicidades.estados.repositorio;

import com.projetos.dio.apicidades.estados.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEstados extends JpaRepository<Estado, Long> {
}
