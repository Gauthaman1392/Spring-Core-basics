package SpringCoreImport.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import SpringCoreImport.Bean.SchedulerBO;

@Configuration
public class SchedulerConfig {
	
	@Bean(name="scheduler")
	public SchedulerBO suchedulerBo(){

		return new SchedulerBO();

	}

}
