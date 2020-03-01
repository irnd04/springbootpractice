package kr.jg.props;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "my")
@Validated
public class MyProperties {
	
	@NotNull @NotEmpty
	private String name;
	private int age = 987654321;
	private String fullName = "defualtFullName";
	@DurationUnit(ChronoUnit.SECONDS)
	private Duration timeout = Duration.ofSeconds(1);
	private Duration howLong = Duration.ofSeconds(1);
}
