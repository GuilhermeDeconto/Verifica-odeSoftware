
public class GameEntry{
	
	private String nome;
	private int score;
	
	/** Constructor to create a game entry */
	public GameEntry(String n, int s) {
		this.nome = n;
		this.score = s;
	}
	
	/** Retrieves the name field */
	public String getName() {
		return "";
	}
	/** Retrieves the score field */
	public int getScore() {
		return 1;
	}
	/** Returns a string representation of this entry
	* Format: (<name>, <score>)
	*/

	@Override
	public String toString() {
		return "(" + nome + ", " + score + ")";
	}
	
}
