package com.part09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GraphAdjacencyList02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();	//정점의 수
		int e = sc.nextInt();	//간선의 수
		
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		
		 // 각 노드별 리스트 넣기
		for(int i=0; i<=v; i++) {		//<=인 이유는 인덱스 1부터 넣기 위해서
			adjList.add(new ArrayList<>());	//각 위치에 ArrayList객체를 할당
		}
		
		
		for(int i=0; i<e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			putEdge(adjList, a, b);
		}
		print(adjList, v);
	}

	private static void print(ArrayList<ArrayList<Integer>> list, int v) {
		//인접리스트를 출력하는 함수다.
		
		//iterator써보자
		System.out.println("iterator씀");
		for(int i=1; i<=v; i++) {
			Iterator<Integer> iter = list.get(i).iterator();	//반복자, 컨테이너에 담겨져있는 값들을 하나하나 꺼내서 하나하나 처리할 수 있게 해준다
			System.out.print("["+i+"] : ");						//
			
			//iter의 hasNext()없을때까지
			while(iter.hasNext()) {
				System.out.print(iter.next()+" ");
			}
			System.out.println();
		}
		
		//그냥 for문 구현
		for(int i=1;i<list.size();i++) {
			ArrayList<Integer> node = list.get(i);		//바나나 한 송이 -> 바나나 한 개(껍질+속)
			System.out.print("node [" + i +"] :");
			for(int j=0;j<node.size();j++) {
				System.out.print(node.get(j) + " ");	//바나나 한 개(껍질+속) -> 바나나 속
			}
			System.out.println();
		}
	}

	private static void putEdge(ArrayList<ArrayList<Integer>> list, int v1, int v2) {
		//각각의 알맞는 노드에 인접한 노드를 넣는 함수이다.
		list.get(v1).add(v2);
		list.get(v2).add(v1);
	}
}
