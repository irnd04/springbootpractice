package kr.jg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import kr.jg.listener.starting.ApplicationStartingListener;

@SpringBootApplication
public class SpringbootpracticeApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringbootpracticeApplication.class);

	public static void main(String[] args) {
		// SpringApplication.run(SpringbootpracticeApplication.class, args);
		
		logger.info("args : {}", String.join(" ", args));
		
		new SpringApplicationBuilder()
			.sources(SpringbootpracticeApplication.class)
				/* .bannerMode(Banner.Mode.OFF) */
				/* .web(WebApplicationType.NONE) */ // .SERVLET .REACTIVE
			.listeners(new ApplicationStartingListener())
			.run(args);
	}

}
