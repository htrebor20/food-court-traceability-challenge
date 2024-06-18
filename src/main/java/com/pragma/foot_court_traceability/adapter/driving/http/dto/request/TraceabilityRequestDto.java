package com.pragma.foot_court_traceability.adapter.driving.http.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TraceabilityRequestDto {
    private Long orderId;
    private Long customerId;
    private String customerEmail;
    private LocalDate date;
    private String previousStatus;
    private String newStatus;
    private Long employeeId;
    private String employeeEmail;
}
