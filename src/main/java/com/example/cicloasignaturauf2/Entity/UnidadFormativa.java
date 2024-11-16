package com.example.cicloasignaturauf2.Entity;


import jakarta.persistence.*;

@Entity
public class UnidadFormativa {
    @Id
    @Column(name = "cod_uf", nullable = false)
    private String codUF;

    @Column(name = "nom_uf", nullable = false)
    private String nomUF;

    @Column(name = "horas_uf", nullable = false)
    private int horasUF;

    @ManyToOne
    @JoinColumn(name = "cod_ciclo", nullable = false)
    private Ciclo ciclo;

    @ManyToOne
    @JoinColumn(name = "cod_asig", nullable = false)
    private Asignatura asignatura;

    // Constructor vacío
    public UnidadFormativa() {}

    // Constructor completo
    public UnidadFormativa(String codUF, String nomUF, int horasUF, Ciclo ciclo, Asignatura asignatura) {
        this.codUF = codUF;
        this.nomUF = nomUF;
        this.horasUF = horasUF;
        this.ciclo = ciclo;
        this.asignatura = asignatura;
    }

    // Getters y Setters
    public String getCodUF() {
        return codUF;
    }

    public void setCodUF(String codUF) {
        this.codUF = codUF;
    }

    public String getNomUF() {
        return nomUF;
    }

    public void setNomUF(String nomUF) {
        this.nomUF = nomUF;
    }

    public int getHorasUF() {
        return horasUF;
    }

    public void setHorasUF(int horasUF) {
        this.horasUF = horasUF;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}