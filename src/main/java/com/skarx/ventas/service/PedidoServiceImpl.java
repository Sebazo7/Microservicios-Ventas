package com.skarx.ventas.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skarx.ventas.model.Entity.Pedido;
import com.skarx.ventas.repository.PedidosRepository;

@Service
@Transactional
public class PedidoServiceImpl implements PedidoService {

    private final PedidosRepository pedidosRepo;

    public PedidoServiceImpl(PedidosRepository pedidosRepo) {
        this.pedidosRepo = pedidosRepo;
    }

    @Override
    public List<Pedido> listarPedidos() {
        return pedidosRepo.findAll();
    }

    @Override
    public Pedido crearPedido(Pedido pedido) {
        pedido.setFecha(LocalDate.now());
        pedido.setEstado("Pendiente");
        return pedidosRepo.save(pedido);
    }

    @Override
    public Pedido autorizarPedido(Long Id) {
        Pedido pe = pedidosRepo.findById(Id)
                .orElseThrow(() -> new RuntimeException("Pedido no encontrado"));
        pe.setEstado("Aprobado");
        return pedidosRepo.save(pe);
    }

    @Override
    public Pedido rechazarPedido(Long Id) {
        Pedido pe = pedidosRepo.findById(Id)
                .orElseThrow(() -> new RuntimeException("Pedido no encontrado"));
        pe.setEstado("Rechazado");
        return pedidosRepo.save(pe);
    }
}
