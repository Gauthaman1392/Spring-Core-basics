package SpringCoreImport.Bean;

import org.springframework.stereotype.Component;

@Component
public class SchedulerBO {

	public void printMsg(String msg) {

		System.out.println("SchedulerBo : " + msg);
	}
}
