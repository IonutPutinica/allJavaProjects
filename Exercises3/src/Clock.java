
public class Clock {
	
	private int hour;
	private int minute;
	private int second;
	
	public void set(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
	

}
