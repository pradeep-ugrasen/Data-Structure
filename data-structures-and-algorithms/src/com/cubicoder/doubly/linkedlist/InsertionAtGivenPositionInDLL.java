package com.cubicoder.doubly.linkedlist;

public class InsertionAtGivenPositionInDLL {

	public static Node insertAtGivenPosition(Node head, int data, int position) {

		Node newNode = new Node(data);

		if (position == 0) {
			newNode.next = head;
			if (head != null) {
				head.prev = newNode; // Update the previous pointer of the old head
			}
			return newNode; // New node becomes the head
		}

		Node current = head;
		for (int i = 0; i < position; i++) {
			current = current.next;
		}

		newNode.next = current.next;
		if (current.next != null) {
			current.next.prev = newNode;
		}

		current.next = newNode;
		newNode.prev = current;

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
		Node node3 = new Node(40);

		head.prev = null; // Optional
		head.next = node2;

		node2.prev = head;
		node2.next = node3;

		node3.prev = node2;
		node3.next = null; // Optional

		System.out.println("Before insert the data");
		InsertionAtGivenPositionInDLL.diplay(head);

		head = InsertionAtGivenPositionInDLL.insertAtGivenPosition(head, 30, 1);

		System.out.println("After insert the data");
		InsertionAtGivenPositionInDLL.diplay(head);
	}
}
