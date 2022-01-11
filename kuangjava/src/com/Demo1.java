package com;

public class Demo1 {
	public static void main(String[] args) {
		int max = Demo1.max(1,2);
		System.out.println(max);
	}
	public static int max(int a, int b) {
		return a>b?a:b;
	} 
}
