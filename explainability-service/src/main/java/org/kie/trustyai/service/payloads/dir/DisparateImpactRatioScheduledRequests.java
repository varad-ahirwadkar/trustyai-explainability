package org.kie.trustyai.service.payloads.dir;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.kie.trustyai.service.payloads.BaseMetricRequest;

import jakarta.inject.Singleton;

@Singleton
public class DisparateImpactRatioScheduledRequests {

    private final Map<UUID, BaseMetricRequest> requests = new HashMap<>();

    public Map<UUID, BaseMetricRequest> getRequests() {
        return requests;
    }
}
