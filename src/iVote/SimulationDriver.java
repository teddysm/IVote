/**
 * 
 */
package iVote;

/**
 * Thanh T Doan
 *
 */
public class SimulationDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		greeting();
		String[] students = new String[10];
		students = generatingStudents(students);
		System.out.println("Simulating a multiple-choice question for CS 356 ");
		IVoteService test1 = new IVoteService(students, true, "CS 356");
		System.out.println("\nSimulating a single choice question for CS 356 ");
		IVoteService test2 = new IVoteService(students, false, "CS 356");

	}
	
	private static String[] generatingStudents(String[] students) {
		for (int i = 0; i < 10; i++)
		{
			int random = (int )(Math.random() * 9999 + 1000);
			students[i] = Integer.toString(random);
		}
		return students;
	}

	public static void greeting() {
		System.out.println("Welcome to iVote.");
		System.out.println("This is a console-based pool service.\n");
	}


}
