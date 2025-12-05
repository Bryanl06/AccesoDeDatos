package com.example.demo.service;

import com.example.demo.entity.Aula;
import com.example.demo.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulaServiceImplements implements AulaService {

    @Autowired
    private AulaRepository aulaRepository;

    @Override
    public List<Aula> listar() {
        return aulaRepository.findAll();
    }

    @Override
    public Aula buscarPorId(Long id) {
        return aulaRepository.findById(String.valueOf(id))
                .orElseThrow(() -> new RuntimeException("Aula no encontrada"));
    }

    @Override
    public Aula agregar(Aula aula) {
        return aulaRepository.save(aula);
    }
    

    @Override
    public Aula actualizar(Long id, Aula aula) {
        Aula existente = buscarPorId(id);

        existente.setNombre(aula.getNombre());
        existente.setCapacidad(aula.getCapacidad());
        existente.setEdificio(aula.getEdificio());

        return aulaRepository.save(existente);
    }
    
    @Override
    public void borrar(Long id) {
        aulaRepository.deleteById(String.valueOf(id));
    }
}
