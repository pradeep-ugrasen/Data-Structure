package com.cubicoder.linkedlist;

public class InsertionAtEndIndex {

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

		InsertionAtEndIndex.display(head);
		System.out.println("Before Inserting the new element at zero index");

		Node temp = new Node(40);
		temp.next = head;
		head = temp;

		InsertionAtEndIndex.display(head);
		System.out.println("After Inserting the new element at zero index");
	}

	public static void insertAtKthPosition(Node head, Node temp, int i) {
		// TODO Auto-generated method stub
		
	}
}
