package datastructures;

public class Queue {
	
	
	private static class Node {
		private Node next;
		private int data;
		
		private  Node(int data){
			this.next = null;
			this.data= data;
		}
	}
	public Queue() {
		// TODO Auto-generated constructor stub
	}
	// head => node => node => tail
	// 1 = 2 = 3 = 4 and when removed, 
	// 1, 2, 3, 4
	private Node head; // remove from head
	private Node tail;  // add to tail
	
	public boolean isEmpty(){
		return head == null;
		
	}
	public int peek(){
		return head.data;
	
	}
	public void add(int data){
		Node node = new Node(data);
		if(head == null && tail == null){
			tail = node;
			head = tail;
			return;
		}
		tail.next = node;
		tail = tail.next;
		
	}
	public int remove(){
		
		Node removed = head;
		head = head.next;
		return removed.data;
		
	}

}
