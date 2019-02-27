package datastructures;

public class Tree {
	
	private class Node {
		
		private Node left;
		private Node right;
		private int data;
		
		public Node(){
		}
		public void setData(int data){
			this.data = data;
		}
	}
	
	Node root;

	public Tree() {
		root = new Node();
	}
	
	public void insert(int data){
		if(root == null) {
			root.data = data;
			return;
		}
		
	}

}
