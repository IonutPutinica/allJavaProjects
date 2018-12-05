
public class BlueCar {

	CarLogic carLogicInstance;

	public BlueCar() {
		carLogicInstance = new CarLogic(233);
	}

	public boolean checkSpeed() {
		if (carLogicInstance.getCarSpeed() >= 230) {
			System.out.println("The car speed is in a dangerous state. Turning off engine...");
			return true;
		}
		System.out.println("The car speed is within safety limits.");
		return false;
	}

	public boolean turnOffEngine() {
		if (checkSpeed() == true) {
		carLogicInstance.setCarSpeed(0);
		System.out.println("Engine turned off. Car speed: " + carLogicInstance.getCarSpeed());
		return true;
		}
		return false;
		
	}
}



