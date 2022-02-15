package klausurlernen.medienplayer;

import linear.List;
 
public class Wiedergabeliste {

	private String listName;
	private List<Song> wl;

	public Wiedergabeliste(String pListName) {
		listName = pListName;
		wl = new List<>();
	}

	public List<Song> baueListe(String pBand){
		List<Song> hilfsListe = new List<>();

		if(wl == null) return null;

		wl.toFirst();
		while(wl.hasAccess()) {
			Song aktSong = wl.getContent();
			String aktSong2 = aktSong.getBand();
			if(pBand.equals(aktSong2)) {
				hilfsListe.append(aktSong);
			}
			wl.next();
		}
		return hilfsListe;
	}
	
	public void einfuegen(Song pEinfuegeSong, Song pNachfolger) {
		if(wl == null) return;

		wl.toFirst();
		while(wl.hasAccess()) {
			Song aktSong = wl.getContent();
			if(pNachfolger==aktSong) {
				wl.insert(pEinfuegeSong);
			}
			wl.next();
		}
	}

	//Nötige Elemente des Durchlaufens einer Liste *
	
	public void verschieben (Song pVerschiebeSong, Song pNachfolger) {
		if(wl == null) return;
		
		wl.toFirst(); //*
		
		while(wl.hasAccess()) { //*
			Song aktSong = wl.getContent();
			if(pVerschiebeSong == aktSong) {
				wl.remove();
			}else if(pNachfolger == aktSong) {
				wl.insert(pVerschiebeSong);
			}
			
			wl.next(); //*
		}
	}
}
