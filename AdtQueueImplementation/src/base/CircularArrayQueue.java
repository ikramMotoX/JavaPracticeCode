package base;

import java.util.EmptyStackException;

public class CircularArrayQueue<T> implements QueueInterface<T> {
	
	private T[] queue;
	private int frontIndex;
	private int backIndex;
	private boolean integrityOk;
	private static final int DEFAULT_CAPACITY = 50;
	private static final int MAX_CAPACITY = 10000;
	
	public CircularArrayQueue() {
		this(DEFAULT_CAPACITY);
	}//end of default constructor
	
	public CircularArrayQueue(int initialCapacity) {
		
		integrityOk = false;
		checkCapacity(initialCapacity);
		
		@SuppressWarnings("unchecked")
		T[] tempQueue = (T[])new Object[initialCapacity+1];
		queue = tempQueue;
		frontIndex = 0;
		backIndex = initialCapacity;
		integrityOk = true;
		
	}

	private void checkCapacity(int initialCapacity) {
		// TODO Auto-generated method stub
		if(initialCapacity > MAX_CAPACITY)
			throw new IllegalStateException("Attempt to create a queue whose "+
											"capacity exceeds allowed "+
												"maximum of "+ MAX_CAPACITY);
			
		
	}

	@Override
	public void enqueue(T newEntry) {
		// TODO Auto-generated method stub
		checkIntegrity();
		ensureCapacity();
		backIndex = (backIndex+1)%queue.length;
		queue[backIndex] = newEntry;
	
	}

	private void ensureCapacity() {
		// TODO Auto-generated method stub
		if(frontIndex == ((backIndex +2)%queue.length)) {
			T[] oldQueue = queue;
			int oldSize = oldQueue.length;
			int newSize = 2 * oldSize;
			checkCapacity(newSize - 1);
			integrityOk = false;
			
			@SuppressWarnings("unchecked")
			T[] tempQueue = (T[])new Object[newSize];
			queue = tempQueue;
			for(int index = 0; index < oldSize;index++) {
				queue[index] = oldQueue[frontIndex];
				frontIndex = (frontIndex+1)% oldSize;
			}//end of for loop
			frontIndex = 0;
			backIndex = oldSize - 2;
			integrityOk = true;
		}
		
	}

	private void checkIntegrity() {
		// TODO Auto-generated method stub
		if(!integrityOk)
			throw new SecurityException("ArrayBag object is currupt");
		
		
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		checkIntegrity();
		if(isEmpty())
			throw new EmptyStackException();
		else{
			T front = queue[frontIndex];
			queue[frontIndex] = null;
			frontIndex = (frontIndex+1)% queue.length;
			return front;
		}
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		checkIntegrity();
		if(isEmpty())
			throw new EmptyStackException();
		else
			return queue[frontIndex];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		checkIntegrity();
		return frontIndex == ((backIndex +1)% queue.length);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
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
