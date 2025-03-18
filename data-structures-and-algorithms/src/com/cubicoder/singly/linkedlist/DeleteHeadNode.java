package com.cubicoder.singly.linkedlist;

public class DeleteHeadNode {

	public static Node deleteHead(Node head) {

		if (head == null) {
			return null;
		}

		// Move the head pointer to the next node
		head = head.next;
		
        // After moving the head, the original head node will be eligible for garbage collection
		return head;
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

		System.out.println("Before deleting the new element at Zero index");
		DeleteHeadNode.display(head);

		head = DeleteHeadNode.deleteHead(head);

		System.out.println("After deleting the new element at zero index");
		DeleteHeadNode.display(head);
	}
}
