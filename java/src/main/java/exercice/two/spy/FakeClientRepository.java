package exercice.two.spy;

import clients.ClientRepository;

public class FakeClientRepository extends ClientRepository{
	
	public String birthdayFor;
	
	@Override
	public void setBirthdayFor(String name) {
		this.birthdayFor = name ; 
	}

}
