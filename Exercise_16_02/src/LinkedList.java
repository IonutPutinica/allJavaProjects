
public class LinkedList<T> implements ListADT<T> {

	private int DEFAULT_CAPACITY = 100;
	private T[] list;
	private int size;

	public LinkedList() {
		list = (T[]) new Object[DEFAULT_CAPACITY];
		size = 0;
	}

	@Override
	public void add(int index, Object element) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}
		if (isFull()) {
			throw new IllegalStateException();
		}
	}

	@Override
	public void add(T element) {
		if (isFull()) {
			throw new IllegalStateException();
		}
	}

	@Override
	public void set(int index, T element) {
		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException();
		}
		list[index] = element;
	}

	@Override
	public T get(int index) {
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
	public T remove(int index) {
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
	public void remove(T element) {
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
	public int indexOf(T element) {
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
	public boolean contains(T element) {
		if (indexOf(element) == -1) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public boolean isFull() {
		return (size == DEFAULT_CAPACITY);
	}

	@Override
	public int size() {
		return size;
	}

	public String toString() {
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