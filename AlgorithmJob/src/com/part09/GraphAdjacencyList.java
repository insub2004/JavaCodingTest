package com.part09;

import java.util.ArrayList;
import java.util.Iterator;

public class GraphAdjacencyList {
	
	//인접 리스트
	// 5 6 (정점의 갯수, 간선의 갯수)
	// 1 2
	// 1 3
	// 1 4
	// 2 4
	// 4 5
	// 3 5
	
	public static void main(String[] args) {
		
		int v = 5; //그래프 정점의 갯수
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		for(int i=0; i<=v; i++)
			graph.add(new ArrayList<Integer>());	//각 노드별 리스트 만들기
													//1부터 시작하려고 <=
		putEdge(graph, 1, 2);
		putEdge(graph, 1, 3);
		putEdge(graph, 1, 4);
		putEdge(graph, 2, 3);
		putEdge(graph, 2, 5);
		putEdge(graph, 3, 4);
		putEdge(graph, 4, 5);
		
		print(graph, v);
	}

	private static void print(ArrayList<ArrayList<Integer>> graph,int x) {
		
		for(int i=1; i<graph.size(); i++) {
			ArrayList<Integer> node = graph.get(i);
			System.out.print("node"+"["+i+"] : ");
			for(int j=0; j<node.size(); j++) {
				System.out.print(node.get(j)+"->");
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		System.out.println("iterator 사용");
		for(int i=1; i<=x; i++) {
			Iterator<Integer> iter = graph.get(i).iterator(); 
			System.out.print("["+i+"] :");
			while(iter.hasNext()) {
				System.out.print(iter.next()+"->");
			}
			System.out.println();
		}
	}

	private static void putEdge(ArrayList<ArrayList<Integer>> graph, int x, int y) {
		graph.get(x).add(y);
		graph.get(y).add(x);
	}
	
	
}
