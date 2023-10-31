package com.sunbeam;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new List();
		
		l1.addLast(10);
		l1.addLast(20);
		l1.addFirst(30);
//		l1.deletelast();
		l1.deletefirst();
		
		l1.displayList();
		
	}

}
