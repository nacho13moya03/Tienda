package com.examen.service;

import com.examen.domain.Curso;
import java.util.List;

public interface CursoService {
    
    // Se obtiene un listado de clientes en un List
    public List<Curso> getCurso();
    
    // Se obtiene un Cliente, a partir del id de un cliente
    public Curso getcurso(Curso curso);
    
    // Se inserta un nuevo cliente si el id del cliente esta vacío
    // Se actualiza un cliente si el id del cliente NO esta vacío
    public void save(Curso curso);
    
    // Se elimina el cliente que tiene el id pasado por parámetro
    public void delete(Curso curso);
    
}
