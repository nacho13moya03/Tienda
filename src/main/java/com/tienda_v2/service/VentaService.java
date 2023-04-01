/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda_v2.service;

import com.tienda_v2.domain.Venta;
import java.util.List;

/**
 *
 * @author Adriana Ramirez
 */
public interface VentaService {
     public List<Venta> getVenta();
    
    public Venta getVenta(Venta venta);
    
    public void deleteVenta(Venta venta);
    
    public void saveVenta(Venta venta);
    
}
