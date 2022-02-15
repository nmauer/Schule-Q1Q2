package Beziehung;

public class Konto {
	private int Kontonummer;
	private double Guthaben;
	
	public Konto(int pKontonummer, double pGuthaben) {
		Kontonummer=pKontonummer;
		Guthaben=pGuthaben;
	}

	public int getKontonummer() {
		return Kontonummer;
	}

	public void setKontonummer(int kontonummer) {
		Kontonummer = kontonummer;
	}

	public double getGuthaben() {
		return Guthaben;
	}

	public void setGuthaben(double guthaben) {
		Guthaben = guthaben;
	}
	
	
	
}
