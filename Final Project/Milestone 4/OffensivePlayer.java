
public class OffensivePlayer extends NFLPlayer {

	private int completions;
	private int passingAttempts;
	private double passingPercent;
	private int passingYards;
	private double passingAverage;
	private int passingTouchDowns;	
	private int interception;
	private int sacks;
	private double rating; 
	private int receivingReception;
	private int receivingYards;
	private double receivingAverage;
	private int receivingTouchDown;
	private int rushingAttempts;
	private int rushingYards;
	private double rushingAverage;
	private int rushingTouchDowns;
	private int fumbles;
	
	public OffensivePlayer() {
	}
	public OffensivePlayer(String name, String position, String team, int height, int weight, int age, int experience, String college, int completions,
			int passingAttempts, double passingPercent, int passingYards, double passingAverage, int passingTouchDowns,int interception, int sacks,
			double rating, int receivingReception, int receivingYards, double receivingAverage, int receivingTouchDown, int rushingAttempts, int rushingYards,
			double rushingAverage, int rushingTouchDowns, int fumbles) {

		super (name, position, team, height, weight, age, experience, college);
		this.completions = completions;
		this.passingAttempts = passingAttempts;	
		this.passingPercent = passingPercent;
		this.passingYards = passingYards;
		this.passingAverage = passingAverage;
		this.passingTouchDowns = passingTouchDowns;
		this.interception = interception;
		this.sacks = sacks;
		this.rating = rating;
		this.receivingReception = receivingReception;
		this.receivingYards = receivingYards;
		this.receivingAverage = receivingAverage;
		this.receivingTouchDown = receivingTouchDown;
		this.rushingAttempts = rushingAttempts;
		this.rushingYards = rushingYards;
		this.rushingAverage = rushingAverage;
		this.rushingTouchDowns = rushingTouchDowns;
		this.fumbles = fumbles;
	}
	
    
	public int getCompletions() {
		return completions;
	}
	public void setCompletions(int completions) {
		this.completions = completions;
		
	}
	public int getPassingAttempts() {
		return passingAttempts;
	}
	public void setPassingAttempts(int passingAttempts) {
		this.passingAttempts = passingAttempts;
		
	}
	public double getPassingPercent() {
		return passingPercent;
	}
	public void setPassingPercent(double passingPercent) {
		this.passingPercent = passingPercent;
		
	}
	public int getPassingYards() {
		return passingYards;
	}
	public void setPassingYards(int passingYards) {
		this.passingYards = passingYards;
		
	}
	public double getPassingAverage() {
		return passingAverage;
	}
	public void setPassingAverage(double passingAverage) {
		this.passingAverage = passingAverage;
		
	}
	public int getPassingTouchDowns() {
		return passingTouchDowns;
	}
	public void setPassingTouchDowns(int passingTouchDowns) {
		this.passingTouchDowns = passingTouchDowns;

	}
	public int getInterception() {
		return interception;
	}
	public void setInterception(int interception) {
		this.interception = interception;

	}
	public int getSacks() {
		return sacks;
	}
	public void setSacks(int sacks) {
		this.sacks = sacks;

	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
		
	}
	public int getReceivingReception() {
		return receivingReception;
	}
	public void setReceivingRecepetion(int receivingReception) {
		this.receivingReception = receivingReception;
		
	}
	public int getReceivingYards() {
		return receivingYards;
	}
	public void setReceivingYards(int receivingYards) {
		this.receivingYards = receivingYards;
		
	}
	public double getReceivingAverage() {
		return receivingAverage;
	}
	public void setReceivingAverage(double receivingAverage) {
		this.receivingAverage = receivingAverage;
		
	}
	public int getReceivingTouchDown() {
		return receivingTouchDown;
	}
	public void setReceivingTouchDown(int receivingTouchDown) {
		this.receivingTouchDown = receivingTouchDown;
		
	}
	public int getRushingAttempts() {
		return rushingAttempts;
	}
	public void setRushingAttempts(int rushingAttempts) {
		this.rushingAttempts = rushingAttempts;
		
	}
	public int getRushingYards() {
		return rushingYards;
	}
	public void setRushingYards(int rushingYards) {
		this.rushingYards = rushingYards;
		
	}
	public double getRushingAverage() {
		return rushingAverage;
	}
	public void setRushingAverage(double rushingAverage) {
		this.rushingAverage = rushingAverage;
		
	}
	public int getRushingTouchDowns() {
		return rushingTouchDowns;
	}
	public void setRushingTouchDowns(int rushingTouchDowns) {
		this.rushingTouchDowns = rushingTouchDowns;

	}
	public int getFumbles() {
		return fumbles;
	}
	public void setFumbles(int fumbles) {
		this.fumbles = fumbles;
	}

    @Override
    public String toString() {
        return "Offensive Player: " + Integer.toString(this.completions) + " " + Integer.toString(this.passingAttempts) + " " + Double.toString(this.passingPercent) + " " 
                + Integer.toString(this.passingYards) + " " + Double.toString(this.passingAverage) + " " + Integer.toString(this.passingTouchDowns) + " " + Integer.toString(this.interception)
                + " " + Integer.toString(this.sacks) + " " + Double.toString(this.rating) + " " + Integer.toString(this.receivingReception)+ " " + Integer.toString(this.receivingYards)
                + " " + Double.toString(this.receivingAverage) + " " + Integer.toString(this.receivingTouchDown)+ Integer.toString(this.rushingAttempts) + " " 
                + Integer.toString(this.rushingYards)+ Double.toString(this.rushingAverage) + " " + Integer.toString(this.rushingTouchDowns) + " " + Integer.toString(this.fumbles);

    }
}