package com.bridgelabz.ds;
		public class MyBinarySearch {
			class Node {
				  Node left;
				  Node right;
				  int data;
				}

		  
		  public void inorder(Node node) {
		    if(node == null) {
		      return;
		    }
		 //to do inorder traversal of myBinarysearch
		    inorder(node.left);
		    System.out.print(node.data + " ");
		    inorder(node.right);
		  }
		  public Node createNewNode(int k) { //At first time root element is 8
			    Node a = new Node();
			    a.data = k;
			    a.left = null;
			    a.right = null;
			    return a;
			  }
		  
		  public Node insert(Node node, int val) {
		    if(node == null) { 
		      return createNewNode(val);
		    } 
		/*
		 * node not equal to null here first time val=3 comparing with node =8
		 */
		 
		    if(val < node.data) {
		      node.left = insert(node.left, val);
		    } else if((val > node.data)) {
		      node.right = insert(node.right, val);
		    }
		    
		    return node;
		  }
		  public void display()
		  {
			  
		  }
		  
		  
		  
		  
		}

