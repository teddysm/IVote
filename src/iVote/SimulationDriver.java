package iVote;

/**
 * Thanh T Doan
 * CS 356
 * Prof: Yu Sun
 * Project 1
 * SimulationDriver class has the main class and simulate the whole process.
 */
public class SimulationDriver {
	public static void main(String[] args) {
		//greets the user
		greeting();
		//create an array of 10 students
		String[] studentsID = new String[10];
		//generate 10 student IDs
		studentsID = getStudentsID(studentsID);
		
		//give each student a student ID
		Student Harry = new Student(studentsID[0]);
		Student Ron = new Student(studentsID[1]);
		Student Hermione = new Student(studentsID[2]);
		Student Dobby = new Student(studentsID[3]);
		Student Albus = new Student(studentsID[4]);
		Student Severus = new Student(studentsID[5]);
		Student Sirius = new Student(studentsID[6]);
		Student Tom = new Student(studentsID[7]);
		Student Luna = new Student(studentsID[8]);
		Student Minerva = new Student(studentsID[9]);
		
		//start the simulation process for a multiple choice question
		System.out.println("Simulating a multiple-choice question for CS 356 ");
		//create an IVoteService object with question type, class title and studentID array
		IVoteService test1 = new IVoteService(true, "CS 356", studentsID);
		//start submitting answers
		Albus.setAnswer("A"); Albus.setAnswer("B"); Albus.setAnswer("E");
		Minerva.setAnswer("D");
		Luna.setAnswer("E"); Luna.setAnswer("A");
		Severus.setAnswer("B"); Severus.setAnswer("A");
		Ron.setAnswer("A"); Ron.setAnswer("D"); Ron.setAnswer("E"); Ron.setAnswer("C");
		Harry.setAnswer("A"); Harry.setAnswer("B"); Harry.setAnswer("C"); Harry.setAnswer("E"); Harry.setAnswer("D");
		Tom.setAnswer("D");
		Sirius.setAnswer("B");
		Dobby.setAnswer("E"); Dobby.setAnswer("A");Dobby.setAnswer("D");
		Hermione.setAnswer("A"); Hermione.setAnswer("E");
		//display the answers statistic
		test1.getStats();
		
		//start the simulation process for a single choice question
		System.out.println("\nSimulating a single choice question for CS 356 ");
		//create an IVoteService object with question type, class title and studentID array
		IVoteService test2 = new IVoteService(false, "CS 356", studentsID);
		//start submitting answers
		Hermione.setAnswer("True");
		Sirius.setAnswer("False");
		Dobby.setAnswer("True"); 
		Albus.setAnswer("False"); 
		Minerva.setAnswer("False");
		Luna.setAnswer("False"); 
		Harry.setAnswer("False"); 
		Tom.setAnswer("True");
		Severus.setAnswer("True"); 
		Ron.setAnswer("True"); 
		//display the answers statistic
		test2.getStats();
	}
	
	//generate 10 students ID using Math.random()
	private static String[] getStudentsID(String[] studentsID) {
		for (int i = 0; i < studentsID.length; i++)
		{
			int random = (int )(Math.random() * 9999);
			studentsID[i] = Integer.toString(random);
		}
		return studentsID;
	}

	//greet the user
	public static void greeting() {
		System.out.println("Welcome to iVote.");
		System.out.println("This is a console-based pool service.\n");
	}


}
