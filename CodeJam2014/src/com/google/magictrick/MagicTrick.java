package com.google.magictrick;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MagicTrick {

	public void solve(String input, String output) throws Exception {
		
		Scanner scan = new Scanner(new File(input));
		BufferedWriter out = new BufferedWriter(new FileWriter(output));
		int test = Integer.parseInt(scan.nextLine());
		
		
		for(int i =0 ; i <test; i++){
			
			int row = Integer.parseInt(scan.nextLine());
//			1 2 3 4
//			5 6 7 8
//			9 10 11 12
//			13 14 15 16
			String[] rows = null;
			for(int j=1;j<= 4;j++ ){
				if(j == row){
				rows = scan.nextLine().split(" ");
				}else{
					scan.nextLine();
				}
			}
			int col = Integer.parseInt(scan.nextLine());
			String[] cols = null;
			for(int j=1;j<= 4;j++ ){
				if(j == col){
					cols = scan.nextLine().split(" ");
				}else{
					scan.nextLine();
				}
			}
			
			String result = getResult(rows,cols);
			
			out.write("Case #"+(i+1)+": "+result+"\n");
			
		}
		
		
		
		out.close();
		scan.close();
	}

	private String getResult(String[] rows, String[] cols) {
		int count =0;
		String number = null;
		for(int i =0; i < 4; i++){
			for (int j =0 ; j < 4; j++){
				if(rows[i].equals(cols[j])){
					count++;
					number = rows[i];
				}
			}
		}
		
		if(count == 0){
			return "Volunteer cheated!"; 
		}else if(count == 1){
			return number;
		}else{
			return "Bad magician!";
		}
		
		
	}

}
