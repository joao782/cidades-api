package com.projetos.dio.apicidades.cidades;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
@TypeDefs(value = {
        @TypeDef(name = "ponto", typeClass = TipoPonto.class)
})
public class Cidade {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private Integer uf;

    private Integer ibge;

    // 1st
    @Column(name = "lat_lon")
    private String geolocalizacao;

    // 2nd
    @Type(type = "ponto")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point localizacao;

    public Cidade() {
    }

    public Cidade(final Long id, final String name, final Integer uf, final Integer ibge,
                final String geolocation, final Point location) {
        this.id = id;
        this.name = name;
        this.uf = uf;
        this.ibge = ibge;
        this.geolocalizacao = geolocation;
        this.localizacao = location;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }


    public String getGeolocalizacao() {
        return geolocalizacao;
    }

    public Point getLocalizacao() {
        return localizacao;
    }
}
