package com.bridgelabz.ds;

/*Queue is data structure,collection of items will be inserted at one end is called rear
 * and removed at the one end is called front
 */

public class MyQueue<T> {
	@SuppressWarnings("hiding")
	class Node <T>{
		// Node class is used to store elements into the Queue
		T data;
		Node<T> next;
	}

//Queue having some properties
	Node<T> front;
	Node<T> rear;
	int size = 0;
	public void setSize(int size) {
		this.size=size;
	}
	public int getSize()
	{
		return size;
	}
	
	
	Node<T> head;
	public void enque(T data) {
		Node newnode = new Node();
		if(head == null)
		{
			head = newnode;
		}else {
		Node<T> temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = newnode;
		}
	}
	
	public T deque() {
		if(isEmpty())
		{
			return null;
		}
		else {
		Node<T> temp = head;
		
		head = temp.next;
		return temp.data;
		}
	}
	
		
	public boolean isEmpty() {
		if (head == null) { // if head data present in the list it will return true
			return true;
		}
		return false;//if data is not there it will return false
	}
//to implement enQueue() method
	@SuppressWarnings("unchecked")
	public void enQueue(int i) {
		// to initialize front and rear
		// front = null;
		// rear = null;
		// to add elements in queue first create node object
		Node node = new Node();
		node.data = i;
		node.next = null;
		if (rear == null) {
			// first time inserting the elements front and rear should be same
			// this operation adds a new node after rear and moves the rear to next node
			front =node;
			rear = node;
			//System.out.println("queue is empty");
		} else {
			rear.next=node; // link should be established
			 rear= node; // for every insertion value should be incremented
		}
		setSize(getSize()+1);
	}

	// to implement deQueue()
	public String deQueue() {
		if (front == null) {
			System.out.println("queue is empty");
		} else {
			// this operation remove the front node and moves the front to next node
			Node<T> temp = front;
			temp.next = temp;
			temp.next = null;// the address of next element is null
		}
		setSize(getSize()-1);
		return null;
	}

public int size()
{
	return getSize();
}

//
public int size1() {
	Node<T> temp;
	int count = 0;
	if (head != null) {
		count++;
	}
	temp = head;
	while (temp != null) {
		count++;                 //it will count the how many nodes present in the list
		temp = temp.next;
	}
	return count;
}








	
	public void display() {
		Node<T> temp = front;
		if (front == null) {
			System.out.println("queue is empty");
		} else {
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}

	}
	
}
