package com.itranswarp.learnjava;

import java.io.IOException;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String a = "12";
		String b = "x9";
		// TODO: 捕获异常并处理
		try {
			int c = stringToInt(a);
			int d = stringToInt(b);
			System.out.println(c * d);
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("there is a exception for number format exception");
			System.out.println(e);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

	static int stringToInt(String s) {
		return Integer.parseInt(s);
	}
}
