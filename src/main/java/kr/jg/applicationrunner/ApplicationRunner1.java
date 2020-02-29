package kr.jg.applicationrunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ApplicationRunner1 implements ApplicationRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(ApplicationRunner1.class);
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("ApplicationRunner1");
	}
	
}
