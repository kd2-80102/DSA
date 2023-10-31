package com.sunbeam;

//1. Implement add and delete at position in doubly circular linked list.


public class List {
	public class Node {
		Node next;
		Node prev;
		int data;
		
		public Node(int value) {
			next = null;
			prev = null;
			data = value;
		}
	}
	private Node head;
	
	public List() {
		head = null;
	}
	
	boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		
		if(isEmpty()) {
			head = newnode;
			newnode.next = newnode;
			newnode.prev = newnode;
		}
		
		else {
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev = newnode;
			head = newnode;
		}
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		
		if(isEmpty()) {
			head = newnode;
			newnode.next = newnode;
			newnode.prev = newnode;
		}
		
		else {
			newnode.next = head;
			newnode.prev = head.prev; 
			newnode.prev.next = newnode;
			head.prev = newnode;
		}
	}
	
	public void deleteFirst() {
		if(isEmpty()) {
			return;
		}
		else if(head.next == head) {
			head = null;
		}
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		
		else if(head.next == head) {
			head = null;
		}
		
		else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}		
	}
	
	public void addAtPostition(int value, int pos) {
		Node newnode = new Node(value);
		
		if(isEmpty()) {
			head = newnode;
			newnode.next = newnode;
			newnode.prev = newnode;
		}
		
		else {
			Node trav = head;
			for(int i=0;i<pos-1;i++) {
				trav = trav.next;
			}
			
			newnode.next = trav.next;
			newnode.prev = trav;
			trav.next = newnode;
			newnode.next.prev = newnode;
		}
	}
	
	public void deleteAtPosition(int pos) {
		if(isEmpty()) {
			return;
		}
		
		else if(head.next == head) {
			head = null;
		}
		
		else {
			Node trav = head;
			for(int i=0;i<pos-1;i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
			trav.next.next.prev = trav;
		}
	}
	
	
	public void fDisplay() {
		if(isEmpty()) {
			return;
		}
		
		Node trav = head;
		System.out.print("Forward : ");
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}while(trav != head);
		System.out.println("");
	}
	
	public void rDisplay() {
		if(isEmpty())
			return;
		
		Node trav = head.prev;
		System.out.print("Reverse List : ");
		do {
			System.out.print(" " + trav.data);
			trav = trav.prev;
		}while(trav != head.prev);	
		System.out.println("");
	}
}

