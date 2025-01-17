package exercice.one.stub;

import clients.ClientRepository;

public class BirthdayService {

	public ClientRepository repository;

	 BirthdayService(ClientRepository repository) {
		this.repository = repository;

	}

	public String greeting(String name) {

		String greeting;

		if (repository.birthdayIsTodayFor(name)) {
			greeting = "Happy birthday " + name + "!";
		} else {
			greeting = "Good morning " + name + ".";
		}

		return greeting;

	}

}
