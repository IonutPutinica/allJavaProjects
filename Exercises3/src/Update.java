import java.util.Scanner;

public class Update implements Runnable {
	private Clock clock;

	public Update(Clock clock) {
		this.clock = clock;
	}

	public void run() {
		Scanner keyboard = new Scanner(System.in);
		int hour = keyboard.nextInt();
		int minute = keyboard.nextInt();
		int second = keyboard.nextInt();
		clock.set(hour, minute, second);
	}
}
