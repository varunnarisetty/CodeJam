package com.google.magictrick;

public class MainClass {

	public static void main(String[] args) {
		
		MagicTrick magic = new MagicTrick();
		try {
			magic.solve("input.in","Output.op");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
