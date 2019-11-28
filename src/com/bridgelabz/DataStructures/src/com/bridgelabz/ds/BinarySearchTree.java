package com.bridgelabz.ds;
/*
* Created by:Anand Dandi
* Date :09/11/2019
* Purpose:to do inorder traversal of myBinarysearch
* ***/

public class BinarySearchTree {
public static void main(String [] args)
{
	MyBinarySearch bt=new MyBinarySearch();
    com.bridgelabz.ds.MyBinarySearch.Node root = null;
	    
	    root = bt.insert(root, 7);
	    root = bt.insert(root, 4);
	    root = bt.insert(root, 8);
	    root = bt.insert(root, 10);
	    root = bt.insert(root, 3);
	    root = bt.insert(root, 6);
	    root = bt.insert(root, 1);
	    root = bt.insert(root, 16);
	    root = bt.insert(root, 13);
	    
	 // This method mainly calls Inorder 
	    bt.inorder(root);
	  }
    
}

