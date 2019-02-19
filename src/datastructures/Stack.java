package datastructures;


public class Stack <T> {
	
	private class Node {
		private Node next;
		private T data;
		
		private Node(T data){
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
	public T peek(){
		return top.data;
	}
	public void push(T data){
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	public T pop(){
		Node popped = top;
		top = top.next;
		System.out.println(popped.data);
		return popped.data;
	}
	

}
