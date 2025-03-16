package com.cubicoder.linkedlist;

public class LinkedlistDemo {

	public static void displayData(Node node) {

		while (node != null) { // Traverse until node is null
			System.out.println(node.data);
			node = node.next; // Move to the next node
		}
	}

	public static void RecursiveDisplayData(Node node) {

		if (node != null) { // Traverse until node is null
			System.out.println(node.data);
			RecursiveDisplayData(node.next); // Move to the next node
		}
	}

	public static void RecursiveDisplayDataInReverse(Node node) {
		if (node != null) { // Traverse until node is null
			RecursiveDisplayDataInReverse(node.next); // Move to the next node
			System.out.println(node.data); // Print after the recursive call, so it prints in reverse order
		}
	}

	public static int lengthOfLinkedList(Node node) {
		int count = 0;
		while (node != null) { // Traverse until node is null
			count++;
			node = node.next; // Move to the next node
		}
		return count;
	}

	public static int RecursiveLengthOfLinkedList(Node node) {
		if (node == null) {
			return 0;
		} else {
			return RecursiveLengthOfLinkedList(node.next) + 1;
		}

	}

	public static int sumOfElement(Node node) {
		int sum = 0;
		while (node != null) {
			sum = sum + node.data;
			node = node.next;
		}
		return sum;
	}

	public static int findMax(Node node) {
		int max = Integer.MIN_VALUE;
		while (node != null) {
			if (node.data > max) {
				max = node.data;
			}
			node = node.next;
		}
		return max;
	}

	public static Node search(Node node, int key) {
		while (node != null) {
			if (node.data == key) {
				return node;
			}
			node = node.next;
		}
		return null; // Return null if the key is not found
	}

	public static Node moveToHeadSearch(Node head, int key) {
		Node node = head;
		Node prvNode = null;

		while (node != null) {

			if (node.data == key) {

				if (node == head) {
					return head;
				}

				prvNode.next = node.next;
				node.next = head;
				head = node;
				return head;
			}
			prvNode = node;
			node = node.next;
		}
		return head;

	}

	public static void main(String[] args) {

		Node head = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);

		head.next = node2;
		node2.next = node3;

		// LinkedlistDemo.displayData(head);

		// LinkedlistDemo.RecursiveDisplayData(head);

		// LinkedlistDemo.RecursiveDisplayDataInReverse(head);

		// System.out.println(LinkedlistDemo.lengthOfLinkedList(head));

		// System.out.println(LinkedlistDemo.RecursiveLengthOfLinkedList(head));

		// System.out.println(LinkedlistDemo.sumOfElement(head));

		// System.out.println(LinkedlistDemo.findMax(head));

		// System.out.println(LinkedlistDemo.search(head, 20));

		System.out.println(LinkedlistDemo.moveToHeadSearch(head, 20));
	}
}
