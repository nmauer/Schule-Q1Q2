package vererbung;

public class Nilpferd extends Tier {

	public Nilpferd(String name, boolean weiblich, double gewicht) {
		super(name, weiblich, gewicht);
	}

	@Override
	public void buersten() {
		System.out.println("Schnaub!");
	}

}
