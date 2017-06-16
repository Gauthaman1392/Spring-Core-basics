package SpringCore2.Bean;

import org.springframework.stereotype.Component;

@Component
public class CSVOutputGenerator implements IOOutputGenerator {

	public void generateOutput() {

		System.out.println("Csv Output Generator");

	}

}
