package vererbung;


import gui.GUI;
import linear.List;

public class Zoo {
	
	private List<Tier> zootiere = new List<>();
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	}
	
	public void alleBuersten() {
		if(zootiere == null) return;	//Bei einer einzeiligen if-Abfrage können die geschweiften Klammern weggelassen werden. 
		
		zootiere.toFirst();
		
		while(zootiere.hasAccess()) {
			Tier aktTier = zootiere.getContent();
			
			aktTier.buersten();
			
			zootiere.next();
		}
		
	}
	
	public void alleFuettern(double pMenge) {
		
        if(zootiere == null) return;	
		
		zootiere.toFirst();
		
		while(zootiere.hasAccess()) {
			Tier aktTier = zootiere.getContent();
			
			aktTier.fuettern(pMenge);
			
			zootiere.next();
		}
		
	}
	
	public void raubkatzenBruellen() {
		
		if(zootiere == null) return;	
		
		zootiere.toFirst();
		
		while(zootiere.hasAccess()) {
			Tier aktTier = zootiere.getContent();
			
			if(aktTier.isRaubKatze()) {
				Raubkatze aktRaubi= (Raubkatze) aktTier;
				aktRaubi.bruellen();
			}
			
			zootiere.next();
		}
	}
		
	
}
