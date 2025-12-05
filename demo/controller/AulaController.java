package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aula")
public class AulaController {
  @Autowired
    private final AulaService aulaService;

    public AulaController(AulaService aulaService) {
        this.aulaService = aulaService;
    }

  // Devolver todas las aulas
  // Devolver un aula 
  // añadir aula
  // modificar aula
  // borrar aula

  @GetMapping
  public List<Aula> listar(){
    return aulaService.listar;
  }

  @PostMappig
  public Aula agregar(@RequesBody Aula aula){
    return service.agregar(aula);
  }
}
