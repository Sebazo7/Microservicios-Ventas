package com.skarx.ventas.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skarx.ventas.model.Entity.Promociones;
import com.skarx.ventas.repository.PromocionRepository;

@Service
@Transactional
public class PromocionServiceImpl implements PromocionService {

    private final PromocionRepository promoRepo;

    public PromocionServiceImpl(PromocionRepository promoRepo) {
        this.promoRepo = promoRepo;
    }

    @Override
    public List<Promociones> listarPromociones() {
        return promoRepo.findAll();
    }

    @Override
    public Promociones crearPromocion(Promociones promo) {
        return promoRepo.save(promo);
    }

    @Override
    public Promociones actualizarPromocion(Long id, Promociones nuevaPromo) {
        Promociones existente = promoRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Promoción no encontrada con ID: " + id));

        existente.setNombre(nuevaPromo.getNombre());
        existente.setDescripcion(nuevaPromo.getDescripcion());
        existente.setDescuento(nuevaPromo.getDescuento());
        existente.setFechaInicio(nuevaPromo.getFechaInicio());
        existente.setFechaFin(nuevaPromo.getFechaFin());
        existente.setProducto(nuevaPromo.getProducto());

        return promoRepo.save(existente);
    }

    @Override
    public void eliminarPromocion(Long id) {
        promoRepo.deleteById(id);
    }
}
