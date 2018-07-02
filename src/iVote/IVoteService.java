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
	public IVoteService(boolean type, String title)
	{
		for (int i = 0; i < 10; i++)
		{
			int random = (int )(Math.random() * 9999 + 1000);
			students[i] = Integer.toString(random);
		}
		Questions question = new Questions(type, title);
		
	}

}
