package io.hackfest;

import javax.inject.Inject;
import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import io.smallrye.reactive.messaging.kafka.Record;

import io.hackfest.PosUpdate;

import io.micrometer.core.instrument.Tags;
import io.micrometer.core.instrument.MeterRegistry;

@ApplicationScoped
public class PosUpdateStreamConsumer {
	static final Logger LOGGER = LoggerFactory.getLogger(PosUpdateStreamConsumer.class);

	@Inject
	MeterRegistry registry;

	@Incoming("posupdates") 
	public void process(PosUpdate posupdate) {
		registry.counter("posupdate_counter").increment();

		LOGGER.info("Got a PosUpdate!");
	}
}
