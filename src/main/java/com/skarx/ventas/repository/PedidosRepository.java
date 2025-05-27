package com.skarx.ventas.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skarx.ventas.model.Entity.Pedido;

@Repository
public interface PedidosRepository extends JpaRepository<Pedido, Long> {

    long countByFecha(LocalDate fecha);

}
