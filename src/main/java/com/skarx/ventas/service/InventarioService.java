package com.skarx.ventas.service;

import java.util.List;

import com.skarx.ventas.model.Entity.Producto;

public interface InventarioService {

    List<Producto> listarProductos();

    Producto crearProducto(Producto producto);

    Producto ajustarStock(Long productoId, Integer cantidad);

    void eliminarProducto(Long id);
}
