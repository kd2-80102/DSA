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

    private Node tail;

    public List() {
        tail = null;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);

        if (isEmpty()) {
            tail = newnode;
            newnode.next = newnode; 
        } else {
            newnode.next = tail.next; 
            tail.next = newnode; 
            tail = newnode; 
        }
    }

    // DISPLAY LIST
    public void displayList() {
        if (isEmpty()) {
            System.out.println("LIST IS EMPTY....");
        } else {
            Node trav = tail.next; 
            System.out.print("List: ");
            do {
                System.out.print(" " + trav.data);
                trav = trav.next;
            } while (trav != tail.next); 
            System.out.println();
        }
    }
    
    public void addFirst(int value) {
    	Node newnode = new Node(value);
    	
    	if(isEmpty()) {
    		tail = newnode;
    		newnode.next = newnode;
    	}
    	
    	else {
    		newnode.next = tail.next;
    		tail.next = newnode;
    	}
 	
    }
    
    
    public void deletelast() {
    	if(isEmpty())
    		System.out.println("List is Empty..");
    	
    	else {
    		Node trav = tail.next;
    		while(trav.next != tail) {
    			trav = trav.next;
    		}
    		
    		trav.next = tail.next;
    		tail = trav;
    	}
		
	}
    
    public void deletefirst() {
		if(isEmpty())
			System.out.println("LIST IS EMPTY");
			
		else {
			tail.next = tail.next.next;
		}
	}
    
    
    
    

   
}
