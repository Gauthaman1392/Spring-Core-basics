package SpringCoreImport.Bean;

import org.springframework.stereotype.Component;

@Component
public class CustomerBO {

	public void printMsg(String msg) {

		System.out.println("CustomerBo : " + msg);
	}
}
