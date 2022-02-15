package klausurlernen.fachbegriffe;

import linear.List;

public class BewohnerListe { //Klassensignatur
	
	private List<Mensch> bewohnerListe; //Eine Liste vom Inhaltstyp Mensch mit dem Namen bewohnerListe wird deklariert
	private List<Beamter> beamtenListe; //Eine Liste vom Inhaltstyp Beamter mit dem Namen beamtenListe wird deklariert

	public BewohnerListe() { //Konstruktor
		bewohnerListe = new List<>(); //Die Liste bewohnerliste wird instanziiert
		beamtenListe = new List<>(); //Die Liste beamtenListe wird instanziiert
	}
	
	/*
	 * Subtyping
	 */
	public void fuegeBewohnerHinzu(Beamter pBeamter) { //Methodensignatur ohne Rückgabetyp und dem Parameter pBeamter vom Typ Beamter
		bewohnerListe.append(pBeamter); //Der Beamte pBeamte wird zur Liste bewohnerListe hinzugefügt
	}
	/*
	 * Aufbau Variablen:
	 * 
	 * VARIAVLENTYP NAME =  WERT
	 */
	
	/*
	 * Typecast
	 */
	public void fuegeBeamtenHinzu1(Mensch pMensch) { //Methgodensignatur ohne Rückgabetyp und dem Parameter pMensch vom Typ Mensch
		if(pMensch instanceof Beamter) { //if-bedingung: falls pMensch ein Beamten ist
			Beamter aktMensch = (Beamter) pMensch; // Lokale Variable aktmensch mit dem Wert pMensch vom Typ Beamter wird initialisiert, deklariert und zum Beamten mithilfe von Typecast spezifiziert
			beamtenListe.append(aktMensch); //Der Beamte aktMensch wird zur Liste beamtenListe hinzugefügt
		}
	}

}
