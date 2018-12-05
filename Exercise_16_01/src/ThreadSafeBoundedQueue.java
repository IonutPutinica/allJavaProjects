
public class ThreadSafeBoundedQueue<T> implements QueueADT<T> {

	BoundedArrayQueue<T> bArrayQueue;

	public ThreadSafeBoundedQueue(int capacity) {
		bArrayQueue = new BoundedArrayQueue<T>(capacity);
	}

	@Override
	public synchronized void enqueue(T element) {
		bArrayQueue.enqueue(element);
	}

	@Override
	public synchronized T dequeue() {
		return bArrayQueue.dequeue();
	}

	@Override
	public synchronized T first() {
		return bArrayQueue.first();
	}

	@Override
	public synchronized int indexOf(T element) {
		return bArrayQueue.indexOf(element);
	}

	@Override
	public synchronized boolean isEmpty() {
		return bArrayQueue.isEmpty();
	}

	@Override
	public synchronized boolean isFull() {
		return bArrayQueue.isFull();
	}

	@Override
	public synchronized int size() {
		return bArrayQueue.size();
	}

	public String toString() {
		return bArrayQueue.toString();
	}
}