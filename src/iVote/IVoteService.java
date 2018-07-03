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
		
		for (int i = 0; i < students.length; i++)
		{
			
			
		}
	}

}
