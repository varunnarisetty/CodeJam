package com.acm.sort;

import java.util.ArrayList;

public class FireTruck {

	Integer dest = 5;
	
	int[][] matrix = new int[6][6];
	
	public void start(){
		generateInput();
		printMatrix();
		printPaths(new ArrayList<Integer>(), 0);
	}
	
	public void printPaths(ArrayList<Integer> visitedNodes, int currentNode){
		
		
		ArrayList<Integer> list = getConnectedNodes(currentNode);
		
		for (Integer listItem : list) {
			
			if(!visitedNodes.contains(listItem)){
				
				if(listItem == dest){
					for (Integer nodes : visitedNodes) {
						
						System.out.print((nodes+1)+" ");
					}
					System.out.println((currentNode+1)+" "+(dest+1));
					
				}else{
					ArrayList<Integer> newVisited = new ArrayList<>(visitedNodes);
					newVisited.add(currentNode);
					printPaths(newVisited, listItem);
				}
			}
		}
	}

	private ArrayList<Integer> getConnectedNodes(int currentNode) {
		ArrayList<Integer> connectedList = new ArrayList<Integer>();
		for(int i=0;i<6;i++){
			if(matrix[currentNode][i] == 1){
				connectedList.add(i);
			}
		}
		return connectedList;
	}
	
	public void generateInput(){
		
		int[] line1 = {0,1,1,0,0,0};
		int[] line2 = {1,0,1,1,0,0};
		int[] line3 = {1,1,0,1,1,0};
		int[] line4 = {0,1,1,0,0,1};
		int[] line5 = {0,0,1,0,0,1};
		int[] line6 = {0,0,0,1,1,0};
		
		for(int i=0; i<6;i++){
			
				switch (i) {
				case 0:
					matrix[i] = line1;
					break;

				case 1:
					matrix[i] = line2;
					break;
				case 2:
					matrix[i] = line3;				
					break;
				case 3:
					matrix[i] = line4;
					break;
				case 4:
					matrix[i] = line5;
					break;
				case 5:
					matrix[i] = line6;
					break;
				}
				
			
			
		}
	}
	
	public void printMatrix(){
		
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
