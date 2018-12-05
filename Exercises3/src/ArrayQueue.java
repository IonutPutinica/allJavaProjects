

public class ArrayQueue<T> implements QueueADT<T> {

	private static final int DEFAULT_CAPACITY = 100;
	private int front;
	private int count;
	private T[] queue;

	public ArrayQueue() {
		front = 0;
		count = 0;
		queue = (T[]) new Object[DEFAULT_CAPACITY];
	}

	public ArrayQueue(int initialCapacity) {
		front = 0;
		count = 0;
		queue = (T[]) new Object[initialCapacity];
	}

	@Override
	public void enqueue(T element) {
		if (queue[(front + count) % queue.length] == null) {
			queue[(front + count) % queue.length] = element;
			count++;
		} else {
			expandCapacity();
			queue[(front + count) % queue.length] = element;
			count++;
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
		} else
			throw new IllegalStateException("Queue is empty");
	}

	@Override
	public int indexOf(T element) {
		for (int i = front, x = 0; x < count; i = (i + 1) % queue.length, x++)
			if (queue[i].equals(element))
				return i;
		return -1;
	}

	@Override
	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public String toString() {
		String result = "{";

		for (int i = front, x = 0; x < count; i = (i + 1) % queue.length, x++)
			result += queue[i].toString() + ", ";

		return result + "}";
	}

	private void expandCapacity() {
		T[] expanded = (T[]) new Object[queue.length * 2];

		for (int i = front, x = 0; x < count; i = (i + 1) % queue.length, x++)
			expanded[x] = queue[i];

		queue = expanded;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return null;
	}

}
