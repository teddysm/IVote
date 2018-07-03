package iVote;

/**
 * Thanh T Doan
 * CS 356
 * Prof: Yu Sun
 * Project 1
 * IVoteService class constructor receives boolean type of question, title of the CS Class csClass,
 * and an array of studentsID. IVoteService generate a Questions object with a type then display the
 * possible choices for students to choose. It receives answers from Student objects then tallies the 
 * answers to display the statistics 
 */

public class IVoteService {
	//studentsID array holds the students' ID
	private static String[] studentsID = new String[10];
	
	//questions array holds the question choices
	private String[] questions = new String[6];
	
	//answers array holds the number of votes for each question choice
	private static int[] answers = new int[] {0,0,0,0,0};
	
	//type holds the type of question, true for multiple choice, false for single choice
	private boolean type;
	
	public IVoteService(boolean type, String csClass, String[] studentsID)
	{
		//save variables
		this.type = type;
		this.studentsID = studentsID;
		
		//reset the tally count
		resetCount();
		
		//create Questions object with given question type and class title
		Questions question = new Questions(type, csClass);
		//get the question
		questions = question.getQuestion();
		//display the question choices
		for (int i = 0; i < questions.length; i++)
		{
			if(questions[i] != null)
				System.out.println(questions[i]);
		}	
	}
	
	//keep count of how many people choose each question choice
	public static void submitAnswer(String answer) {
		//increase the count whenever a student chooses a choice
		switch(answer)
		{
			case "A":
				answers[0]++;
				break;
			case "B":
				answers[1]++;
				break;
			case "C":
				answers[2]++;
				break;
			case "D":
				answers[3]++;
				break;
			case "E":
				answers[4]++;
				break;
			case "True":
				answers[0]++;
				break;
			case "False":
				answers[1]++;
				break;
		}
	}
	
	
	// return the answers statistics
	public void getStats() {
		System.out.println();
		if(type)
		{
			for (int i = 0; i < answers.length; i++)
			{
				if (i == 0) 
					System.out.println(answers[i] + " students choose A");
				if (i == 1) 
					System.out.println(answers[i] + " students choose B");
				if (i == 2) 
					System.out.println(answers[i] + " students choose C");
				if (i == 3) 
					System.out.println(answers[i] + " students choose D");
				if (i == 4) 
					System.out.println(answers[i] + " students choose E");
			}
		}
		else
		{
			for (int i = 0; i < 2; i++)
			{
				if (i == 0) 
					System.out.println(answers[i] + " students choose True");
				if (i == 1) 
					System.out.println(answers[i] + " students choose False");
			}
		
		}
	}
	
	//reset the tally count
	public void resetCount() {
		for (int i = 0; i < answers.length; i++)
			answers[i] = 0;
	}

}
