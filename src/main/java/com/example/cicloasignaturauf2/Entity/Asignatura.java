package com.example.cicloasignaturauf2.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Asignatura {
    @Id
    @Column(name = "cod_asig", nullable = false)
    private String codAsig;

    @Column(name = "nom_asig", nullable = false)
    private String nomAsig;

    @Column(name = "precio_asig", nullable = false)
    private Double precioAsig;

    @ManyToOne
    @JoinColumn(name = "cod_ciclo", nullable = false)
    private Ciclo ciclo;

    @OneToMany(mappedBy = "asignatura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UnidadFormativa> unidadesFormativas = new ArrayList<>();

    // Constructor vacío
    public Asignatura() {}

    // Constructor completo
    public Asignatura(String codAsig, String nomAsig, Double precioAsig, Ciclo ciclo) {
        this.codAsig = codAsig;
        this.nomAsig = nomAsig;
        this.precioAsig = precioAsig;
        this.ciclo = ciclo;
    }

    // Getters y Setters
    public String getCodAsig() {
        return codAsig;
    }

    public void setCodAsig(String codAsig) {
        this.codAsig = codAsig;
    }

    public String getNomAsig() {
        return nomAsig;
    }

    public void setNomAsig(String nomAsig) {
        this.nomAsig = nomAsig;
    }

    public Double getPrecioAsig() {
        return precioAsig;
    }

    public void setPrecioAsig(Double precioAsig) {
        this.precioAsig = precioAsig;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    public List<UnidadFormativa> getUnidadesFormativas() {
        return unidadesFormativas;
    }

    public void setUnidadesFormativas(List<UnidadFormativa> unidadesFormativas) {
        this.unidadesFormativas = unidadesFormativas;
    }
}