
public class ArrayList<T> implements ListADT<T> {

	private int DEFAULT_CAPACITY = 100;
	private int size;
	private T[] list;

	public ArrayList() {
		list = (T[]) new Object[DEFAULT_CAPACITY];
		size = 0;
	}

	@Override
	public synchronized void add(int index, T element) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}
		if (isFull()) {
			throw new IllegalStateException();
		}

		for (int i = size - 1; i > index; i--) {
			list[i] = list[i - 1];
		}

		list[index] = element;
		size++;

	}

	@Override
	public synchronized void add(T element) {
		if (isFull()) {
			throw new IllegalStateException();
		}
		list[size] = element;
		size++;
	}

	@Override
	public synchronized void set(int index, T element) {
		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException();
		}

		list[index] = element;

	}

	@Override
	public synchronized T get(int index) {

		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException();
		}

		return list[index];

	}

	@Override
	public synchronized T remove(int index) {
		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException();
		}

		T result = list[index];

		for (int i = index; i < size - 1; i++) {
			list[i] = list[i + 1];
		}
		size--;

		return result;
	}

	@Override
	public synchronized void remove(T element) {
		int index = indexOf(element);

		if (index == -1) {
			throw new IllegalStateException();
		}
		for (int i = index; i < size - 1; i++) {
			list[i] = list[i + 1];
		}
		size--;
	}

	@Override
	public synchronized int indexOf(T element) {
		if (element != null) {
			for (int i = 0; i < size; i++) {
				if (element.equals(list[i])) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < size; i++) {
				if (list[i] == null) {
					return i;
				}

			}
		}
		return -1;
	}

	@Override
	public synchronized boolean contains(T element) {
		if (indexOf(element) == -1) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public synchronized boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public synchronized boolean isFull() {
		return (size == DEFAULT_CAPACITY);
	}

	@Override
	public synchronized int size() {
		return size;
	}

	public synchronized String toString() {
		String result = "[";
		for (int i = 0; i < size(); i++) {
			result += list[i];
			if (i != size() - 1) {
				result += ", ";
			}
		}
		result += "]";
		return result;
	}
}