package com.itranswarp.learnjava;

import java.util.StringJoiner;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String select = buildSelectSql(table, fields);
		System.out.println(select);
		System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
	}

	static String buildSelectSql(String table, String[] fields) {
		// TODO:
//		var sb = new StringBuilder();
//		sb.append("SELECT ");
//		for(String name:fields) {
//			sb.append(name).append(", ");
//		}
//		sb.delete(sb.length()-2, sb.length());
//		sb.append(" FROM ");
//		sb.append(table);

		var sb = new StringJoiner(", ", "SELECT ", " FROM ");
		for (String name : fields) {
			sb.add(name);
		}

		return sb.toString() + table;
	}

}
