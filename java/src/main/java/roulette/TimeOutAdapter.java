package roulette;

import java.util.concurrent.TimeUnit;

public class TimeOutAdapter {

	int timeout; 
	
	public TimeOutAdapter(int timeout) {
		super();
		this.timeout = timeout;
	}

	public TimeOutAdapter() {
		this.timeout = 20 ; 
	}

	void getTimeOut() throws InterruptedException {
		TimeUnit.SECONDS.sleep(timeout);
	}

}
