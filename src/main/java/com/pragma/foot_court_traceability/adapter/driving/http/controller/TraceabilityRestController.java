package com.pragma.foot_court_traceability.adapter.driving.http.controller;

import com.pragma.foot_court_traceability.adapter.driving.http.dto.request.TraceabilityRequestDto;
import com.pragma.foot_court_traceability.adapter.driving.http.dto.response.TraceabilityResponseCustomerDto;
import com.pragma.foot_court_traceability.adapter.driving.http.dto.response.TraceabilityResponseDto;
import com.pragma.foot_court_traceability.adapter.driving.http.mapper.ITraceabilityRequestMapper;
import com.pragma.foot_court_traceability.domain.api.ITraceabilityServicePort;
import com.pragma.foot_court_traceability.domain.model.Traceability;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/traceability")
@RequiredArgsConstructor
public class TraceabilityRestController {
    private final ITraceabilityServicePort traceabilityServicePort;
    private final ITraceabilityRequestMapper traceabilityRequestMapper;

    @PostMapping("/")
    public ResponseEntity<TraceabilityResponseDto> createTraceability(@RequestBody TraceabilityRequestDto request) {
        Traceability traceability = traceabilityRequestMapper.requestToModel(request);
        Traceability save = traceabilityServicePort.save(traceability);
        TraceabilityResponseDto response = traceabilityRequestMapper.toResponse(save);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<TraceabilityResponseCustomerDto>> getAllById(@PathVariable Long id) {
        List<Traceability> response = traceabilityServicePort.getAllById(id);
        return ResponseEntity.ok(traceabilityRequestMapper.toResponseTraceabilityList(response));
    }
}