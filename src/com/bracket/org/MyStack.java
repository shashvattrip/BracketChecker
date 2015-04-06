package com.bracket.org;

public class MyStack {
	private int size;
	private int index;
	private char[] stackArray;
	
	public MyStack (int n) {
		this.size = n;
		this.index = -1;
		this.stackArray = new char[this.size];
	}
	
	public void push (char c) {
		if(this.index < this.size - 1) {
			this.stackArray[++this.index] = c;
		}
	}
	
	public char pop () {
		return this.stackArray[this.index--];
	}
	
	public char peek () {
		return this.stackArray[this.index];
	}
	
	public boolean isEmpty () {
		return (index < 0);
	}
}
