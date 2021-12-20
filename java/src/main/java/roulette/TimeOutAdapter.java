package roulette;

import java.util.concurrent.TimeUnit;

public class TimeOutAdapter {

	int timeout; 
	
	public TimeOutAdapter(int timeout) {
		super();
		this.timeout = timeout;
	}

	public TimeOutAdapter() { 
	}

	void getTimeOut() throws InterruptedException {
		TimeUnit.SECONDS.sleep(timeout);
	}

}
