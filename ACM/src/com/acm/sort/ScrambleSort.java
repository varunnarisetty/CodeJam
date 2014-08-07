package com.acm.sort;

import java.awt.color.CMMException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ScrambleSort {
	
	public String getSortedString(String[] input){
		
		ArrayList<Integer> intPosList = new ArrayList<Integer>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String> strList = new ArrayList<String>();
		for(int i =0; i < input.length;i++){
			String str = input[i];
			boolean flag = false;
			int temp = 0;
			try{
				temp = Integer.parseInt(str);
				flag = true;
			}catch(Exception e){
			//	e.printStackTrace();
				flag = false;
			}
			
			if(flag){
				intList.add(temp);
				intPosList.add(i);
			}else{
				strList.add(str);
			}
		}
		
		Collections.sort(intList);
		Collections.sort(strList,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int val = o1.toLowerCase().compareTo(o2.toLowerCase());
					
				
				return val;
			}
		});
		String sol = "";
		for(int i=0;i<input.length;i++){
			String sym = ", ";
			if(i == input.length-1){
				sym = ".";
			}
			if(intPosList.contains(i)){
				sol = sol + intList.remove(0)+sym;
			}else{
				sol = sol + strList.remove(0)+sym;
			}
		}
		
		
		return sol;
	}

	public void solve(String string) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File(string));
		
		while(scan.hasNext()){
			String line = scan.nextLine();
			line = line.substring(0, line.length()-1);
			String[] input = line.split(", ");
			
			String sol = getSortedString(input);
			System.out.println(sol);
		}
		
	}

}
