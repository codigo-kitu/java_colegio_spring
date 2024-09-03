package com.bydan.colegio.estructura.materia.infrastructure.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bydan.colegio.estructura.materia.domain.model.Materia;

public interface MateriaRepositoryI extends JpaRepository<Materia,Long> {
}
