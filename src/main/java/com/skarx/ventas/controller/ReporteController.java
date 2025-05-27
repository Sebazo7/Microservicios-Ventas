package com.skarx.ventas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skarx.ventas.dto.Reporte;
import com.skarx.ventas.service.ReporteService;

@RestController
@RequestMapping("/reportes")
public class ReporteController {

    private final ReporteService reporteService;

    public ReporteController(ReporteService reporteService) {
        this.reporteService = reporteService;
    }

    @GetMapping("/ventas/hoy")
    public Reporte ventasHoy() {
        return reporteService.ventasHoy();
    }

    @GetMapping("/inventario/actual")
    public Reporte stockActual() {
        return reporteService.stockActual();
    }
}
