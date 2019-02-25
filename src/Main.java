

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Dictionary;

import datastructures.*;
import questions.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyLinkList ls1 = new MyLinkList();
		//MyLinkList ls2 = new MyLinkList();
		
		
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
		
		/*
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
		
		*/
		//Google practice Question
		//you are given a dictionary of words find the alphabet
		// RAT ->ART -> CAT ->CAR
		
		List<String> words = new ArrayList<String>();
		words.add("RAT");
		words.add("ART");
		words.add("CAT");
		words.add("CAR");
		
		findAlphabet(words);
		
		
		
		
	}
	public static void findAlphabet(List<String> words){
		//directed since one letter can only come after another letter
		//assuming same length
		Graph<Integer> alphabet = new Graph<Integer>();
		
		int z = 1;
		for(int j=0; j < words.size(); j++){
			String word = words.get(j);
			if(z >= words.size()){
				return;
			}
			String otherWord = words.get(z);
			
			for(int i=0; i < word.length(); i++){
				if(word.charAt(i) != otherWord.charAt(i)){
					
					alphabet.addEdge(word.charAt(i) - 'a', otherWord.charAt(i)-'a');
				}
			}
			z++;
		}
		System.out.println(alphabet.toString());
	}
}
