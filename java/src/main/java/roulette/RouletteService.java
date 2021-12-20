package roulette;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class RouletteService {	
	
	private TimeOutAdapter timeOutAdapter; 
	private IntervalleAdapter intervalle;
	public TimeOutAdapter getTimeOutAdapter() {
		return timeOutAdapter;
	}

	public void setTimeOutAdapter(TimeOutAdapter timeOutAdapter) {
		this.timeOutAdapter = timeOutAdapter;
	}

	public RouletteService(TimeOutAdapter timeOutAdapter) {
		this.timeOutAdapter = timeOutAdapter;
	}
	
	public int getRandomNumber() throws NoSuchAlgorithmException, InterruptedException {

		timeOutAdapter.getTimeOut();
		IntervalleAdapter intervalle = new IntervalleAdapter();
		return intervalle.getRandomValue();

	}

	

}
