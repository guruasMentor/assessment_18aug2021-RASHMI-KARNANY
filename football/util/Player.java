package com.football.util;

public class Player {

	private String name;
	
	private int rank;

	//Mentor Comment: You could add "category" as a field in this class

	// Mentor Comments: Provide overloaded constructors

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	// Mentor Comment
	// Override equals(), hashCode(), toString()
}
