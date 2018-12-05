
public class ThreadSafeList<T> implements ListADT<T> {

	private ListADT<T> list;

	@Override
	public synchronized void add(int index, T element) {
		list.add(index, element);
	}

	@Override
	public synchronized void add(T element) {
		list.add(element);
	}

	@Override
	public synchronized void set(int index, T element) {
		list.set(index, element);
	}

	@Override
	public synchronized T get(int index) {
		return list.get(index);
	}

	@Override
	public synchronized T remove(int index) {
		return list.remove(index);
	}

	@Override
	public synchronized void remove(T element) {
		list.remove(element);
	}

	@Override
	public synchronized int indexOf(T element) {
		return list.indexOf(element);
	}

	@Override
	public synchronized boolean contains(T element) {
		if (list.contains(element)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public synchronized boolean isEmpty() {
		if (list.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public synchronized boolean isFull() {
		return list.isFull();
	}

	@Override
	public synchronized int size() {
		return list.size();
	}
}