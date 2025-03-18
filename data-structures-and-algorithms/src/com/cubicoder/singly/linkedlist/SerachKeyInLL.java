package com.cubicoder.singly.linkedlist;

public class SerachKeyInLL {

	public static int search(Node head, int key) {
		// TODO Auto-generated method stub

		int pos = 1;
		Node current = head;
		while (current != null) {

			if (current.data == key) {
				return pos;
			} else {
				pos++;
				current = current.next;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		Node head = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);

		head.next = node2;
		node2.next = node3;

		System.out.println(SerachKeyInLL.search(head, 20));
		
	}
		
}
