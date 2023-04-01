
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
public class Factura implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFactura;
    
    private double total;
    private int estado;
    
    @JoinColumn(name="id_cliente", referencedColumnName="id_cliente")
    @ManyToOne
    private Cliente cliente;

    public Factura(double total, int estado) {
    
        this.total = total;
        this.estado = estado;
    }
    
    public Factura(){
        
    }
}
