package com.example.cicloasignaturauf2.Entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ciclo {
    @Id
    @Column(name = "cod_ciclo", nullable = false)
    private String codCiclo;

    @Column(name = "abr_ciclo", nullable = false)
    private String abrCiclo;

    @Column(name = "nom_ciclo", nullable = false)
    private String nomCiclo;

    @OneToMany(mappedBy = "ciclo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Asignatura> asignaturas = new ArrayList<>();

    @OneToMany(mappedBy = "ciclo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UnidadFormativa> unidadesFormativas = new ArrayList<>();

    // Constructor vacío
    public Ciclo() {}

    // Constructor completo
    public Ciclo(String codCiclo, String abrCiclo, String nomCiclo) {
        this.codCiclo = codCiclo;
        this.abrCiclo = abrCiclo;
        this.nomCiclo = nomCiclo;
    }

    // Getters y Setters
    public String getCodCiclo() {
        return codCiclo;
    }

    public void setCodCiclo(String codCiclo) {
        this.codCiclo = codCiclo;
    }

    public String getAbrCiclo() {
        return abrCiclo;
    }

    public void setAbrCiclo(String abrCiclo) {
        this.abrCiclo = abrCiclo;
    }

    public String getNomCiclo() {
        return nomCiclo;
    }

    public void setNomCiclo(String nomCiclo) {
        this.nomCiclo = nomCiclo;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public List<UnidadFormativa> getUnidadesFormativas() {
        return unidadesFormativas;
    }

    public void setUnidadesFormativas(List<UnidadFormativa> unidadesFormativas) {
        this.unidadesFormativas = unidadesFormativas;
    }
}