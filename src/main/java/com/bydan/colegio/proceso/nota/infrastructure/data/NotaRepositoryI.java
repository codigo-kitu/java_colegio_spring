package com.bydan.colegio.proceso.nota.infrastructure.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bydan.colegio.proceso.nota.domain.model.Nota;

public interface NotaRepositoryI extends JpaRepository<Nota,Long> {
}
