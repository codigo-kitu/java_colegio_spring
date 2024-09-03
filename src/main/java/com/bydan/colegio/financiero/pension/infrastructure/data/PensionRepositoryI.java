package com.bydan.colegio.financiero.pension.infrastructure.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bydan.colegio.financiero.pension.domain.model.Pension;

public interface PensionRepositoryI extends JpaRepository<Pension,Long> {
}
