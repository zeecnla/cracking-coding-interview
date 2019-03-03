package datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * Class to make sure that the data structures i implement
 * work correctly
 * @author Cesar-Melchor
 *
 */
public class DSMain {

	public static void main(String[] args) {
		new Tree();
		new Graph();
		
		testGraph();
		//testTree();
	}
	@Test
	public static void testTree(){		
		Tree.insert(9);
		Tree.insert(1);
		Tree.insert(3);
		Tree.insert(0);
		Tree.insert(21);
		Tree.insert(13);
		
		//			9
		//		1	   21
		//	   0 3    13
		assertEquals(Tree.preOrderTraversal().equals("91032113"), true);
		assertEquals(Tree.inOrderTraversal().equals("01391321"), true);
		assertEquals(Tree.postOrderTraversal().equals("03113219"), true);
		
		
	}
	
	// 0 - 1 
	// | / | \
	// |/  |  2
	// 4 _ 3 /
	
	@Test
	public static void testGraph(){
		Graph.addEdge(0,1);
		Graph.addEdge(1,0);
		
		Graph.addEdge(0, 4);
		Graph.addEdge(4, 0);
		
		Graph.addEdge(1, 4);
		Graph.addEdge(4, 1);
		
		Graph.addEdge(1, 3);
		Graph.addEdge(3, 1);
		
		Graph.addEdge(1, 2);
		Graph.addEdge(2, 1);
		
		Graph.addEdge(4, 3);
		Graph.addEdge(3, 4);

		Graph.addEdge(2, 3);
		Graph.addEdge(3, 2);
		
		System.out.println(Graph.print());
		
		
		
	}
	
	

}
