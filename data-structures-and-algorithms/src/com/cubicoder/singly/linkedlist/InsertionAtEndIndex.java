package com.cubicoder.singly.linkedlist;

public class InsertionAtEndIndex {
	
	public static void append(Node head,int new_data)  { 
	    
		/* 1. Allocate the Node & 
	       2. Put in the data 
	       3. Set next as null */
	    Node new_node = new Node(new_data); 
	  
	    /* 4. If the Linked List is empty, then make the 
	           new node as head */
	    if (head == null) { 
	        head = new Node(new_data); 
	        return; 
	    } 
	  
	    /* 4. This new node is going to be the last node, so 
	         make next of it as null */
	    new_node.next = null; 
	  
	    /* 5. Else traverse till the last node */
	    Node last = head;  
	    while (last.next != null) 
	        last = last.next; 
	  
	    /* 6. Change the next of last node */
	    last.next = new_node; 
	    return; 
	}
	
	
	public static void display(Node head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static void main(String[] args) {

		Node head = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);

		head.next = node2;
		node2.next = node3;
		
		System.out.println("Before Inserting the new element at End index");
		InsertionAtEndIndex.display(head);

		InsertionAtEndIndex.append(head, 40);
		
		System.out.println("After Inserting the new element at zero index");
		InsertionAtEndIndex.display(head);
	}

}
