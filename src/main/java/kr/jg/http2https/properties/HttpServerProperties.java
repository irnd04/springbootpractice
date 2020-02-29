package kr.jg.http2https.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "http.server")
public class HttpServerProperties {
	private int port;
}
