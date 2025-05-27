package com.skarx.ventas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemPedido {

    private Long productoId;
    private int cantidad;
    private Double precioUnitario;

}
