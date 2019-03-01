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
		
		testTrees();
	}
	@Test
	public static void testTrees(){
		
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
	
	

}
