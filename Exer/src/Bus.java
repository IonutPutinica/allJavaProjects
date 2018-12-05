import java.util.Observable;

public class Bus extends Observable {
	private String info;
	
	private static Bus only;
	
	private Bus() {
		this.info = "eXpress " + hashCode() % 100;
	}

	public static Bus getInstance() {
		if (only == null) {
			only = new Bus();
		}
		return only;
	}
	
	public void passengerGettingIn(BusPassenger p) {
		setChanged();
		String notify = "Enter:" + p.getName();  
		notifyObservers(notify);
		addObserver(p);
	}

	public void passengerGettingOut(BusPassenger p) {
		setChanged();
		deleteObserver(p);
		String notify = "Leave:" + p.getName();  
		notifyObservers(notify);
	}

	public String getInfo() {
		return info;
	}

	public String toString() {
		return getInfo();
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Bus))
			return false;
		Bus b = (Bus) obj;
		return info.equals(b.info);
	}
}