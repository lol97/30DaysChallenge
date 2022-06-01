package hackerank;

import java.util.LinkedList;

public class Queuey {
	LinkedList<Object> queue;

	// making a queue instance
	public Queuey() {
		this.queue = new LinkedList<Object>();
	}
	
	// is our queue empty ?
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public int size()
	{
		return queue.size();
	}
	
	public void enqueue(Object n) {
		queue.addLast(n);
	}
	
	public Object dequeue() {
		return queue.remove(0);
	}
	
	public Object peek() {
		return queue.get(0);
	}
	
	public static void main(String[] args) {
		Queuey numberQueue = new Queuey();
		numberQueue.enqueue(10);
		numberQueue.enqueue(9);
		numberQueue.enqueue(7);
		numberQueue.enqueue(5);
		System.out.println("First out : " + numberQueue.dequeue());
		System.out.println("Second out : " + numberQueue.dequeue());
		System.out.println("Thrid out : " + numberQueue.dequeue());
		System.out.println("Fourth out : " + numberQueue.dequeue());
		
		Queuey stringQueue = new Queuey();
		stringQueue.enqueue("Hi");
		stringQueue.enqueue("There");
		System.out.println("First Out : "+ stringQueue.dequeue());
		System.out.println("Second Out : "+ stringQueue.dequeue());
	}
}
