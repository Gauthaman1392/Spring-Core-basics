package SpringCore1.App;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import SpringCore1.Bean.HelloWorld;
import SpringCore1.Config.SpringConfig;

public class App {
	public static void main(String[] args) {

		ApplicationContext appContext =  new AnnotationConfigApplicationContext(SpringConfig.class);
		
		
		HelloWorld obj = appContext.getBean(HelloWorld.class);
		
		obj.setName("Gautham");
		obj.printHello();
	}
}
