package klausurlernen.fachbegriffe;

public class Gastarbeiter extends Mensch {

	public Gastarbeiter(String name, int gebDatum, boolean istWeiblich) {
		super(name, gebDatum, istWeiblich);
		
	}

	@Override
	public void lachen() {
		System.out.println("Ich arbeite bilig haha");
	}
	
	public void gehen() {
		System.out.println("Gastarbeiter geht");
	}

}
