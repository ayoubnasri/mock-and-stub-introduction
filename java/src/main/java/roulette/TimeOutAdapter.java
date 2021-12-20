package roulette;

import java.util.concurrent.TimeUnit;

public class TimeOutAdapter {

	int timeout; 
	
	void getTimeOut() throws InterruptedException {
		TimeUnit.SECONDS.sleep(timeout);
	}

}
