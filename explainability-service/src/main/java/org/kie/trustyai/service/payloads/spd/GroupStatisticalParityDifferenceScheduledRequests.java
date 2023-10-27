package org.kie.trustyai.service.payloads.spd;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.kie.trustyai.service.payloads.BaseMetricRequest;

import jakarta.inject.Singleton;

@Singleton
public class GroupStatisticalParityDifferenceScheduledRequests {

    private final Map<UUID, BaseMetricRequest> requests = new HashMap<>();

    public Map<UUID, BaseMetricRequest> getRequests() {
        return requests;
    }
}
