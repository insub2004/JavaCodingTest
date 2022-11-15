package com.part09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GraphAdjacencyList02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();	//������ ��
		int e = sc.nextInt();	//������ ��
		
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		
		 // �� ��庰 ����Ʈ �ֱ�
		for(int i=0; i<=v; i++) {		//<=�� ������ �ε��� 1���� �ֱ� ���ؼ�
			adjList.add(new ArrayList<>());	//�� ��ġ�� ArrayList��ü�� �Ҵ�
		}
		
		
		for(int i=0; i<e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			putEdge(adjList, a, b);
		}
		print(adjList, v);
	}

	private static void print(ArrayList<ArrayList<Integer>> list, int v) {
		//��������Ʈ�� ����ϴ� �Լ���.
		
		//iterator�Ẹ��
		System.out.println("iterator��");
		for(int i=1; i<=v; i++) {
			Iterator<Integer> iter = list.get(i).iterator();	//�ݺ���, �����̳ʿ� ������ִ� ������ �ϳ��ϳ� ������ �ϳ��ϳ� ó���� �� �ְ� ���ش�
			System.out.print("["+i+"] : ");						//
			
			//iter�� hasNext()����������
			while(iter.hasNext()) {
				System.out.print(iter.next()+" ");
			}
			System.out.println();
		}
		
		//�׳� for�� ����
		for(int i=1;i<list.size();i++) {
			ArrayList<Integer> node = list.get(i);		//�ٳ��� �� ���� -> �ٳ��� �� ��(����+��)
			System.out.print("node [" + i +"] :");
			for(int j=0;j<node.size();j++) {
				System.out.print(node.get(j) + " ");	//�ٳ��� �� ��(����+��) -> �ٳ��� ��
			}
			System.out.println();
		}
	}

	private static void putEdge(ArrayList<ArrayList<Integer>> list, int v1, int v2) {
		//������ �˸´� ��忡 ������ ��带 �ִ� �Լ��̴�.
		list.get(v1).add(v2);
		list.get(v2).add(v1);
	}
}
