package com.bydan.colegio.estructura.alumno_materia.infrastructure.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bydan.colegio.estructura.alumno_materia.domain.model.Alumno_materia;

public interface Alumno_materiaRepositoryI extends JpaRepository<Alumno_materia,Long> {
}
