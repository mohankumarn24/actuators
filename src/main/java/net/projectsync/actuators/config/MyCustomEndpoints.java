package net.projectsync.actuators.config;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Endpoint(id="myendpoint")
@Component
// http://localhost:8080/management/<myendpoint>
public class MyCustomEndpoints {

	@ReadOperation
	@Bean
	public String hi() {
		return "Hi from custom endpoint";
	}
}
