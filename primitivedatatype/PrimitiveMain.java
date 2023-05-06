package com.corejavaprojects.primitivedatatype;

public class PrimitiveMain {

	public static void main(String[] args) {

		PrimitiveDataType primitive = new PrimitiveDataType(true, (byte) 78, (short) 97, 'C', 33, 12l, 87.01f,
				887.12008);
		primitive.getAllVariables();
	}

} 