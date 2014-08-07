package com.google.cookie;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CookieClicker {
	
	public void solve(String input, String output) throws Exception {
		
		Scanner scan = new Scanner(new File(input));
		BufferedWriter out = new BufferedWriter(new FileWriter(output));
		int test = Integer.parseInt(scan.nextLine());
		for(int i =0;i<test;i++){
			String[] values = scan.nextLine().split(" ");
			double c = Double.parseDouble(values[0]);
			double f = Double.parseDouble(values[1]);
			double x = Double.parseDouble(values[2]);
			double k = 2.0;
			double time = 0.0;
			
			double prev = x/k;
			double a = x/(k+f);
			double b = (x-c)/k;
			while(a < b){
				time = time + c/k;
				
				prev = a;
				
				k = k + f;
				a = x/(k+f);
				b = (x-c)/k;
				//System.out.println("loop");
			}
			
			time = time + prev;
			System.out.println(time);
			out.write("Case #"+(i+1)+": "+time+"\n");
		}
		
		out.close();
		scan.close();
	}
}
