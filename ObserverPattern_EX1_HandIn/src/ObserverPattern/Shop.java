package ObserverPattern;

import java.util.ArrayList;

public class Shop implements Subject {
	private ArrayList<Observer> allObservers;

	public Shop() {
		allObservers = new ArrayList<>();
	}

	@Override
	public void subscribePerson(Observer obj) {
		allObservers.add(obj);
	}

	@Override
	public void unsubscribePerson(Observer obj) {
		allObservers.remove(obj);
	}

	@Override
	public void notifyObserver() {
		for (Observer o : allObservers) {
			o.update();
		}
	}
}
