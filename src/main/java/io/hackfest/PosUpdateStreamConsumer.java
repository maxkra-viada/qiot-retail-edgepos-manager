package io.hackfest;

import javax.inject.Inject;
import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class PosUpdateStreamConsumer {
	static final Logger LOGGER = LoggerFactory.getLogger(PosUpdateStreamConsumer.class);

	@Incoming("posupdate") 
	public void process(Object posupdate) {
		LOGGER.info("Got a PosUpdate!"); 
	} 
}
