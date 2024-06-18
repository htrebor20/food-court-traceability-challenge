package com.pragma.foot_court_traceability.adapter.driven.nosql.mapper;

import com.pragma.foot_court_traceability.adapter.driven.nosql.document.TraceabilityDocument;
import com.pragma.foot_court_traceability.domain.model.Traceability;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityDocumentMapper {
    Traceability toModel(TraceabilityDocument traceabilityDocument);
    TraceabilityDocument toDocument(Traceability traceability);
    List<Traceability>toModelList(List<TraceabilityDocument> traceabilityDocuments);
}
