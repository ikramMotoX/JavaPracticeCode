package base;

import java.util.EmptyStackException;

public class LinkedQueue<T> implements QueueInterface<T> {
	
	private Node<T> firstNode;
	private Node<T> lastNode;
	
	public LinkedQueue() {
		firstNode = null;
		lastNode = null;
	}// default constructor

	@Override
	public void enqueue(T newEntry) {
		// TODO Auto-generated method stub
		Node<T> newNode = new Node<T>(newEntry, null);
		
		if(isEmpty())
			firstNode = newNode;
		else
			lastNode.setNextNode(newNode);
		lastNode = newNode;
		
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		T front = getFront(); // Might Throw emptyStack exception
		firstNode.setData(null);
		firstNode = firstNode.getNextNode();
		
		if(firstNode == null)
			lastNode = null;
		
		return front;
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new EmptyStackException();// No EmptyQueueException in Java
		else
			return firstNode.getData();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (firstNode == null)&&(lastNode == null);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		firstNode = null;
		lastNode = null;
		
	}

}
