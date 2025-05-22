package com.skarx.ventas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventarioModel {
    private int id;
    private String nombre;
    private int precio;
    private int stock;
    private String descripcion;


}
