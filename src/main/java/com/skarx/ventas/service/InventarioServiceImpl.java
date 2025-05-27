package com.skarx.ventas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skarx.ventas.model.Entity.Producto;
import com.skarx.ventas.repository.ProductoRepository;

@Service
public class InventarioServiceImpl implements InventarioService {

    private final ProductoRepository repo;

    public InventarioServiceImpl(ProductoRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Producto> listarProductos() {
        return repo.findAll();
    }

    @Override
    public Producto crearProducto(Producto pro) {
        return repo.save(pro);
    }

    @Override
    public Producto ajustarStock(Long Id, Integer cantidad) {
        Producto prod = repo.findById(Id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        prod.setStock(prod.getStock() + cantidad);
        return repo.save(prod);
    }

    @Override
    public void eliminarProducto(Long id) {
        repo.deleteById(id);
    }
}
