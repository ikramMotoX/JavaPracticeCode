package base;

public class CircularChainedQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueInterface<String> myqueue = new CircularArrayQueue<>();
		myqueue.enqueue("test1");
		myqueue.enqueue("test2");
		myqueue.enqueue("test3");
		myqueue.enqueue("test4");
		myqueue.enqueue("test5");

		// print the front of the queue
		System.out.println(myqueue.getFront());

		// remove front object
		String front = myqueue.dequeue();
		System.out.println(front + " is removed ");

		// check the front object again
		System.out.println(myqueue.getFront());

		// add new object to the queue
		myqueue.enqueue("test5");

		// check if the queue is empty
		System.out.println("Is the queue empty " + myqueue.isEmpty());

		// test clear method
		myqueue.clear();

		// now again run isEmpty method
		System.out.println("Is the queue empty " + myqueue.isEmpty());

	}

}
