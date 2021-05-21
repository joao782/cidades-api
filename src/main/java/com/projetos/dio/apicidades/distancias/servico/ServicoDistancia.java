package com.projetos.dio.apicidades.distancias.servico;

import java.util.Arrays;
import java.util.List;

import com.projetos.dio.apicidades.cidades.Cidade;
import com.projetos.dio.apicidades.cidades.repositorio.RepositorioCidades;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

@Service
public class ServicoDistancia {

    private final RepositorioCidades repositorioCidades;
    Logger log = LoggerFactory.getLogger(ServicoDistancia.class);

    public ServicoDistancia(final RepositorioCidades cityRepository) {
        this.repositorioCidades = cityRepository;
    }


    public Double distanceByPointsInMiles(final Long city1, final Long city2) {
        log.info("nativePostgresInMiles({}, {})", city1, city2);
        return repositorioCidades.distanceByPoints(city1, city2);
    }


    public Double distanceByCubeInMeters(Long city1, Long city2) {
        log.info("distanceByCubeInMeters({}, {})", city1, city2);
        final List<Cidade> cities = repositorioCidades.findAllById((Arrays.asList(city1, city2)));

        Point p1 = cities.get(0).getLocalizacao();
        Point p2 = cities.get(1).getLocalizacao();

        return repositorioCidades.distanceByCube(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

}