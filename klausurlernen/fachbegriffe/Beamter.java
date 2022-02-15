package klausurlernen.fachbegriffe;

public class Beamter extends Mensch { //Klassensignatur der Klasse Beamter die vom der Klasse Mensch erbt

	private boolean verbeamtet; //Attribut verbeamtet vom Typ boolean wird deklariert
	
	public Beamter(String name, int gebDatum, boolean istWeiblich) { //Konstruktor mit den Parametern name vom Typ String, gebDatum vom Typ int und istWeinlich vom Typ boolean
		super(name, gebDatum, istWeiblich); //Konstruktoraufruf der Superclass/Oberklasse
		verbeamtet = true; //Das Attribut verbeamtet wird mit dem Wert true initialisiert
	}

	/*
	 * Polymorphie
	 */
	@Override
	public void lachen() { //Methodensignatur der Methode lachen ohne Rückgabetyp
		System.out.println("Das gibt nen strafzettel haha"); //Konsolenausgabe
	}
	
}
