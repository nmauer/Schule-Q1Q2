package klausurlernen.fachbegriffe;

public abstract class Mensch { //Klassensignatur der abstrakten Klasse Mensch
	
	/*
	 * Deklaration der Attribute name, gebDatum und istWeiblich vom Typen, String int und boolean
	 */
	private String name;
	private int gebDatum;
	private boolean istWeiblich;
	
	public Mensch(String name, int gebDatum, boolean istWeiblich) { //Konstruktor mit den Parametern name vom Typ String, gebDatum vom Typ int und istWeinlich vom Typ boolean
		/*
		 * Inizialisierung der Attribute name, gebDatum und istWeiblich
		 */
		this.name = name;
		this.gebDatum = gebDatum;
		this.istWeiblich = istWeiblich;
	}
	
	public abstract void lachen(); //Methodensignatur ohne Rückgabetyp der abstrakter Methode lachen
	
	
	public void gehen() { //Methodensignatur ohne Rückgabetyp der Methode gehen
		System.out.println("Mensch geht"); //Konsolenausgabe
	}
}
