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
		System.out.println("Simulating a multiple-choice question for CS 356 ");
		IVoteService test1 = new IVoteService(true, "CS 356");
		System.out.println("\nSimulating a single choice question for CS 356 ");
		IVoteService test2 = new IVoteService(false, "CS 356");
	}
	

	public static void greeting() {
		System.out.println("Welcome to iVote.");
		System.out.println("This is a console-based pool service.\n");
	}


}
