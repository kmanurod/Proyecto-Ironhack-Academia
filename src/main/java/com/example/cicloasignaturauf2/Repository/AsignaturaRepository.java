package com.example.cicloasignaturauf2.Repository;

import com.example.cicloasignaturauf2.Entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, String> {
}
