package com.examen.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="Alumnos")

public class Curso implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_alumno;
    
    private String cedula;
    private String nombre;
    private String apellido;
    private int telefono;
    private String correo;

    public Curso() {
    }

    public Curso(String cedula, String nombre, String apellido, int telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }
    
}