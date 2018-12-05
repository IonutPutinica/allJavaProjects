import ObserverPattern.*;

public class Main {

	public static void main(String[] args) {

		Shop shop = new Shop();
		Person person1 = new Person(40);
		Person person2 = new Person(25);
		Person person3 = new Person(0);

		shop.subscribePerson(person1);
		shop.subscribePerson(person2);
		shop.subscribePerson(person3);

		System.out.println("Observers list populated.\n");

		shop.notifyObserver();

		shop.unsubscribePerson(person1);
		shop.unsubscribePerson(person2);
		shop.unsubscribePerson(person3);

		System.out.println("\nObeservers removed from list.");
	}
}