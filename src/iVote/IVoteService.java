/**
 * 
 */
package iVote;

/**
 * Thanh T Doan
 *
 */

public class IVoteService {
	private String[] students = new String[10];
	private String[] questions = new String[6];
	private String[] answers = new String[10];
	public IVoteService(boolean type, String csClass)
	{
		for (int i = 0; i < students.length; i++)
		{
			int random = (int )(Math.random() * 9999 + 1001);
			students[i] = Integer.toString(random);
		}
		
		Questions question = new Questions(type, csClass);
		questions = question.getQuestion();
		for (int i = 0; i < questions.length; i++)
		{
			if(questions[i] != null)
				System.out.println(questions[i]);
		}
		getAnswers(type);
		stats();

		

	}
	
	//get answers from students
	public void getAnswers(boolean type) {
		if (type)
		{
			for (int i = 0; i < students.length; i++)
			{
				
				
			}
		}
		else
		{
			for (int i = 0; i < students.length; i++)
			{
				
				
			}
		}
	}
	
	// display the answers statistics
	public void stats() {
		for (int i = 1; i < questions.length; i++)
		{
			switch(i)
			{
				case 1:
					System.out.println(" students chooses A");
					break;
				case 2:
					System.out.println(" students chooses B");
					break;
				case 3:
					System.out.println(" students chooses C");
					break;
				case 4:
					System.out.println(" students chooses D");
					break;
				case 5:
					System.out.println(" students chooses E");
					break;
					
			}
				
		}
	}

}
