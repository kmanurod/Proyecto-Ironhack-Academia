package com.example.cicloasignaturauf2.Repository;

import com.example.cicloasignaturauf2.Entity.Ciclo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CicloRepository extends JpaRepository<Ciclo, String> {
}
