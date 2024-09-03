package com.bydan.colegio.financiero.sueldo.infrastructure.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bydan.colegio.financiero.sueldo.domain.model.Sueldo;

public interface SueldoRepositoryI extends JpaRepository<Sueldo,Long> {
}
