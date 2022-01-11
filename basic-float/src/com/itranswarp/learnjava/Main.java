package com.itranswarp.learnjava;

/**
 * 姹傝В 涓�鍏冧簩娆℃柟绋媋x^2+bx+c=0
 */
public class Main {

	public static void main(String[] args) {
		// x*x + 3*x - 4 = 0
		double a = 1.0;
		double b = 3.0;
		double c = -4.0;
		// 姹傚钩鏂规牴鍙敤 Math.sqrt():
		// double x = Math.sqrt(2)); // ==> 1.414
		// TODO:
		double r1 = 0;
		double r2 = 0;
		double temp = 0;
		temp = Math.sqrt(b*b-4*a*c);
		r1 = (-b + temp) / (2*a);
		r2 = (-b - temp) / (2*a);
		System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
		
	}

}
