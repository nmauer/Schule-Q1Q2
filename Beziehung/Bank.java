package Beziehung;

import linear.List;

public class Bank {
	private List<Person> pl;
	private Kunde k;
	
	public Bank() {
		pl= new List<>();
		k = new Kunde("Ben", 0, 32423);
		pl.append(k);
		
	}

}
