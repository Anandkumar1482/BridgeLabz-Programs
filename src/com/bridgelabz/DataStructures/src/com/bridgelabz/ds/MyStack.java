package com.bridgelabz.ds;

public class MyStack {
		class Node {
			int data;
			Node next;
			public String line;
			public String PrimeNumbers;
		}
        int count=0;
		Node head;
	//to implement functions
		//push the elements in stack
				public void push(String line) {
					Node node = new Node();
					node.line = line;
					node.next = null;
					// to insert nodes into a list using head
					if (head == null) {
						head = node;
						count++;
					} else 
					{// if node is not equal
						Node temp = head;
						while (temp.next != null) {
							temp = temp.next;
						}
						temp.next = node;
						count++;
					}
				}
				
		
				//push the elements in stack
				public void push1(String PrimeNumbers) {
					int data;
					Node node = new Node();
					node.PrimeNumbers = PrimeNumbers;
					node.next = null;
					// to insert nodes into a list using head
					if (head == null) {
						head = node;
						count++;
					} else 
					{// if node is not equal
						Node temp = head;
						while (temp.next != null) {
							temp = temp.next;
						}
						temp.next = node;
						count++;
					}
				}	
				

				Node temp=head;

				public void push1(int dayOfWeek) {
					int data;
					Node node = new Node();
					// keeping the first node as head
					if (head == null) {
						head = node;
						// adding and linking the data one by one to head
					} else {
						Node temp = head;
						while (temp.next != null) {
							temp = temp.next;
						}
						temp.next = node;
						count++;
					}

				}
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	//push the elements in stack
		public void push(int data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			// to insert nodes into a list using head
			if (head == null) {
				head = node;
				count++;
			} else 
			{// if node is not equal
				Node temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}
				temp.next = node;
				count++;
			}
		}

	//to perform  peek() operation on top of the stack
		public char peek() {
			
			if (head == null) {
				System.out.println("stack is empty");
			}
				return (char) head.data;
		}
		
		public int pop1()  {
			if (head == null) {
				System.out.println("stack is empty");
			}
			//Node temp = head;
			head = head.next;
			return count--;
		}
		//
		
		public int size1() {
			Node temp;
			int count = 0;
			if (head != null) {
				count++;
			}
			temp = head;
			while (temp != null) {
				count++; // it will count the how many nodes present in the list
				temp = temp.next;
			}
			return count;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	//to perform pop() operation
		public void pop()  {
			if (head == null) {
				System.out.println("stack is empty");
			}
			//Node temp = head;
			head = head.next;
			count--;
		}
	//to implement  size()
		public int size() {
			return count;
		}

	// Utility function to check if the stack is empty or not 
		public boolean isEmpty() {
			return count == 0 ? true : false;
		}

	//to display all the elements
		public String display() {
			String list = "";
			if (head == null) {
				System.out.println("Stack is empty");
			}
			Node temp = head;
			while (temp != null) {
				//System.out.println(temp.data);
				list+= (char) temp.data;
				temp = temp.next;
			}
			// to print last element of the stack
			//System.out.println(temp.next);
			return list;
		}

		public int search(int n) {
			if(head==null) {
				System.out.println("stack is empty");
			}
			else
			{
				Node temp=head;
				while(temp!=null)
				{
					System.out.println(temp.data);
					temp=temp.next;
				}
			}
			return 0;
		}

		public String display1() {
			if (head == null) {
				System.out.println("Stack is empty");
			}
			Node temp = head;
			while (temp != null) {
				//System.out.println(temp.data);
				System.out.println(temp.data);
				temp=temp.next;
			}
			// to print last element of the stack
			//System.out.println(temp.next);
			return null;
		}
}


