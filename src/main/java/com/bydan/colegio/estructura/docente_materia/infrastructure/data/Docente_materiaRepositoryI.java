package com.bydan.colegio.estructura.docente_materia.infrastructure.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bydan.colegio.estructura.docente_materia.domain.model.Docente_materia;

public interface Docente_materiaRepositoryI extends JpaRepository<Docente_materia,Long> {
}
