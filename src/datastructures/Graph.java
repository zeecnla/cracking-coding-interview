package datastructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * This representation will consist of using integers
 * might change later to objects so it can work with all data types
 * @author Cesar-Melchor
 *
 */
public class Graph <T> {
	
	private HashMap<T,Node> graph = new HashMap<T, Node>();
	
	public Graph(){
		
	}
	
	private class Node {
		private T id;
		List<Node> adjacent = new LinkedList<Node>();
		private Node (T id) {
			this.id = id;
		}
		@Override
		public String toString(){
			StringBuilder string = new StringBuilder();
			string.append(id);
			string.append(adjacent.toString());
			return string.toString();
		}
	}
	
	//for directed graph you would only add from a -> b
	//for undirected graph you would add from both a -b and b - a
	public void addEdge(T a, T b){
		Node src = getNode(a);
		Node dest = getNode(b);
		src.toString();
		src.adjacent.add(dest);	
	}
	
	public Node getNode(T node){
		graph.put(node, new Node(node));
		return graph.get(node);
	}
	/**
	 * Breadth first search
	 */
	public void bfs(){
		
	}
	/**
	 * Depth first search
	 * @return 
	 */
	public boolean hasPathDFS(T src, T dest){
		Node source = getNode(src);
		Node destination = getNode(dest);
		HashSet<T> visited = new HashSet<T>();
		return hasPathDFS(source, destination, visited);
	}
	private boolean hasPathDFS(Node source, Node destination, HashSet<T> visited){
		
		if(visited.contains(source)) return false;
		
		visited.add(source.id);
		if(source == destination){
			return true;
		}
		for(Node node : source.adjacent){
			if(hasPathDFS(node, destination, visited)){
				return true;
			}
		}
		return false;
	}

	public boolean hasPathBFS(T src, T dest){
		Node source = getNode(src);
		Node destination = getNode(dest);
		return hasPathBFS(source, destination);
		
	}
	private boolean hasPathBFS(Node source, Node destination){
		LinkedList<Node> nextToVisit =  new LinkedList<Node>();
		HashSet<T> visited = new HashSet<T>();
		nextToVisit.add(source);
		while(!nextToVisit.isEmpty()){
			Node node = nextToVisit.remove();
			if(node == destination){
				return true;
			}
			if(visited.contains(node.id)){
				continue;
			}
			visited.add(node.id);
			
			for(Node child : node.adjacent){
				nextToVisit.addFirst(child);
			}
		}
		
		return false;
	}
	public void display(){
		
		System.out.println();
		
	}

}
