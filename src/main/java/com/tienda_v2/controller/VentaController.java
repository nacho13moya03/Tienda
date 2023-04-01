/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda_v2.controller;

import com.tienda_v2.domain.Venta;
import com.tienda_v2.service.VentaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class VentaController {
    
    @Autowired
    VentaService ventaService;
    
    @GetMapping("/venta/listado")
    public String inicio(Model model) {
        var venta = ventaService.getVenta();
        model.addAttribute("clientes", venta);
        return "/venta/listado";    
    }
    
    @GetMapping("/venta/nuevo")
    public String nuevoVenta(Venta venta) {
        return "/venta/modificar";
    }
    
    @PostMapping("/venta/guardar")
    public String guardaVenta(Venta venta) {
        ventaService.saveVenta(venta);
        return "redirect:/venta/listado";
    }
    
    
    @GetMapping("/venta/eliminar/{idVenta}")
    public String eliminaVenta(Venta venta) {
        ventaService.deleteVenta(venta);
        return "redirect:/venta/listado";
    }
    
    @GetMapping("/venta/modificar/{idVenta}")
    public String modificaVenta(Venta venta, Model model) {
        venta = ventaService.getVenta(venta);
        model.addAttribute("Ventas",venta);
        return "redirect:/venta/listado";
    }
    
}
