package com.bydan.colegio.estructura.alumno.infrastructure.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bydan.colegio.estructura.alumno.domain.model.Alumno;

public interface AlumnoRepositoryI extends JpaRepository<Alumno,Long> {
}
