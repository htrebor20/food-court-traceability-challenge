package com.pragma.foot_court_traceability.domain.api;

import com.pragma.foot_court_traceability.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityServicePort {
    Traceability save( Traceability traceability );
    List<Traceability> getAllById(Long id);
}
