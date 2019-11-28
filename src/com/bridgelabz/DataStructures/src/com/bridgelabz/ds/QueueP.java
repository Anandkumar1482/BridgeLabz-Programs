package com.bridgelabz.ds;
/*Queue is data structure,collection of items will be inserted at one end is called rear
 * and removed at the one end is called front
 */

public class QueueP {
	class Node {
		// Node class is used to store elements into the Queue
		String data;
		Node next;
	}

//Queue having some properties
	Node front;
	Node rear;
	int size = 0;
//to implement enQueue() method
	public void enQueue(String primeNumbers) {
		// to initialize front and rear
		//front = null;
		//rear = null;
		// to add elements in queue first create node object
		Node node = new Node();
		node.data = primeNumbers;
		node.next = null;
		//System.out.println(node.data);
		//System.out.println(node.next);
		if (rear == null) {
			// first time inserting the elements front and rear should be same
			front = node;
			rear = node;
			//System.out.println("queue is empty");
		} else {
			rear.next=node;
			rear=node;
		}
	}
	

	public void deQueue() {
		if(front==null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			Node temp=front;
			temp=temp.next;
			temp.next=null;
			
		}
	}	
	
	public String display() {
		Node temp=front;
		if(front==null)
		{
			System.out.println("queue is empty");
		}
		else {
			while(temp!=null)
			{
				System.out.println(temp.data);
			temp=temp.next;
			}
		}
		return null;
	}
	
}




