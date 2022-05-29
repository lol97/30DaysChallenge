package linkedlist;

import java.util.LinkedList;

public class LinkedListUs {
	// Properties
	Node head;
	int count;

	// Constructor
	public LinkedListUs(Node newHead) {
		head = newHead;
		count = 1;
	}

	// Methods
	// add
	public void add(int newData) {
		Node temp = new Node(newData);
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}

	// get
	public int get(int index) throws Exception {
		if (index <= 0) {
			throw new Exception("invalid index");
		}
		Node current = head;
		for (int i = 1; i < index; i++) {
			current = current.getNext();
		}
		return current.getData();
	}

	// size
	public int size() {
		return this.count;
	}

	// isEmpty
	public boolean isEmpty() {
		return head == null;
	}

	// remove
	public void remove() {
		// remove from the back of the list
		Node current = head;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
		count--;
	}

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("waaa");
		linkedList.addFirst("alice");
		System.out.println(linkedList.get(0));
	}
}
