package com.pragma.foot_court_traceability.adapter.driving.http.mapper;

import com.pragma.foot_court_traceability.adapter.driving.http.dto.request.TraceabilityRequestDto;
import com.pragma.foot_court_traceability.adapter.driving.http.dto.response.TraceabilityResponseCustomerDto;
import com.pragma.foot_court_traceability.adapter.driving.http.dto.response.TraceabilityResponseDto;
import com.pragma.foot_court_traceability.domain.model.Traceability;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityRequestMapper {
    Traceability requestToModel(TraceabilityRequestDto traceabilityRequestDto);

    TraceabilityResponseDto toResponse(Traceability traceability);

    List<TraceabilityResponseCustomerDto> toResponseTraceabilityList(List<Traceability> traceabilityList);
}
