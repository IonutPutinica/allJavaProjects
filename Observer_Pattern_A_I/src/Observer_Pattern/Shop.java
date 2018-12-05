package Observer_Pattern;
import java.util.ArrayList;

public class Shop implements Subject {
	// Create class attributes - association between Shop and Observer;
	// class is expressed with the bellow array.
	private ArrayList<Observer> allObservers;

	public Shop() {
	// Initialize class attributes in constructor.
	allObservers = new ArrayList<>();
	}

	@Override
	public void subscribePerson(Observer obj) {
	// Subscribe a Person to ArrayList.
	allObservers.add(obj);
	}

	@Override
	public void unsubscribePerson(Observer obj) {
	// Unsubscribe a Person from ArrayList.
	allObservers.remove(obj);
	}

	@Override
	public void notifyObserver() {
	// Update all observers in ArrayList.
	for (Observer o : allObservers) {
	o.update();
		}
	}
}