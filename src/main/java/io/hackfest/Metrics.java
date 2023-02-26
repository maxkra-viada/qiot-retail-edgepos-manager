package io.hackfest;

import io.micrometer.core.instrument.MeterRegistry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/metrics")
@Produces("text/plain")
class Metrics {
	private final MeterRegistry registry;

	Metrics(MeterRegistry registry) {
		this.registry = registry;
	}
}
