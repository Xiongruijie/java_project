package com.itranswarp.learnjava;
import java.lang.reflect.*;
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person(name, age);
		// TODO: 利用反射给name和age字段赋值:
		Class<?> class1=p.getClass();
		Field ageField = null;
		Field nameField = null;
		try {
			ageField = class1.getDeclaredField("age");
			nameField = class1.getDeclaredField("name");
			age = 30;
			ageField.setAccessible(true);
			ageField.set(p, age);
			
			name = "xiaohong";
			nameField.setAccessible(true);
			nameField.set(p, name);
			
			
			
		}catch (NoSuchFieldException | SecurityException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

			}

			catch (IllegalArgumentException | IllegalAccessException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

			}

			finally {

			System.out.println(p.getName()); // "Xiao Ming"

			System.out.println(p.getAge()); // 20

			}

			
		
		
		
	}
}
