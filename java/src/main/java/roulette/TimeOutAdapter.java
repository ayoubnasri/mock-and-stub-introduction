package roulette;

import java.util.concurrent.TimeUnit;

public class TimeOutAdapter {

	void getTimeOut(int timeout) throws InterruptedException {
		TimeUnit.SECONDS.sleep(timeout);
	}

}
