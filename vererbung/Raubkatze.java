package vererbung;

public abstract class Raubkatze extends Tier {
	
	private int danger;
	
	public Raubkatze(String name, boolean weiblich, double gewicht) {
		super(name, weiblich, gewicht);
	}
	
	public abstract void bruellen();

	@Override
	public void buersten() {
		System.out.println("Purrpurpur");
	}
	
	public void fuettern(double pMenge) {
			
	}
	
	public int getDanger() {
		return danger;
	}
	
	public void setDanger(int danger) {
		this.danger = danger;
	}
	
	public boolean isRaubKatze(){
		return true;
	}
	
}
