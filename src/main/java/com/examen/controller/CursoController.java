package com.examen.controller;

import com.examen.domain.Curso;
import com.examen.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping("/")
    public String inicio(Model model) {
        var curso = cursoService.getCurso();
        model.addAttribute("Alumnos", curso);
        return "index";
    }

    @GetMapping("/curso/nuevo")
    public String cursoNuevo(Curso curso) {
        return "modifica_curso";
    }

    @PostMapping("/curso/guardar")
    public String cursoGuardar(Curso curso) {
        cursoService.save(curso);
        return "redirect:/";
    }

    @GetMapping("/curso/eliminar/{id_alumno}")
    public String cursoEliminar(Curso curso) {
        cursoService.delete(curso);
        return "redirect:/";
    }

    @GetMapping("/curso/modificar/{id_alumno}")
    public String cursoModificar(Curso curso, Model model) {
        curso = cursoService.getcurso(curso);
        model.addAttribute("curso", curso);
        return "modifica_curso";
    }
}
