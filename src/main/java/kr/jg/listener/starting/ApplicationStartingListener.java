package kr.jg.listener.starting;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

// 콘텍스트가 생성전에 실행되기때문에 빈으로 등록하지 못한다.
// 어플리케이션실행단계에서 리스너로 등록해야함.
// 로거도 사용못하는듯 하다.
public class ApplicationStartingListener implements ApplicationListener<ApplicationStartingEvent> {
	
	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println(" * Application Starting Listener");
	}

}
