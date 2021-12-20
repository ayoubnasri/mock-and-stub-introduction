package roulette;

import java.security.NoSuchAlgorithmException;

public class RouletteService {	
	
	private TimeOutAdapter timeOutAdapter; 
	private IntervalleAdapter intervalle;
	public IntervalleAdapter getIntervalle() {
		return intervalle;
	}

	public void setIntervalle(IntervalleAdapter intervalle) {
		this.intervalle = intervalle;
	}

	public TimeOutAdapter getTimeOutAdapter() {
		return timeOutAdapter;
	}

	public void setTimeOutAdapter(TimeOutAdapter timeOutAdapter) {
		this.timeOutAdapter = timeOutAdapter;
	}

	public RouletteService(TimeOutAdapter timeOutAdapter) {
		this.timeOutAdapter = timeOutAdapter;
	}
	public RouletteService(IntervalleAdapter intervalle, TimeOutAdapter timeOutAdapter) {
		this.intervalle = intervalle;
		this.timeOutAdapter = timeOutAdapter;
	}
	
	public int getRandomNumber() throws NoSuchAlgorithmException, InterruptedException {
		timeOutAdapter.getTimeOut();
		return intervalle.getRandomValue();

	}

	

}
