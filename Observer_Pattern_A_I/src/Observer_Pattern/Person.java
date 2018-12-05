package Observer_Pattern;

public class Person implements Observer {

	public String personName;
	public String itemName;
	public int discount;

	public Person(String personName, String itemName, int discount) {

		this.personName = personName;
		this.itemName = itemName;
		this.discount = discount;
	}

	@Override
	public void update() {
	// Update method returns the bellow specified messages.
		if (discount != 0 && itemName != null) {
			System.out.println("User is eligable for a discount and item is available.");
		} else {
			System.out.println("There is no current discount for this user.");
		}
	}
}