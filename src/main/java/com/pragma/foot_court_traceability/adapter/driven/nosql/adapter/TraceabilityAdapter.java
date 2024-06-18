package com.pragma.foot_court_traceability.adapter.driven.nosql.adapter;

import com.pragma.foot_court_traceability.adapter.driven.nosql.document.TraceabilityDocument;
import com.pragma.foot_court_traceability.adapter.driven.nosql.mapper.ITraceabilityDocumentMapper;
import com.pragma.foot_court_traceability.adapter.driven.nosql.repository.ITraceabilityRepository;
import com.pragma.foot_court_traceability.domain.model.Traceability;
import com.pragma.foot_court_traceability.domain.spi.ITraceabilityPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TraceabilityAdapter implements ITraceabilityPersistencePort {
    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityDocumentMapper traceabilityDocumentMapper;

    @Override
    public Traceability save(Traceability traceability) {
        TraceabilityDocument document = traceabilityDocumentMapper.toDocument(traceability);
        TraceabilityDocument saved = traceabilityRepository.save(document);
        return traceabilityDocumentMapper.toModel(saved);
    }

    @Override
    public List<Traceability> getAllById(Long id) {
        List<TraceabilityDocument> response = traceabilityRepository.findAllByOrderId(id);
        return traceabilityDocumentMapper.toModelList(response);
    }
}
