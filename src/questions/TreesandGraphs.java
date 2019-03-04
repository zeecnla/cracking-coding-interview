package questions;

import datastructures.Tree;

/**
 * Practice problems for Trees and graphs
 * @author Cesar-Melchor
 *
 */
public class TreesandGraphs {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//4.9 BST Sequence
		// 2
		//1 3
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(40);
		tree.insert(25);
		tree.insert(75);
		
		bstSequence(tree);
		

	}
	static void bstSequence(Tree tree){
		
		System.out.println(tree.preOrderTraversal());
		System.out.println(tree.preOrderTraversalAlternate());
		
		
		
		
	}

}
