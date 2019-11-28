package com.bridgelabz.ds;

public class MyDeQueue<T> {

	Node head, tail;
	public MyDeQueue() {
		head = null;
		tail = null;
		
	}

	class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	/*
	 * add an element at the rear of the queue and returns the element
	 */
	public char enqueue(char val) {
		if (tail == null) {
			head = tail = new Node(val);
		} else {
			Node newnode = new Node(val);
			tail.next = newnode;
			tail = newnode;
		}
		return 0;
	}

	/*
	 * Removes an element at the front of the queue and returns the element
	 */
	public void dequeue(char i) {
		if (head != null) {
			head = head.next;
		}
	}
	/*
	 * to display elements
	 * 
	 */

	public void display() {
		Node node = head;// to start with the head
		while (node.next != null)// node.next is not equal to null
		{
			node = node.next;
		}
	}

	/*
	 * Checks if the queue is empty or has elements.
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/*
	 *add elements at rear 
	 *
	 */
	
	public void addrear(char var) {
		Node node = new Node(var);
		Node tail = null;
		node.next = head;
		head = node;
	

	}

	/**
	 *remove elements at front 
	 * 
	 */

	public char removefront(char val) {
		char temp;
		if (head == null) {
			System.out.println("queue is empty");
		}
		temp=(char) head.val;
		head = head.next;
		return temp;

	}
}

 
 
 
