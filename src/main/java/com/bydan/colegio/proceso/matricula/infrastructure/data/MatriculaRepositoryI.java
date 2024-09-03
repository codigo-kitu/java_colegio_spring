package com.bydan.colegio.proceso.matricula.infrastructure.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bydan.colegio.proceso.matricula.domain.model.Matricula;

public interface MatriculaRepositoryI extends JpaRepository<Matricula,Long> {
}
