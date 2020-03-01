package kr.jg.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	private static final Logger logger = LoggerFactory.getLogger(TestService.class);
	
	public String getName() {
		String r = "test";
		logger.info(r);
		return r;
	}

}
