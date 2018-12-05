
public class CDTrackTest {
	public static void main(String[] args) {
		CDTrack[] playlist = new CDTrack[3];
		Time time1 = new Time(1, 21, 20);
		CDTrack track1 = new CDTrack("Radioactive", "Imagine Dragons", time1);
		Time time2 = new Time(1, 22, 15);
		CDTrack track2 = new CDTrack("Demons", "Imagine Dragons", time2);
		Time time3 = new Time(1, 23, 25);
		CDTrack track3 = new CDTrack("Thunder", "Imagine Dragons", time3);
		playlist[0] = track1;
		playlist[1] = track2;
		playlist[2] = track3;

		for (int i = 0; i < 3; i++) {
			System.out.println(playlist[i].toString());
		}
	}
}
