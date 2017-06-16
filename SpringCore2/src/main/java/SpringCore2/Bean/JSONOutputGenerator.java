package SpringCore2.Bean;

import org.springframework.stereotype.Component;

@Component
public class JSONOutputGenerator implements IOOutputGenerator {

	public void generateOutput() {
		System.out.println("JSON Output Generator");
	}
}
