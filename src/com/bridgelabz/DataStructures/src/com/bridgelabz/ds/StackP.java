package com.bridgelabz.ds;

public class StackP {
	class Node {
		String data;
		Node next;
	}

	Node head;
//to implement functions

//push the elements in stack
	public void push(String primeNumbers) {
		Node node = new Node();
		node.data = primeNumbers;
		node.next = null;
		// to insert nodes into a list using head
		if (head == null) {
			head = node;
		} else 
		{// if node is not equal
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

//to perform  peek() operation on top of the stack
	public String peek() {
		if (head == null) {
			System.out.println("stack is empty");
		}
		return head.data;
	}

//to perform pop() operation
	public String pop() {
		if (head == null) {
			System.out.println("stack is empty");
		}
		Node temp = head;
		head = head.next;
		return temp.data;
	}
//to implement  size()
	public int size() {
		if (head == null) {
			return 0;
		}
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

// Utility function to check if the stack is empty or not 
	public boolean isEmpty() {
		return head == null;
	}

//to display all the elements
	public String display() {
		if (head == null) {
			System.out.println("Stack is empty");
		}
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		return null ;
		// to print last element of the stack
		//System.out.println(temp.next);
	}

}


