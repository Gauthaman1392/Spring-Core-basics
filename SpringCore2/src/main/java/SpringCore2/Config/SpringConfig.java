package SpringCore2.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import SpringCore2.Bean.IOOutputGenerator;
import SpringCore2.Bean.JSONOutputGenerator;

@Configuration
public class SpringConfig {
	
	@Bean
	public IOOutputGenerator generateOutput(){
		return new JSONOutputGenerator();
	}
	
	
}
