package com.corejavaprojects.inheritance;

class Grandmother {
	public static int staticVar = 10;
	public int nonStaticVar;

	public Grandmother() {
		this.nonStaticVar = 20;
	}

	public Grandmother(int nonStaticVar) {
		this.nonStaticVar = nonStaticVar;
	}

	public static void staticMethod() {
		System.out.println("This is a static method in Grandmother");
	}

	public void nonStaticMethod() {
		System.out.println("This is a non-static method in Grandmother");
	}
}

class Mother extends Grandmother {
	public static int staticVar = 30;
	public int nonStaticVar;

	public Mother() {
		super();
		this.nonStaticVar = 40;
	}

	public Mother(int nonStaticVar) {
		super(nonStaticVar);
		this.nonStaticVar = nonStaticVar;
	}

	public static void staticMethod() {
		System.out.println("This is a static method in Mother");
	}

	public void nonStaticMethod() {
		System.out.println("This is a non-static method in Mother");
	}
}

class Daughter extends Mother {
	public static int staticVar = 50;
	public int nonStaticVar;

	public Daughter() {
		super();
		this.nonStaticVar = 60;
	}

	public Daughter(int nonStaticVar) {
		super(nonStaticVar);
		this.nonStaticVar = nonStaticVar;
	}

	public static void staticMethod() {
		System.out.println("This is a static method in Daughter");
	}

	public void nonStaticMethod() {
		System.out.println("This is a non-static method in Daughter");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		Daughter d = new Daughter();

		System.out.println(d.staticVar); // Accessing static variable of Daughter
		System.out.println(Daughter.staticVar); // Accessing static variable of Daughter using class name
		System.out.println(Mother.staticVar); // Accessing static variable of Mother
		System.out.println(Grandmother.staticVar); // Accessing static variable of Grandmother

		System.out.println("Accessing non-static variable of Daughter"+d.nonStaticVar); // Accessing non-static variable of Daughter
		System.out.println("Accessing non-static variable of Mother through Daughter\r\n"
				+((Mother) d).nonStaticVar); // Accessing non-static variable of Mother through Daughter object

		d.staticMethod(); // Calling static method of Daughter
		Daughter.staticMethod(); // Calling static method of Daughter using class name
		Mother.staticMethod(); // Calling static method of Mother
		Grandmother.staticMethod(); // Calling static method of Grandmother

		d.nonStaticMethod(); // Calling non-static method of Daughter
		((Mother) d).nonStaticMethod(); // Calling non-static method of Mother through Daughter object
	}
}
