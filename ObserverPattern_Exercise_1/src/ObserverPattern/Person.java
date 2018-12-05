package ObserverPattern;

public class Person implements Observer {
	public int discount;

	public Person(int discount) {
		this.discount = discount;
	}

	@Override
	public void update() {
		// Update method returns the bellow specified messages.
		if (discount != 0) {
			System.out.println("User is eligable for a discount for an item.");
		} else {
			System.out.println("There is no current discount for this user currently.");
		}
	}
}