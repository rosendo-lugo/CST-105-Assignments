package NFL_Draft;
public class DefensivePlayer extends NFLPlayer {

	public int interceptions;
	public int fumbles;
	public int tackels;	
	public double sacks;
	public int touchdown;

	public DefensivePlayer() {
		super ();
	}
	public DefensivePlayer (String name, String position, String team, int height, int weight,
			int age, int experience, String college, int interceptions, int fumbles, int tackels, double sacks, int touchdown ) {
		
	super (name, position, team, height, weight, age, experience, college);
	this.interceptions = interceptions;
	this.fumbles = fumbles;
	this.tackels = tackels;
	this.sacks = sacks;
	this.touchdown = touchdown;
	}

	public int getInterceptions() {
		return interceptions;
	}
	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}

	public int getFumbles() {
		return fumbles;
	}
	public void setFumbles(int fumbles) {
		this.fumbles = fumbles;
	}
	
	public int getTackels() {
		return tackels;
	}
	public void setTackels(int tackels) {
		this.tackels = tackels;
	}
	
	public double getSacks() {
		return sacks;
	}
	public void setSacks(double sacks) {
		this.sacks = sacks;
	}
	
	public int getTouchdown() {
		return touchdown;
	}
	public void setTouchdown(int touchdown) {
		this.touchdown = touchdown;
	}

}