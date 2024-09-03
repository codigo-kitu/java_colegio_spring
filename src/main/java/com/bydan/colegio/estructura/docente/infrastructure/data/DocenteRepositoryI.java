package com.bydan.colegio.estructura.docente.infrastructure.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bydan.colegio.estructura.docente.domain.model.Docente;

public interface DocenteRepositoryI extends JpaRepository<Docente,Long> {
}
