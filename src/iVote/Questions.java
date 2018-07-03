package iVote;

/**
 * Thanh T Doan
 * CS 356
 * Prof: Yu Sun
 * Project 1
 * Questions class constructor receives boolean questionType and title of the CS Class csClass,
 * then generates possible choices for students to choose
 */

public class Questions {
	//type of the question, true for multiple choice, false for single choice
	private boolean questionType;
	
	//question array holds the possible choices for students to choose
	private String question[] = new String[6];
	
	public Questions(boolean questionType, String csClass) {
		//get questionType
		this.questionType = questionType;
		
		//generates choices depends on the type of question
		if (questionType)
		{
			for(int i = 0; i <= 5; i++)
			{
				switch(i)
				{
					case 0:
						question[i] = "Question for: " + csClass;
						break;
					case 1:
						question[i] = "A";
						break;
					case 2:
						question[i] = "B";
						break;
					case 3:
						question[i] = "C";
						break;
					case 4:
						question[i] = "D";
						break;
					case 5:
						question[i] = "E";
						break;
				}
			}
		}
		else
		{
			for(int i = 0; i <= 2; i++)
			{
				switch(i)
				{
					case 0:
						question[i] = "Question for: " + csClass;
						break;
					case 1:
						question[i] = "1. True";
						break;
					case 2:
						question[i] = "2. False";
						break;
				}
			}
		}	
		
	}
	
	//return the question array
	public String[] getQuestion() {
		return this.question;
	}
	
}
