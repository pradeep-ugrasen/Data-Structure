package com.cubicoder.singly.linkedlist;

public class InsertionAtkthIndex {

	public static Node insertAfter(Node head, int new_data, int position) {
		
		Node new_node = new Node(new_data);
		if(position ==1) {
			new_node.next = head;
			return new_node;
		}
		
		Node current = head;
		for (int i = 0; i < position - 2; i++) {
			current = current.next;
		}
		
		if(current == null)
			return head;
		
		
		new_node.next = current.next;
		current.next = new_node;

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
		Node node3 = new Node(40);

		head.next = node2;
		node2.next = node3;

		System.out.println("Before Inserting the new element at given index");
		InsertionAtkthIndex.display(head);

		InsertionAtkthIndex.insertAfter(head, 30, 3);

		System.out.println("After Inserting the new element at given index");
		InsertionAtkthIndex.display(head);
	}
}
