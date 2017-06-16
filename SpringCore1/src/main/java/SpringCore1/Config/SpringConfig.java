package SpringCore1.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import SpringCore1.Bean.HelloWorld;

@Configuration
public class SpringConfig {
	
	@Bean
	public HelloWorld printHello(){
		return new HelloWorld();
	}

}
