package kr.jg.http2https.config;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

import kr.jg.http2https.properties.HttpServerProperties;

@SpringBootConfiguration
@EnableConfigurationProperties({HttpServerProperties.class})
public class TomcatConfig {
	
	@Bean
	public ServletWebServerFactory servletContainer(@Value("${server.port}") int port, HttpServerProperties props) {

		TomcatServletWebServerFactory serverFactory = new TomcatServletWebServerFactory(){
			@Override
			protected void postProcessContext(Context context) {
				SecurityConstraint securityConstraint = new SecurityConstraint();
				securityConstraint.setUserConstraint("CONFIDENTIAL");
				SecurityCollection collection = new SecurityCollection();
				collection.addPattern("/*");
				securityConstraint.addCollection(collection);
				context.addConstraint(securityConstraint);
			}
		};

		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setScheme("http");
		connector.setSecure(false);
		connector.setPort(props.getPort());
		connector.setRedirectPort(port);

		serverFactory.addAdditionalTomcatConnectors(connector);
		return serverFactory;
	}

}
