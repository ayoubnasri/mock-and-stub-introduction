package roulette;

import java.util.concurrent.TimeUnit;

public class TimeOutAdapter {

	int timeout=0; 
	
	public TimeOutAdapter(int timeout) {
		super();
		this.timeout = timeout;
	}

	void getTimeOut() throws InterruptedException {
		TimeUnit.SECONDS.sleep(timeout);
	}

}
