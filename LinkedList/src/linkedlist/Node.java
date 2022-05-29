package linkedlist;

public class Node {
	// Properties
	Node next;
	int data;

	// Methods

	// Constructor
	public Node(int newData) {
		this.data = newData;
		this.next = null;
	}

	public Node(int newData, Node newNext) {
		this.data = newData;
		this.next = newNext;
	}

	// Getter and Setter
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
