/**
 * 
 */
package iVote;

/**
 * Thanh T Doan
 *
 */
public class Student {
	private String id;
	private String answer;
	public Student(String id, String answer) {
		this.id = id;
		this.answer = answer;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswer() {
		return this.answer;
	}
	public String getId() {
		return this.id;
	}
	
}
