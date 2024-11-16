package com.example.cicloasignaturauf2.Controller;



import com.example.cicloasignaturauf2.Entity.Ciclo;
import com.example.cicloasignaturauf2.Repository.CicloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ciclos")
public class CicloController {

    @Autowired
    private CicloRepository cicloRepository;

    @GetMapping
    public List<Ciclo> getAllCiclos() {
        return cicloRepository.findAll();
    }
}
