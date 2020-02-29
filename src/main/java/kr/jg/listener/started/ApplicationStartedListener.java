package kr.jg.listener.started;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent> {
	
	static final Logger logger = LoggerFactory.getLogger(ApplicationStartedListener.class);
	
	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		logger.info(" * Application Started Listener");
	}
}
