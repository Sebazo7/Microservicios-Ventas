package com.skarx.ventas.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reporte {

    private String tipo; // inventario o venta
    private LocalDate fecha;
    private long valor;

}
