package kr.jg.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("prod")
@Configuration
public class ProdConfig {
	
	@Bean
	public String profile() {
		return "prod";
	}
	
}
