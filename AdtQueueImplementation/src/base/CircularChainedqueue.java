package base;

import java.util.EmptyStackException;

public class CircularChainedqueue<T> implements QueueInterface<T> {
	
	private T[] queue;
	private int frontIndex;
	private int backIndex;
	private boolean initialized = false;
	private static final int DEFAULT_CAPACITY = 50;
	private static final int MAX_CAPACITY = 10000;
	
	public CircularChainedqueue() {
		this(DEFAULT_CAPACITY);
	}// default constructor
	
	public CircularChainedqueue(int initialCapacity) {
		//checkCapacity(initialCapacity);
		
	@SuppressWarnings("unchecked")
	T[] tempQueue = (T[]) new Object[initialCapacity+1];
	queue = tempQueue;
	frontIndex = 0;
	backIndex = initialCapacity;
	initialized = true;
	}

	private void checkCapacity(int initialCapacity) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void enqueue(T newEntry) {
		// TODO Auto-generated method stub
		checkInitialization();
		ensureCapacity();
		backIndex = (backIndex +1)%queue.length;
		queue[backIndex] = newEntry;
		
	}

	private void ensureCapacity() {
		// TODO Auto-generated method stub
		if(frontIndex ==((backIndex+2)%queue.length)) {
			T[] oldQueue = queue;
			int oldSize = oldQueue.length;
			int newSize = 2 * oldSize;
			checkCapacity(newSize);
			
			@SuppressWarnings("unchecked")
			T[] tempQueue = (T[]) new Object[newSize];
			queue = tempQueue;
			for(int index = 0;index <oldSize-1;index++) {
				queue[index] = oldQueue[frontIndex];
				frontIndex = (frontIndex+1)%oldSize;
			}
			frontIndex = 0;
			backIndex = oldSize -2;
		}
		
		
	}

	private void checkInitialization() {
		// TODO Auto-generated method stub
		if(!initialized)
			throw new SecurityException(""
					+ "ArrayBag object is not initialized properly");
		
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		checkInitialization();
		if(isEmpty())
			throw new EmptyStackException();
		else {
			T front = queue[frontIndex];
			queue[frontIndex] = null;
			frontIndex = (frontIndex+1)%queue.length;
			return front;
		}
		
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		checkInitialization();
		if(isEmpty())
			throw new EmptyStackException();
		else
			return queue[frontIndex];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return frontIndex ==((backIndex +1)% queue.length);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		checkInitialization();
		if(isEmpty()) {
			for(int index = frontIndex; index != backIndex; index = (index +1)% queue.length) {
				queue[index] = null;
			}
			queue[backIndex] = null;
		}
			
		frontIndex = 0;
		backIndex = queue.length-1;
		
	}


}
