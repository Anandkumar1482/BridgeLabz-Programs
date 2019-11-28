package com.bridgelabz.ds;
public class MyLinkedList<T>{
	Node head;

	// every list having node that start with head
	public void insert(int data) {

		// to implement the functions
		// to insert data first creating node object

		Node node = new Node();
		// to initialize of an object
		node.data = data;
		node.next = null;// by default value is null
		// insert the nodes into list,list having head

		if (head == null) {
			head = node;
		} else // if head is not null
		{
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void insertAtStart(int data) {
		// To insert at start index position
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {
		if (index == 0) {
			// to insert the element at 0 index position
			insertAtStart(data);
		}
		// to insert the element at 2 index position

		Node node = new Node();
		node.data = data;
		node.next = null;
		Node temp = head;
		// we know that the index value
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
	}

	// to delete index position 2 and value is 10
	public void deleteAt(int index) {
		if (index == 0)// to delete index position 0 ,to change head location
		{
			head = head.next;
		}
		// index position is not equal to '0'
		else { // to traverse the head location
			Node temp = head;
			Node temp1 = null;
			// node.next=null;
			// we know that the index value
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			temp1 = temp.next;
			temp.next = temp1.next;
			System.out.println("temp1  " + temp1.data);
			temp1 = null;//eligible for garbage collector
		}
	}

	public int search(int data) {
		Node temp = head;
		int count=0;
		if(head == null) {
			System.out.println("Your list has no elements ");
		}
		else {
			while (temp.next != null) {
				if (temp.data == data) {
					//System.out.println("the element is " + temp.data);
				    return count;
				}
				temp = temp.next;
				count++;
			}
		}
		return -1;
	}
	
	public int size() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
		    temp = temp.next;
		}
		return count;
	}
public void delete(int index)
{
	Node temp=head;
	if(index==0) {
	head=head.next;
	}
	else
	{
		for(int i=0;i<index-1;i++) {
			
			temp=temp.next1;
		}
		Node temp1 = temp.next1;
		temp.next1 = temp1.next1;
		
	}
}
	
	public boolean isEmpty()
	{
		return head==null;
			
	}

	
	

	public void show() {
		Node node = head;// to start with the head
		while (node.next != null)// node.next is not equal to null
		{
			System.out.println(node.data);// to print node data
			// System.out.println(node.next);
			node = node.next;
		}
		System.out.println(node.data);
	}

	 //sortList() will sort nodes of the list in ascending order  
	
	public void appropriatePosition(int num) {
		  //sortList() will sort nodes of the list in ascending order   
            //Node current will point to head  
            Node current = head, index = null;  
            int temp;  
              
            if(head == null) {  
                return;  
            }  
            else {  
                while(current != null) {  
                    //Node index will point to node next to current  
                    index = current.next1;  
                      
                    while(index != null) {  
                        //If current node's data is greater than index's node data, swap the data between them  
                        if(current.num> index.num) {  
                            temp = current.num;  
                            current.num = index.num;  
                            index.num= temp;  
                        }  
                        index = index.next1;  
                    }  
                    current = current.next1;  
                }      
            }  
        }  
		
	}


