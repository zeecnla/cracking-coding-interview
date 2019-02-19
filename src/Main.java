

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Dictionary;

import questions.*;
import datastructures.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkList ls1 = new MyLinkList();
		MyLinkList ls2 = new MyLinkList();
		
		
		/**
		 * Testing Graph Implementation and Problems
		 */
		Graph graph = new Graph();
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
		graph.display();
		
		
		Queue queue = new Queue();
		
		queue.add(3);
		queue.add(1);
		queue.add(2);
		queue.add(4);
		System.out.println("------");
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		
		Stack stack = new Stack();
		stack.push(3);
		stack.push(1);
		stack.push(2);
		stack.push(4);
		System.out.println("------");
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
	}
}