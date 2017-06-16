package SpringCore2.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import SpringCore2.Bean.IOOutputGenerator;
import SpringCore2.Bean.JSONOutputGenerator;
import SpringCore2.Config.SpringConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfig.class);

		IOOutputGenerator output = appContext.getBean(JSONOutputGenerator.class);

		output.generateOutput();

	}
}
