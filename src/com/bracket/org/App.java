package com.bracket.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the equation");
		String str = br.readLine();
		System.out.println(str);
		if(str.length() == 0) System.out.println("Enter something!");
		else {
			BracketChecker checker = new BracketChecker(str);
			checker.check();
		}
	}

}
