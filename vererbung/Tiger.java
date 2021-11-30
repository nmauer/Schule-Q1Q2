package vererbung;

public class Tiger extends Raubkatze {
	
	private int anzahlStreifen;

	public Tiger(String name, boolean weiblich, double gewicht, int anzahlStreifen) {
		super(name, weiblich, gewicht);
		this.anzahlStreifen = anzahlStreifen;	
	}

	@Override
	public void bruellen() {
		System.out.println("Ok lets Go");	
	}
	
	public int getAnzahlStreifen() {
		return anzahlStreifen;
	}

	public void setAnzahlStreifen(int anzahlStreifen) {
		this.anzahlStreifen = anzahlStreifen;
	}
	
}
