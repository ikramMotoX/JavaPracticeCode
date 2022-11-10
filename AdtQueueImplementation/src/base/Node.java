package base;

public class Node<T> {
	private T data;
	private Node<T> next;
	
	Node(T dataPortion) {
		this(dataPortion, null);
	}
	Node(T dataPortion, Node<T> nextNode) {
		data = dataPortion;
		next = nextNode;
	}
	T getData() {
		return data;
	}
	void setData(T newData) {
		this.data = newData;
	}
	Node<T> getNextNode() {
		return next;
	}
	void setNextNode(Node<T> nextNode) {
		this.next = nextNode;
	}

}
