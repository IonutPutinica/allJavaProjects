public class Adding implements Runnable {

	private String id;
	private long sleepTime;
	private QueueADT<String> queue;

	public Adding(QueueADT<String> queue, String id, long sleepTime) {
		this.id = id;
		this.sleepTime = sleepTime;
		this.queue = queue;
	}

	public void run() {
		for (int i = 0; i < 5; i++)
			queue.enqueue(id + " " + i);
		System.out.println("ID:" + id + ", queue:" + queue);
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {

		}
	}

}
