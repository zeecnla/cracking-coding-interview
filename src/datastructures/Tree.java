package datastructures;

public class Tree {
	
	private static class Node {
		
		private Node left;
		private Node right;
		private int data;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	static Node root;

	public Tree() {
	}
	public static void insert(int data){
		if(root ==null){
			root = new Node(data);
		}
		insert(root, data);
	}
	private static void insert(Node current, int data){
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
	public static String inOrderTraversal(){
		StringBuilder builder = new StringBuilder();
		
		return inOrderTraversal(root, builder).toString();
	}
	
	private static StringBuilder inOrderTraversal(Node node, StringBuilder builder){	
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
	public static String postOrderTraversal(){
		StringBuilder builder = new StringBuilder();
		return postOrderTraversal(root, builder).toString();
	}
	
	private static StringBuilder postOrderTraversal(Node node, StringBuilder builder){	
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
	public static String preOrderTraversal(){
		StringBuilder builder = new StringBuilder();
		return preOrderTraversal(root, builder).toString();
	}
	
	private static StringBuilder preOrderTraversal(Node node, StringBuilder builder){	
		if(node != null){
			builder.append(node.data);
			preOrderTraversal(node.left,builder);
			preOrderTraversal(node.right,builder);
		}
		return builder;
	}
	
}
