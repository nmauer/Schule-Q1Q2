package vererbung;

public abstract class Tier {
	
	private String name;
	private boolean weiblich;
	private double gewicht;
	
	public Tier(String name, boolean weiblich, double gewicht) {
		this.name = name;
		this.weiblich = weiblich;
		this.gewicht = gewicht;
	}
	
	public abstract void buersten();
	
	public void fuettern(double pMenge) {
		gewicht+=pMenge;
	}
	
	public boolean isRaubKatze(){
		if(this instanceof Raubkatze) {
			return true;
		}else 
			return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isWeiblich() {
		return weiblich;
	}

	public void setWeiblich(boolean weiblich) {
		this.weiblich = weiblich;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	
}
