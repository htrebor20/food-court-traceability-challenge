package com.pragma.foot_court_traceability.adapter.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TraceabilityResponseCustomerDto {
    private String id;
    private Long orderId;
    private Long customerId;
    private LocalDate date;
    private String newStatus;
    private Long employeeId;
}
