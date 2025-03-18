package com.cubicoder.doubly.linkedlist;

public class InsertatBeginofDoublyLL {

	public static Node insertAtBegning(Node head, int data) {
		
		Node newNode = new Node(data);
		
		newNode.next= head;
		if(head != null) {
			head.prev = newNode;
		}
		
		head = newNode;
		
		return head;
	}
	
	public static void diplay(Node head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;

		}
	}

	public static void main(String[] args) {

		Node head = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);

		head.prev = null; // Optional
		head.next = node2;

		node2.prev = head;
		node2.next = node3;

		node3.prev = node2;
		node3.next = null; // Optional
		
		System.out.println("Before insert the data");
		InsertatBeginofDoublyLL.diplay(head);
		
		head = InsertatBeginofDoublyLL.insertAtBegning(head, 5);
		
		System.out.println("After insert the data");
		InsertatBeginofDoublyLL.diplay(head);
	}
}
