package com.skarx.ventas.service;

import java.util.List;

import com.skarx.ventas.model.Entity.Pedido;

public interface PedidoService {

    List<Pedido> listarPedidos();

    Pedido crearPedido(Pedido pedido);

    Pedido autorizarPedido(Long pedidoId);

    Pedido rechazarPedido(Long pedidoId);
}
