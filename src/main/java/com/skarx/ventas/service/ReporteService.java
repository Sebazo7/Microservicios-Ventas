package com.skarx.ventas.service;

import com.skarx.ventas.dto.Reporte;

public interface ReporteService {

    Reporte ventasHoy();

    Reporte stockActual();
}
