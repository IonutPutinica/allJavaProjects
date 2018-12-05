// composition - black diamond - copy
// association - nothing
// aggregation - empty diamond

//size and max => array
// no size and no limit => arrayList

public class CDTrack {
	private String title;
	private String artist;
	private Time length;
	
	public CDTrack(String title, String artist, Time length) {
		this.title = title;
		this.artist = artist;
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public Time getlength() {
		return length;
	}

	public String toString() {
		return "CDTrack [title=" + title + ", artist=" + artist + ", length=" + length + "]";
	}
	
	
}
