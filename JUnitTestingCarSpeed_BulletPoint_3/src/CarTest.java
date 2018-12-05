import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {	
	
	@Test
	public void testCheckSpeed() {
		BlueCar blueCar = new BlueCar();
	//		   		 true		 true
		assertEquals(true, blueCar.checkSpeed());
	}
	@Test
	public void testTurnedOffEngine() {
		BlueCar blueCar = new BlueCar();
		boolean receivedValue = blueCar.turnOffEngine();
	//				 true		true
		assertEquals(true, receivedValue);
	}
}




