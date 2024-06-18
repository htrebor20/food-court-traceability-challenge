package com.pragma.foot_court_traceability.configuration;

import com.pragma.foot_court_traceability.adapter.driven.nosql.adapter.TraceabilityAdapter;
import com.pragma.foot_court_traceability.adapter.driven.nosql.mapper.ITraceabilityDocumentMapper;
import com.pragma.foot_court_traceability.adapter.driven.nosql.repository.ITraceabilityRepository;
import com.pragma.foot_court_traceability.domain.api.ITraceabilityServicePort;
import com.pragma.foot_court_traceability.domain.api.usecase.TraceabilityUseCase;
import com.pragma.foot_court_traceability.domain.spi.ITraceabilityPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final ITraceabilityDocumentMapper traceabilityDocumentMapper;
    private final ITraceabilityRepository traceabilityRepository;

    @Bean
    public ITraceabilityPersistencePort traceabilityPersistencePort() {
        return new TraceabilityAdapter(traceabilityRepository, traceabilityDocumentMapper);
    }

    @Bean
    public ITraceabilityServicePort traceabilityServicePort() {
        return new TraceabilityUseCase(traceabilityPersistencePort());
    }
}
