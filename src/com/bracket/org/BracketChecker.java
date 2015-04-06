package com.bracket.org;

public class BracketChecker {

	private String input; 
	public BracketChecker(String s) {
		this.input = s;
	}
	
	public void check () {
		int maxSize = this.input.length();
		boolean flag = false;
		MyStack stack = new MyStack(maxSize);
		for(int i = 0 ; i < maxSize ; i++) {
			char ch = input.charAt(i);
			switch(ch) {
				case '(':
				case '{':
				case '[':
					stack.push(ch);
					break;
				case ')':
				case '}':
				case ']':
					char popped = stack.pop();
					if(popped == '(' && ch != ')' || 
						popped == '{' && ch != '}' || 
						popped == '[' && ch != ']') {
						System.out.println("Error at string index : " + i + " : with character : " + ch );
						flag = true;
					} 
					break;
				default: break;
			}
		}
		if (flag == true) {
			System.out.println("You did not close the opening paranthesis/braces/square bracket");
		} else if (flag == false && stack.isEmpty() == true) {
			System.out.println("All looks fine!");
		}
	}
}
