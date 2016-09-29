
public class baseball {
	
	//fields:
	int jNumber;
	String dir;
	int numOfRuns;
	int numOfRBI;
	int numOfGames;

	public baseball(int jNumber, String dir, int numOfRuns, int numOfRBI, int numOfGames) {
		this.jNumber = jNumber;
		this.dir = dir;
		this.numOfRuns = numOfRuns;
		this.numOfRBI = numOfRBI;
		this.numOfGames = numOfGames;
	}
	
	public void record(int hits, int RBI) {
		this.numOfGames += 1;
		this.numOfRuns += hits;
		this.numOfRBI += RBI;
	}
	
	public static void main(String[] args) {
		baseball Jose = new baseball(15, "right", 5, 10, 10);
		System.out.println("Jose's record went from - J# " + Jose.jNumber + " Direction: " + Jose.dir + " Number of Runs: " + Jose.numOfRuns + " Number of RBIs: " + Jose.numOfRBI + " and number of games: " + Jose.numOfGames);
		Jose.record(5, 2);
		System.out.println("to - J# " + Jose.jNumber + " Direction: " + Jose.dir + " Number of Runs: " + Jose.numOfRuns + " Number of RBIs: " + Jose.numOfRBI + " and number of games: " + Jose.numOfGames);
	}

}
