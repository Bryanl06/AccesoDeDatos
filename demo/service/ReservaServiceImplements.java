package com.example.demo.service;

import com.example.demo.entity.Aula;
import com.example.demo.entity.Reserva;
import com.example.demo.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImplements implements AulaService{
    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> listar(){
        return reservaRepository.findAll();
    }

    @Override
    public Reserva buscarPorId(Long id) {
        return null;
    }

    @Override
    public Reserva agregar(String reserva) {
        return null;
    }

    @Override
    public Aula actualizar(Long id, Aula aula) {
        return null;
    }

    @Override
    public Reserva actualizar(Long id, Reserva reserva) {
        return null;
    }

    @Override
    public void borrar(Long id) {

    }
}
