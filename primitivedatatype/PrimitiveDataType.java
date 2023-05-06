package com.corejavaprojects.primitivedatatype;

public class PrimitiveDataType {

	private boolean booloeanVariable;
	private byte byteVariable;
	private short shortVariable;
	private char charVariable;
	private int intVariable;
	private long longVariable;
	private float floatVariable;
	private double doubleVariable;

	public PrimitiveDataType(boolean booloeanVariable, byte byteVariable, short shortVariable, char charVariable,
			int intVariable, long longVariable, float floatVariable, double doubleVariable) {
		this.booloeanVariable = booloeanVariable;
		this.byteVariable = byteVariable;
		this.shortVariable = shortVariable;
		this.charVariable = charVariable;
		this.intVariable = intVariable;
		this.longVariable = longVariable;
		this.floatVariable = floatVariable;
		this.doubleVariable = doubleVariable;
	}

	public void getAllVariables() {
		System.out.println("Boolean data is : " + booloeanVariable);
		System.out.println("Byte data is : " + byteVariable);
		System.out.println("Short data is : " + shortVariable);
		System.out.println("Char data is : " + charVariable);
		System.out.println("Integer data is : " + intVariable);
		System.out.println("Long data is : " + longVariable);
		System.out.println("Float data is : " + floatVariable);
		System.out.println("Double data is : " + doubleVariable);
	}
}