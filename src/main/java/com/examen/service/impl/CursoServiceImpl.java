package com.examen.service.impl;

import com.examen.dao.CursoDao;
import com.examen.domain.Curso;
import com.examen.service.CursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoDao cursoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Curso> getCurso() {
        return cursoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Curso getcurso(Curso curso) {
        return cursoDao.findById(curso.getId_alumno()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Curso curso) {
        cursoDao.save(curso);
    }

    @Override
    @Transactional
    public void delete(Curso curso) {
        cursoDao.delete(curso);
    }

}