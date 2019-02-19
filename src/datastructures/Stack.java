package datastructures;


public class Stack {
	
	
	private static class Node {
		private Node next;
		private int data;
		
		private  Node(int data){
			this.next = null;
			this.data= data;
		}
	}

	public Stack() {
		// TODO Auto-generated constructor stub
	}
	private Node top; // add and remove from the top of the stack 
	public boolean isEmpty(){
		return top == null;
	}
	public int peek(){
		return top.data;
	}
	public void push(int data){
		
		Node node = new Node(data);
		node.next = top;
		top = node;
		
		
	}
	public int pop(){
		Node popped = top;
		top = top.next;
		System.out.println(popped.data);
		return popped.data;
	}
	

}
