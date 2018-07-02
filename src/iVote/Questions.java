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
	private String question[] = new String[5];
	
	public Questions(boolean questionType, String title) {
		this.questionType = questionType;
		if (questionType)
		{
			for(int i = 0; i <= 5; i++)
			{
				switch(i)
				{
					case 0:
						question[i] = title;
					case 1:
						question[i] = "A";
					case 2:
						question[i] = "B";
					case 3:
						question[i] = "C";
					case 4:
						question[i] = "D";
					case 5:
						question[i] = "E";
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
						question[i] = title;
					case 1:
						question[i] = "1. True";
					case 2:
						question[i] = "2. False";
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
