package com.cubicoder.doubly.linkedlist;

public class InsertionAndDispalyElement {

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
		
		InsertionAndDispalyElement.diplay(head);

	}
}
