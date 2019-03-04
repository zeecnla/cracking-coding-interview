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
		testGraph();
		testTree();
		testTreeBinarySearch();
	}
	@Test
	public static void testTree(){		

		Tree tree = new Tree();
		tree.insert(9);
		tree.insert(1);
		tree.insert(3);
		tree.insert(0);
		tree.insert(21);
		tree.insert(13);
		
		//			9
		//		1	   21
		//	   0 3    13 
		assertEquals(tree.preOrderTraversal().equals("91032113"), true);
		assertEquals(tree.inOrderTraversal().equals("01391321"), true);
		assertEquals(tree.postOrderTraversal().equals("03113219"), true);
		
	}
	
	// 0 - 1 
	// | / | \
	// |/  |  2
	// 4 _ 3 /
	
	@Test
	public static void testGraph(){
		Graph<Integer> graph = new Graph<Integer>();
		graph.addEdge(0,1);
		graph.addEdge(1,0);
		
		graph.addEdge(0, 4);
		graph.addEdge(4, 0);
		
		graph.addEdge(1, 4);
		graph.addEdge(4, 1);
		
		graph.addEdge(1, 3);
		graph.addEdge(3, 1);
		
		graph.addEdge(1, 2);
		graph.addEdge(2, 1);
		
		graph.addEdge(4, 3);
		graph.addEdge(3, 4);

		graph.addEdge(2, 3);
		graph.addEdge(3, 2);
		
		System.out.println(graph.print());
		
	}
	@Test
	public static void testTreeBinarySearch(){
		Tree tree = new Tree();
		tree.insert(9);
		tree.insert(1);
		tree.insert(3);
		tree.insert(0);
		tree.insert(21);
		tree.insert(13);
		tree.insert(25);
		tree.insert(23);
		
		//			9
		//		1	   21
		//	   0 3    13 25
		//				23
		assertEquals(tree.binarySearch(25), true);
		assertEquals(tree.binarySearch(14), false);
	}
	
	

}
