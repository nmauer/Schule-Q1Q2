package Beziehung;

public class Kunde extends Person {
	private Konto k;

	public Kunde(String pName, int pAlter, int pKontonummer) {
		super(pName, pAlter);
		k = new Konto(pKontonummer,0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reden() {
		// TODO Auto-generated method stub
		
	}
	public void schreien() {
		System.out.println("Hallo");
	}
	
	public void geldAbheben(int pAmount) {
	  System.out.println("Es Wurde"+ pAmount +"abgehoben");
	}
	
	public int getKontoNummer() {
		return k.getKontonummer();
	}

}
