package com.skarx.ventas.repository;

import com.skarx.ventas.model.InventarioModel;
import org.springframework.stereotype.Repository;



import java.util.ArrayList;
import java.util.List;


@Repository
public class InventarioStock {

    private List<InventarioModel> listaStock = new ArrayList<>();

    public List<InventarioModel> stockDisponible() {
        return listaStock;
    }



//Busca el producto por su id correspondiente

public InventarioModel buscarProducto (int id) {
    for (InventarioModel inventarioModel : listaStock){
        if (inventarioModel.getId() == id){
            return inventarioModel;
        }
    }
    return null;
}

//Busca el nombre del producto
public InventarioModel buscarNombre (String nombre){
    for (InventarioModel inventarioModel : listaStock){
        if (inventarioModel.getNombre().equals(nombre)){
            return inventarioModel;
        }
    }

}


public InventarioModel agregarProducto (InventarioModel pro) {
    listaStock.add(pro);
    return pro;
}


public InventarioModel actualizarProducto(InventarioModel pro){
    int id = 0;
    int idPosicion = 0;

    for(int i = 0; i<listaStock.size(); i++){
        if (listaStock.get(i).getId() == pro.getId()) {
            id = pro.getId();
            idPosicion = i;
        }
    }
}

InventarioModel inventario1 = new InventarioModel();
inventario1.setId(id);
inventario1.setNombre(pro.getNombre());

}



