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
	public IVoteService(boolean type, String csClass)
	{
		for (int i = 0; i < 10; i++)
		{
			int random = (int )(Math.random() * 9999 + 1001);
			students[i] = Integer.toString(random);
			System.out.println(students[i]);
		}
		
		Questions question = new Questions(type, csClass);
		
		
	}

}
