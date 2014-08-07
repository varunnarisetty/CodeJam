package com.acm.sort;

import java.util.Random;

public class KDMData {

	public static void main(String[] args) {
	int users = 50;
	int movies = 50;
	System.out.println("#userId,itemId");
	for(int i=1;i<=users;i++){
		
		Random rand = new Random();
		
		int val = rand.nextInt(9)+1;
		//Set set = new HashSet<Integer>();
		for(int j = 0;j<val;j++){
			
			int k = rand.nextInt(49)+1;
			System.out.println(i+","+k);
		}
		
		
	}
		
	}

}
