
public class ThreadMain {

	public static void main(String[] args) {

		ArrayQueue<String> arrayQueue1 = new ArrayQueue<String>();
		ArrayQueue<String> arrayQueue2 = new ArrayQueue<String>();
		ArrayQueue<String> arrayQueue3 = new ArrayQueue<String>();
		Runnable r1 = new Adding(arrayQueue1, "1", 1000);
		Runnable r2 = new Adding(arrayQueue2, "2", 2000);
		Runnable r3 = new Adding(arrayQueue3, "3", 3000);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();

	}

}
