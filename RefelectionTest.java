package com.monocept.test;

import java.lang.reflect.Method;

public class RefelectionTest {
	public static void main(String[] args) {

		try {
			Class cls = Class.forName(args[0]);
			showMethodsWithPera(cls);
			showMethodsWithoutPera(cls);
			showFields(cls);
			showFieldWithDescription(cls);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void showFieldWithDescription(Class cls) {
		java.lang.reflect.Field[] fields = cls.getFields();
		for (java.lang.reflect.Field field : fields)
			System.out.println(field);

	}

	private static void showFields(Class cls) {
		java.lang.reflect.Field[] fields = cls.getFields();
		for (java.lang.reflect.Field field : fields)
			System.out.println(field.getName());

	}

	private static void showMethodsWithoutPera(Class cls) {
		Method[] methods = cls.getMethods();
		for (Method method : methods)
			System.out.println(method.getName());

	}

	private static void showMethodsWithPera(Class cls) {
		// TODO Auto-generated method stub
		Method[] methods = cls.getMethods();
		for (Method method : methods)
			System.out.println(method);

	}
}
