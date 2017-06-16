package SpringCoreImport.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import SpringCoreImport.Bean.CustomerBO;
import SpringCoreImport.Bean.SchedulerBO;
import SpringCoreImport.Config.AppConfig;


public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		CustomerBO customer = (CustomerBO) context.getBean("customer");
		customer.printMsg("Hello 1");

		SchedulerBO scheduler = (SchedulerBO) context.getBean("scheduler");
		scheduler.printMsg("Hello 2");

	}
}