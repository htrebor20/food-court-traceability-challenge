package com.pragma.foot_court_traceability.adapter.driven.nosql.repository;

import com.pragma.foot_court_traceability.adapter.driven.nosql.document.TraceabilityDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ITraceabilityRepository extends MongoRepository<TraceabilityDocument, String> {
    List<TraceabilityDocument> findAllByOrderId(Long id);
}
