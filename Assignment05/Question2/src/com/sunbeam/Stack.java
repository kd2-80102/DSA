package com.sunbeam;

public class Stack {
	List l;
	
	public Stack() {
		l = new List();
	}
	
	public boolean isEmpty() {
		return l.isEmpty();
	}
	
	public void push(int data) {
		l.addFirst(data);
	}
	
	public void pop() {
		l.deleteFirst();
	}
	
	public int peek() {
		return l.getData();
	}
	
	public void display() {
		l.fDisplay();
	}
	
}
