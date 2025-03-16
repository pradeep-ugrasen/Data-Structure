package com.cubicoder.linkedlist;

public class InsertionAtZeroIndex {
	
	
	public static  Node push(Node head, int new_data) { 
	    /* 1 & 2: Allocate the Node & Put in the data*/
	    Node new_node = new Node(new_data); 
	  
	    /* 3. Make next of new Node as head */
	    new_node.next = head; 
	  
	    /* 4. Move the head to point to new Node */
	    head = new_node;
	    
	    return head;
	}
	
	
	public static void display(Node head) {
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public static void main(String[] args) {

		Node head = new Node(20);
		Node node2 = new Node(30);
		Node node3 = new Node(40);

		head.next = node2;
		node2.next = node3;
		
		System.out.println("Before Inserting the new element at zero index:");
		InsertionAtZeroIndex.display(head);
		
		head = InsertionAtZeroIndex.push(head, 10);
		
		System.out.println("After Inserting the new element at zero index");
		InsertionAtZeroIndex.display(head);
	}
}
