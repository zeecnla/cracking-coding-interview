package datastructures;

public class DSMain {

	public DSMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Testing Graph Implementation and Problems
		 */
		Graph<Integer> graph = new<Integer> Graph();
		graph.addEdge(0, 1);
		graph.addEdge(1, 0);
		
		graph.addEdge(0, 4);
		graph.addEdge(4, 0);
		
		graph.addEdge(1, 2);
		graph.addEdge(2, 1);
		
		graph.addEdge(1, 3);
		graph.addEdge(3, 1);
		
		graph.addEdge(1, 4);
		graph.addEdge(4, 1);
		
		graph.addEdge(2, 3);
		graph.addEdge(3, 2);
		
		graph.addEdge(3, 4);
		graph.addEdge(4, 3);
		//System.out.println(graph.toString());

	}

}
