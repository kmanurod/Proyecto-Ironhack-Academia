package com.example.cicloasignaturauf2.Controller;


import com.example.cicloasignaturauf2.Entity.Asignatura;
import com.example.cicloasignaturauf2.Repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaController {

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    // Obtener todas las asignaturas
    @GetMapping
    public List<Asignatura> getAllAsignaturas() {
        return asignaturaRepository.findAll();
    }

    // Obtener una asignatura por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Asignatura> getAsignaturaById(@PathVariable String id) {
        Optional<Asignatura> asignatura = asignaturaRepository.findById(id);
        return asignatura.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // Crear una nueva asignatura
    @PostMapping
    public Asignatura createAsignatura(@RequestBody Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    // Actualizar una asignatura existente
    @PutMapping("/{id}")
    public ResponseEntity<Asignatura> updateAsignatura(
            @PathVariable String id, @RequestBody Asignatura updatedAsignatura) {
        return asignaturaRepository.findById(id).map(asignatura -> {
            asignatura.setNomAsig(updatedAsignatura.getNomAsig());
            asignatura.setPrecioAsig(updatedAsignatura.getPrecioAsig());
            asignatura.setCiclo(updatedAsignatura.getCiclo());
            Asignatura savedAsignatura = asignaturaRepository.save(asignatura);
            return ResponseEntity.ok(savedAsignatura);
        }).orElse(ResponseEntity.notFound().build());
    }

    // Eliminar una asignatura por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAsignatura(@PathVariable String id) {
        if (asignaturaRepository.existsById(id)) {
            asignaturaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}