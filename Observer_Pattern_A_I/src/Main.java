import Observer_Pattern.*;

public class Main {

	public static void main(String[] args) {
		
		Shop shopMagazin = new Shop();

		Person person1 = new Person("Person A", "Item A", 40);
		Person person2 = new Person("Person B", "Item B", 25);
		Person person3 = new Person("Person C", "Item C", 0);

		shopMagazin.subscribePerson(person1);
		shopMagazin.subscribePerson(person2);
		shopMagazin.subscribePerson(person3);

		System.out.println("Observers list populated.\n");

		shopMagazin.notifyObserver();

		shopMagazin.unsubscribePerson(person1);
		shopMagazin.unsubscribePerson(person2);
		shopMagazin.unsubscribePerson(person3);

		System.out.println("\nObeserver list cleared.");
	}
}