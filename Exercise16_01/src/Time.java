
public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public Time(int timeInSeconds) {
		if (timeInSeconds < 0) {
			timeInSeconds = 0;
		}
		this.hour = timeInSeconds / 3600;
		this.minute = (timeInSeconds % 3600) / 60;
		this.second = (timeInSeconds % 3600) % 60;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getTimeInSeconds()
	{
		int TimeInSeconds=this.hour*3600+this.minute*60+this.second;
		return TimeInSeconds;
	}

	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

	

}
