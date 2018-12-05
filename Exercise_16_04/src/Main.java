public class Main {

	public static void main(String[] args) {
		BlockingQueue<String> queue = new BlockingQueue<String>(20);
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				queue.put("msg1");
				queue.put("msg2");
				queue.put("msg3");
				int q = queue.size();
				System.out.println(q);
			}
		});
		t.start();

	}

}