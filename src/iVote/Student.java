package iVote;

/**
 * Thanh T Doan
 * CS 356
 * Prof: Yu Sun
 * Project 1
 * Student class constructor receives student ID
 * Student object can submit answers via IVoteService
 */

public class Student {
	//generate Student object with unique ID
	private String id;
	public Student(String id) {
		this.id = id;
	}
	
	//submit answer
	public void setAnswer(String answer) {
		IVoteService.submitAnswer(answer);
	}
}
