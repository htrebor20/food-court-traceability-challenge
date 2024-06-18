package com.pragma.foot_court_traceability.domain.spi;

import com.pragma.foot_court_traceability.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityPersistencePort {
    Traceability save( Traceability traceability );
    List<Traceability> getAllById(Long id);
}
