package com.example.demo.service;

import com.example.demo.entity.Reserva;

import java.util.List;

public interface ReservaService {
    List<Reserva> listar();

    Reserva buscarPorId(Long id);

    Reserva agregar(String Reserva);

    Reserva actualizar(Long id, String Reserva);

    void borrar(Long id);
}
