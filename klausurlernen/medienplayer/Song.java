package klausurlernen.medienplayer;

public class Song {
	
	private String title;
	private String band;
	
	public Song(String pTitle, String pBand) {
		title = pTitle;
		band = pBand;
	}
	
	public void play() {
		System.out.println("Jetzt spielt " + title + " von " + band);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}
	
}
