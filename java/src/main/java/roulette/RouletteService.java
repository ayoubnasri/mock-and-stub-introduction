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
		boolean randomNumber;
		try {
			randomNumber = Math.floorMod(Integer.parseInt(getRandomNumber()), 2)==0;
			if (randomNumber) {
				return "noir";
			} else {
				return "rouge";
			}
		} catch (NumberFormatException | NoSuchAlgorithmException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	

}
