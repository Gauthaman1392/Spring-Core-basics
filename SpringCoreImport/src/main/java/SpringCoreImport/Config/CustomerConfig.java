package SpringCoreImport.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import SpringCoreImport.Bean.CustomerBO;

@Configuration
public class CustomerConfig {

	@Bean(name="customer")
	public CustomerBO customerBo(){

		return new CustomerBO();

}
	
}
