/**
 * 
 */
package iVote;

/**
 * Thanh T Doan
 *
 */
public class Questions {
	private boolean questionType;
	private String question[] = new String[6];
	
	public Questions(boolean questionType, String csClass) {
		this.questionType = questionType;
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
	
	public void setType(boolean questionType) {
		this.questionType = questionType;
	}
	
	public boolean getType() {
		return this.questionType;
	}
	
	public String[] getQuestion() {
		return this.question;
	}
	
}
