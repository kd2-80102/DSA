package com.sunbeam;

public class Main {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.add(15);
		bst.add(10);
		bst.add(20);
		bst.add(3);
		bst.add(13);
		bst.add(25);
		bst.add(1);
		
		bst.preOrder();

	}
}
