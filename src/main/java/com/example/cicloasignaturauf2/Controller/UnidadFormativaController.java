package com.example.cicloasignaturauf2.Controller;


import com.example.cicloasignaturauf2.Entity.UnidadFormativa;
import com.example.cicloasignaturauf2.Repository.UnidadFormativaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/unidades-formativas")
public class UnidadFormativaController {

    @Autowired
    private UnidadFormativaRepository unidadFormativaRepository;

    // Obtener todas las unidades formativas
    @GetMapping
    public List<UnidadFormativa> getAllUnidadesFormativas() {
        return unidadFormativaRepository.findAll();
    }

    // Obtener una unidad formativa por su ID
    @GetMapping("/{id}")
    public ResponseEntity<UnidadFormativa> getUnidadFormativaById(@PathVariable String id) {
        Optional<UnidadFormativa> unidadFormativa = unidadFormativaRepository.findById(id);
        return unidadFormativa.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // Crear una nueva unidad formativa
    @PostMapping
    public UnidadFormativa createUnidadFormativa(@RequestBody UnidadFormativa unidadFormativa) {
        return unidadFormativaRepository.save(unidadFormativa);
    }

    // Actualizar una unidad formativa existente
    @PutMapping("/{id}")
    public ResponseEntity<UnidadFormativa> updateUnidadFormativa(
            @PathVariable String id, @RequestBody UnidadFormativa updatedUnidadFormativa) {
        return unidadFormativaRepository.findById(id).map(unidadFormativa -> {
            unidadFormativa.setNomUF(updatedUnidadFormativa.getNomUF());
            unidadFormativa.setHorasUF(updatedUnidadFormativa.getHorasUF());
            unidadFormativa.setAsignatura(updatedUnidadFormativa.getAsignatura());
            UnidadFormativa savedUnidadFormativa = unidadFormativaRepository.save(unidadFormativa);
            return ResponseEntity.ok(savedUnidadFormativa);
        }).orElse(ResponseEntity.notFound().build());
    }

    // Eliminar una unidad formativa por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUnidadFormativa(@PathVariable String id) {
        if (unidadFormativaRepository.existsById(id)) {
            unidadFormativaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}