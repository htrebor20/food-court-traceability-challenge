package com.pragma.foot_court_traceability.domain.api.usecase;

import com.pragma.foot_court_traceability.domain.api.ITraceabilityServicePort;
import com.pragma.foot_court_traceability.domain.model.Traceability;
import com.pragma.foot_court_traceability.domain.spi.ITraceabilityPersistencePort;

import java.util.List;

public class TraceabilityUseCase implements ITraceabilityServicePort {

    private final ITraceabilityPersistencePort traceabilityPersistencePort;

    public TraceabilityUseCase(ITraceabilityPersistencePort traceabilityPersistencePort) {
        this.traceabilityPersistencePort = traceabilityPersistencePort;
    }

    @Override
    public Traceability save(Traceability traceability) {
        return traceabilityPersistencePort.save(traceability);
    }

    @Override
    public List<Traceability> getAllById(Long id) {
        return traceabilityPersistencePort.getAllById(id);
    }
}
