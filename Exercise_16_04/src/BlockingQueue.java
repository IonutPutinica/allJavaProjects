
public class BlockingQueue<T> implements Buffer<T> {

	private BoundedArrayQueue<T> queue;

	public BlockingQueue(int capacity) {
		queue = new BoundedArrayQueue<T>(capacity);
	}

	@Override
	public synchronized void put(T element) {
		if (queue.isFull())
			try {
				wait();
				notify();
			} catch (InterruptedException | IllegalArgumentException e) {
				e.printStackTrace();
		} else {
			queue.enqueue(element);
			System.out.println(element);
		}
	}

	@Override
	public synchronized T take() {
		if (queue.isEmpty())
			try {
				wait();
				notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		else {
			return queue.dequeue();
		}
		throw new IllegalStateException();
	}

	@Override
	public synchronized T look() {
		if (queue.isEmpty())
			return null;
		return queue.first();
	}

	@Override
	public synchronized boolean isEmpty() {
		return queue.isEmpty();
	}

	@Override
	public synchronized boolean isFull() {
		return queue.isFull();
	}

	@Override
	public synchronized int size() {
		return queue.size();
	}
}