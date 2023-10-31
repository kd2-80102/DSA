package com.sunbeam;

public class List {

	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;
	private Node tail;

	public List() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	// ADD FIRST
	public void addFirst(int value) {
		Node newnode = new Node(value);

		if (isEmpty()) {
			head = newnode;
			tail = newnode; // Update the tail when adding the first element
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	// DISPLAY LIST
	public void displayList() {
		if (isEmpty()) {
			System.out.println("LIST IS EMPTY....");
		} else {
			Node trav = head;
			System.out.print("List: ");
			while (trav != null) {
				System.out.print(" " + trav.data);
				trav = trav.next;
			}
			System.out.println();
		}
	}

	// ADD LAST
	public void addLast(int value) {
		Node newnode = new Node(value);

		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}

	// DELETE FIRST
	public void delFirst() {
		if (isEmpty()) {
			System.out.println("LIST IS EMPTY");
		} else {
			head = head.next;
		}
	}

	public void delLast() {
		if (isEmpty())
			System.out.println("LIST IS EMPTY");
		else {
			//traverse till second last node
			Node trav  = head;
			while(trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;
			tail = trav;
		}
	}


}