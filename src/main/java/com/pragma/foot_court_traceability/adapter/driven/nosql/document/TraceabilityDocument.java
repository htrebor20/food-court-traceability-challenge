package com.pragma.foot_court_traceability.adapter.driven.nosql.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "traceability")
public class TraceabilityDocument {
    @Id
    private String id;
    private Long orderId;
    private Long customerId;
    private String customerEmail;
    private LocalDate date;
    private String previousStatus;
    private String newStatus;
    private Long employeeId;
    private String employeeEmail;
}
