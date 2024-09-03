package com.bydan.colegio.financiero.contrato.infrastructure.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bydan.colegio.financiero.contrato.domain.model.Contrato;

public interface ContratoRepositoryI extends JpaRepository<Contrato,Long> {
}
