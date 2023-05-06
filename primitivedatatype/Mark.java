package com.corejavaprojects.primitivedatatype;

public class Mark {

	private int englishMarks;
	private int scienceMarks;

	public Mark(int englishMarks, int scienceMarks) {
		this.englishMarks = englishMarks;
		this.scienceMarks = scienceMarks;
	}

	public void getMarkDetails() {
		System.out.println("English Marks : " + englishMarks);
		System.out.println("Science Marks : " + scienceMarks);
	}
}