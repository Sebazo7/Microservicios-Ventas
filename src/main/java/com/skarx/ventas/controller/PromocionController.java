package com.skarx.ventas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skarx.ventas.model.Entity.Promociones;
import com.skarx.ventas.service.PromocionService;

@RestController
@RequestMapping("/api/promociones")
public class PromocionController {

    private final PromocionService promocionService;

    public PromocionController(PromocionService promocionService) {
        this.promocionService = promocionService;
    }

    @GetMapping
    public List<Promociones> listarPromociones() {
        return promocionService.listarPromociones();
    }

    @PostMapping
    public Promociones crearPromocion(@RequestBody Promociones promocion) {
        return promocionService.crearPromocion(promocion);
    }

    @PutMapping("/{id}")
    public Promociones actualizarPromocion(@PathVariable Long id, @RequestBody Promociones promocion) {
        return promocionService.actualizarPromocion(id, promocion);
    }

    @DeleteMapping("/{id}")
    public void eliminarPromocion(@PathVariable Long id) {
        promocionService.eliminarPromocion(id);
    }
}
