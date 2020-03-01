package kr.jg.http2https.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/http2https")
public class Http2HttpsController {
	
	// 키생성 커맨드
	// keytool -genkey -alias secret -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore -validity 4000
	
	@GetMapping(value = {""})
	public String welcome() {
		return "Hello, World!";
	}
	
}
