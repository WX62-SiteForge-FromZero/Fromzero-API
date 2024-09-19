package com.acme.fromzeroapi.deliverables.domain.model.commands;

import java.time.LocalDate;

public record CreateDeliverableCommand(
        String name,
        String description,
        LocalDate date,
        Long projectId
) {
}
