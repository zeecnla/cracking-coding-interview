package datastructures;
/**
 * My implementation of a binary tree. No repeated nodes
 * @author Cesar-Melchor
 *
 */
public class Tree {
	
	//TODO: Finish implementing delete/remove.
	
	private   class Node {
		
		private Node left;
		private Node right;
		private int data;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	  Node root;

	public Tree() {
	}
	public   void insert(int data){
		if(root ==null){
			root = new Node(data);
		}
		insert(root, data);
	}
	private   void insert(Node current, int data){
		if(current == null){
			current = new Node(data);
		}
		if(data < current.data){
			if(current.left == null){
				current.left = new Node(data);
			}
			else{
				insert(current.left, data);
			}
		}else if(data > current.data){
			if(current.right == null){
				current.right = new Node(data);
			}
			else{
				insert(current.right, data);
			}
		}
	}
	
	/**
	 * Visits the left node then the current node then the right node
	 * @return
	 */
	public   String inOrderTraversal(){
		StringBuilder builder = new StringBuilder();
		
		return inOrderTraversal(root, builder).toString();
	}
	
	private   StringBuilder inOrderTraversal(Node node, StringBuilder builder){	
		if(node != null){
			inOrderTraversal(node.left, builder);
			builder.append(node.data);
			inOrderTraversal(node.right, builder);
		}
		return builder;
	}
	
	/**
	 * Visits the current node after its child nodes
	 * @return
	 */
	public   String postOrderTraversal(){
		StringBuilder builder = new StringBuilder();
		return postOrderTraversal(root, builder).toString();
	}
	
	private   StringBuilder postOrderTraversal(Node node, StringBuilder builder){	
		if(node != null){
			postOrderTraversal(node.left, builder);
			postOrderTraversal(node.right, builder);
			builder.append(node.data);
		}
		return builder;
	}
	
	/**
	 * Visit current node before its child nodes
	 * @return
	 */
	public String preOrderTraversal(){
		StringBuilder builder = new StringBuilder();
		return preOrderTraversal(root, builder).toString();
	}
	
	private StringBuilder preOrderTraversal(Node node, StringBuilder builder){	
		if(node != null){
			builder.append(node.data);
			preOrderTraversal(node.left,builder);
			preOrderTraversal(node.right,builder);
		}
		return builder;
	}
	/**
	 * Visit current node before its child nodes
	 * @return
	 */
	public String preOrderTraversalAlternate(){
		StringBuilder builder = new StringBuilder();
		return preOrderTraversalAlternate(root, builder).toString();
	}
	
	private   StringBuilder preOrderTraversalAlternate(Node node, StringBuilder builder){	
		if(node != null){
			builder.append(node.data);
			preOrderTraversal(node.right,builder);
			preOrderTraversal(node.left,builder);
		}
		return builder;
	}
	public   boolean binarySearch(int data){
		
		return binarySearch(root, data);
	}
	private   boolean binarySearch(Node current, int data){
		if(current == null) return false;
	
		if(current.data == data){
			System.out.println(current.data);
			return true;
		}else if(data < current.data){
			return binarySearch(current.left,data);
		}else if(data > current.data){
			return binarySearch(current.right,data);
		}else {
			return false;
		}
		
	}
	
}
