package com.example.cicloasignaturauf2.Repository;

import com.example.cicloasignaturauf2.Entity.UnidadFormativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadFormativaRepository extends JpaRepository<UnidadFormativa, String> {
}
