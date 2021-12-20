package roulette;

import java.security.NoSuchAlgorithmException;
import java.util.function.IntPredicate;

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
	
	public String getRandomNumber() throws NoSuchAlgorithmException, InterruptedException {
		
		timeOutAdapter.getTimeOut();
		
		if(intervalle.getRandomValue()== 37) {
			return "00";
		}
		return String.valueOf(intervalle.getRandomValue());

	}

	public String getcolor() {
		int randomNumberInt = Integer.parseInt(getRandomNumber());
		if (randomNumberInt==0) {
			return "vert";
		}
		else {
			boolean randomNumberStr = Math.floorMod(randomNumberInt, 2)==0;
			if (randomNumberStr) {
				return "noir";
			} 
			else {
				return "rouge";
			}
		}
	}

	

}
