package datastructures;

import java.util.Iterator;

public class LinkList <T> implements Iterable<T> {
	
	private class Node {
		T value;
		Node next; 
		
		public Node(T value, Node next){
			this.value=value;
			this.next = next;
		}
	}
	

	Node head;


	public LinkList() {
		// TODO Auto-generated constructor stub
		head = null;
	}
	
	public void add(T value){
		Node current = head;
		if(current==null){
			head = new Node(value, null);
			return;
		}
		while(current.next !=null){
			current = current.next;
		}
		current.next = new Node(value,null);
	}
	public void remove(T value){
		if(head ==null) return;
		if(head.value == value || head.value.equals(value)){
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next!=null){
			if(current.next.value == value){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	public String display(){
		StringBuilder s = new StringBuilder();
		Node current = head;
		s.append(current.value);
		while(current !=null){
			s.append("->");
			current = current.next;
			s.append(current.value);
		}
		return s.toString();
	}
	public void reverse() {
		Node prev = null;
		Node next = null;
		Node current = head;
		while(current != null) {
			
			next = current.next;
			current.next = prev;
			prev=current;
			current = next;
		}
		head = prev;
	}
	
	//udemy problem 1
	//we are going to assume the lengths are equal
	public LinkList<T> startEndAlternation(LinkList<T> ls2) {
		
		LinkList<T> ls3 = new LinkList<T>();
		Node currentLs1 = this.head;
		ls2.reverse();
		Node currentLs2 = ls2.head;
		
		while(currentLs1 !=null || currentLs2 !=null) {
			
			ls3.add(currentLs1.value);
			ls3.add(currentLs2.value);
			
			
			currentLs1 = currentLs1.next;
			currentLs2 = currentLs2.next;
		}
		return ls3;
			
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T> (){
			 
			Node current = head;
			

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public T next() {
				if(hasNext()){
					T data = current.value;
					current = current.next;
					return data;
					
				}
				return null;
			}
			
		};
	}
	public String toString(){
		StringBuilder s = new StringBuilder();
		Node current = head;
		while(current!=null){
			if(current.next == null){
				s.append(current.value);
			}else{
				s.append(current.value +"-");
			}
			current = current.next;
		}
		return s.toString();
		
	}
}
