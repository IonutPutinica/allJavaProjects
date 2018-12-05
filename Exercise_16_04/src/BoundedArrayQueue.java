
public class BoundedArrayQueue<T> implements QueueADT<T> {

	private int front;
	private int count;
	private T[] queue;

	public BoundedArrayQueue(int capacity) {
		front = 0;
		count = 0;
		queue = (T[]) new Object[capacity];
	}

	@Override
	public void enqueue(T element) {
		if (queue[(front + count) % queue.length] == null) {
			queue[(front + count) % queue.length] = element;
			count++;
		} else {
			throw new IllegalStateException("Queue is full");
		}

	}

	@Override
	public T dequeue() {
		if (queue[front] != null) {
			T result = queue[front];
			queue[front] = null;
			count--;
			front++;
			return result;
		} else {
			throw new IllegalStateException("Queue is empty");
		}
	}

	@Override
	public int indexOf(T element) {
		for (int i = front, x = 0; x < count; i = (i + 1) % queue.length, x++) {
			if (queue[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean isFull() {
		if (count == queue.length) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public T first() {
		if (queue[front] != null) {
			return queue[front];
		}
		throw new IllegalStateException("Queue is empty");
	}

	public String toString() {
		String result = "{";

		for (int i = front, x = 0; x < count; i = (i + 1) % queue.length, x++) {
			result += queue[i].toString() + ", ";
		}
		return result + "}";
	}
}
