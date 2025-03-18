package com.cubicoder.singly.linkedlist;

public class DeleteTailNode {

	public static Node deleteTailNode(Node head) {

		if (head == null || head.next == null) {
			return null;
		}

		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}

		current.next = null;

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

		System.out.println("Before deleting the new element at tail index");
		DeleteTailNode.display(head);

		head = DeleteTailNode.deleteTailNode(head);

		System.out.println("After deleting the new element at tail index");
		DeleteTailNode.display(head);
	}

}
