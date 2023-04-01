/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda_v2.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="factura")
public class Venta implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;
    
    private double precio;
    private int contidad;
    
    @JoinColumn(name="id_factura", referencedColumnName="id_factura")
    @ManyToOne
    private Factura factura;
    
    @JoinColumn(name="id_articulo", referencedColumnName="id_articulo")
    @ManyToOne
    private Articulo articulo;

    public Venta(double precio, int contidad, Factura factura) {
        this.precio = precio;
        this.contidad = contidad;
        this.factura = factura;
    }
    
    public Venta(){
        
    }
     
}
