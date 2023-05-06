package com.corejavaprojects.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {

	public static void main(String[] args) {

		Student student1 = new Student();

		Class reflectedClass = student1.getClass();

		try {
			System.out.println("---------------------- REFLECTION : Accessing and Modifying behaviour of a class at Runtime -----------------\n");
			
			//Accessing private variable
			Field fieldName = reflectedClass.getDeclaredField("privateName");

			fieldName.setAccessible(true);//Accessing private variable.
			fieldName.set(student1, "DHONI");
			System.out.println("I am a private varaiable and my value is : "+fieldName.get(student1));

			Field fieldState = reflectedClass.getDeclaredField("publicState");

		//	fieldState.setAccessible(false);
			fieldState.set(student1, "JHARKHAND");//Accessing public variable.
			System.out.println("I am a public varaiable and my value is : "+fieldState.get(student1));

			Method privateNonParametrizedMethod=reflectedClass.getDeclaredMethod("privateNonParametrizedMethod");
			
			privateNonParametrizedMethod.setAccessible(true);
			privateNonParametrizedMethod.invoke(student1);
			
			Method privateParametrizedMethod=reflectedClass.getDeclaredMethod("privateParametrizedMethod",String.class);
			
			privateParametrizedMethod.setAccessible(true);
			privateParametrizedMethod.invoke(student1,"T20WORLDCUP2023");
			
			Method publicNonParametrizedMethod=reflectedClass.getDeclaredMethod("publicNonParametrizedMethod");
			
			publicNonParametrizedMethod.setAccessible(true);
			publicNonParametrizedMethod.invoke(student1);
			
			Method publicParametrizedMethod=reflectedClass.getDeclaredMethod("publicParametrizedMethod",String.class);
			
			publicParametrizedMethod.setAccessible(true);
			publicParametrizedMethod.invoke(student1,"TEST-MATCH-2023");
			
			System.out.println("\n---------------------- Displaying Methods Available -----------------\n");
			
			Method methods[]=reflectedClass.getMethods();
			for (Method method : methods) {
				System.out.println("Method's Available Here : "+method.getName());
			}
			
			System.out.println("\n---------------------- Displaying Constructors Available -----------------\n");
			
			Constructor constructors[] = reflectedClass.getConstructors();
			for (Constructor constructor : constructors) {
				System.out.println("Constructor Available Here :  "+constructor.getName());
			}
			
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
			e.printStackTrace();
		}

	}
}