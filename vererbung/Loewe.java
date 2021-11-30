package vererbung;

public class Loewe extends Raubkatze {

	public Loewe(String name, boolean weiblich, double gewicht) {
		super(name, weiblich, gewicht);
	}

	@Override
	public void bruellen() {
		System.out.println("SUIIIII");
	}

}
