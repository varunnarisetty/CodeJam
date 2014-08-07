package com.google.cookie;

public class MainClass {

	public static void main(String[] args) {
		
		CookieClicker cookie = new CookieClicker();
		try {
			cookie.solve("input.in","Output.op");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
