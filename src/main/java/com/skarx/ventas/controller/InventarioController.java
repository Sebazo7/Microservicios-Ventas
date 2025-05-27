package com.skarx.ventas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skarx.ventas.model.Entity.Producto;
import com.skarx.ventas.service.InventarioService;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    private final InventarioService inventarioService;

    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    @GetMapping("/productos")
    public List<Producto> listarProductos() {
        return inventarioService.listarProductos();
    }

    @PostMapping("/productos")
    public Producto crearProducto(@RequestBody Producto producto) {
        return inventarioService.crearProducto(producto);
    }

    @PatchMapping("/productos/{id}/stock")
    public Producto ajustarStock(@PathVariable Long id, @RequestParam int cantidad) {
        return inventarioService.ajustarStock(id, cantidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        inventarioService.eliminarProducto(id);
    }

}
