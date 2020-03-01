package kr.jg;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.jg.props.MyProperties;


@RunWith(SpringRunner.class)
@SpringBootTest
// @EnableConfigurationProperties({MyProperties.class}) 이 어노테이션 대신 properties에 컴포넌트어노테이션을 붙히는것도 가능하다.
public class SpringbootpracticeApplicationTests {
	
	@Autowired
	private MyProperties myprops;
	
	@Test
	public void contextLoads() {
		System.out.println(myprops);
		assertThat(myprops.getName()).isNotNull();
		assertThat(myprops.getAge()).isGreaterThan(0);
		assertThat(myprops.getFullName()).endsWith("lee");
	}
}
