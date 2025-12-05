package com.example.demo.service;

import com.example.demo.entity.Aula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AulaService {
@Autowired
private AulaRepository repository;
// Recoger todas las reservas.
// recoger una reserva.
// Guardar una reserva --Se debe validar horas
// Cambiar una reserva.
// Borrar una reserva.
    public Aula agregar(Aula aula){
        return repository.save(aula);
    }

    public List<Aula> listar(){
        return repository.findAll();
    }

    public Aula ()

}
