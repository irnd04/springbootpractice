package kr.jg.applicationrunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import kr.jg.profile.ProfileProperties;

@Component
@Order(2)
public class ApplicationRunner2 implements ApplicationRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(ApplicationRunner2.class);
	
	@Autowired
	private String profile;
	
	@Autowired
	private ProfileProperties ProfileProperties;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("ApplicationRunner2");
		logger.info(profile);
		logger.info(ProfileProperties.getProd());
	}
	
}
