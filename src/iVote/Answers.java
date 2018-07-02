/**
 * 
 */
package iVote;

/**
 * Thanh T Doan
 *
 */
public class Answers {
	private String answer[] = new String[5];
	private boolean type;
	public Answers(boolean type, String[] answers) {
		this.answer = answers;
		if (type)
		{
			
		}
		else
		{
			
		}
			
	}
	
	public void setSingleAnswer(String answer) {
		this.answer[0] = answer;
	}
	public String getSingleAnswer() {
		return answer[0];
	}
}
