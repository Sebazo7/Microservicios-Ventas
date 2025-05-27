package com.skarx.ventas.service;

import java.util.List;

import com.skarx.ventas.model.Entity.Promociones;

public interface PromocionService {

    List<Promociones> listarPromociones();

    Promociones crearPromocion(Promociones promocion);

    Promociones actualizarPromocion(Long id, Promociones promocion);

    void eliminarPromocion(Long id);
}
