package com.acm.sort;

import java.io.File;
import java.util.Scanner;

public class RajeshCode {

	public static void main(String[] args) {
		
		  //BasicDBObject bob=new BasicDBObject("a",a[0]).append("b",a[1]).append("c",a[2]);

		String str = "BasicDBObject bob=new BasicDBObject";
		try{
		Scanner scan = new Scanner(new File("val.txt"));
		String line = scan.nextLine().trim();
		int i = 0;
		str = str + "(\""+line+"\",a["+i+"]).";
		while (scan.hasNextLine()) {
			i++;
			line = scan.nextLine().trim();
			str = str + "append(\""+line+"\",a["+i+"]).";
			
		}
		System.out.println(str);
		}catch(Exception e){
			
		}
	}

}
