package com.skarx.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skarx.ventas.model.Entity.Promociones;

@Repository
public interface PromocionRepository extends JpaRepository<Promociones, Long> {

}
