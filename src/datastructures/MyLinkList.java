package datastructures;

public class MyLinkList {
	
	Node head;

	public MyLinkList() {
		// TODO Auto-generated constructor stub
		head = null;
	}
	
	public void add(int value){
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
	public void remove(int value){
		if(head ==null) return;
		if(head.value == value){
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
	public void display(){
		Node current = head;
		while(current !=null){
			System.out.print(current.value +"->");
			current = current.next;
		}
		System.out.println();
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
	public MyLinkList startEndAlternation(MyLinkList ls2) {
		
		MyLinkList ls3 = new MyLinkList();
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
}
