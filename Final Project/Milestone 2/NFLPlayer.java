

public class NFLPlayer {

	public String name;
	public int age;
	public double weight;
	public double height;
	public int completions;
	public int passingAttempts;
	public double passingPercent;
	public int passingYards;
	public double passingAverage;
	public int passingTouchDowns;	
	public int interception;
	public int sacks;
	public double rating; 
	public int receivingReception;
	public int receivingYards;
	public double receivingAverage;
	public int receivingTouchDown;
	public int rushingAttempts;
	public int rushingYards;
	public double rushingAverage;
	public int rushingTouchDowns;
	public int fumbles;
	public NFLPlayer() {
	}
	public NFLPlayer(String name, int age, double weight, double height, int completions, int passingAttempts, double passingPercent, int passingYards, 
			double passingAverage, int passingTouchDowns, int interception, int sacks, double rating, int receivingReception, int receivingYards, 
			double receivingAverage, int receivingTouchDown, int rushingAttempts, int rushingYards, double rushingAverage, int rushingTouchDowns, int fumbles) {

		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
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
	public String toString() {
		return name;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;

	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;

	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;

	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
		
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
	public static void main(String[] args) {


		NFLPlayer romo = new NFLPlayer();
		romo.setName("Tony Romo");
		System.out.println("Testing no-arg constructor, setters, & toString method:\n" + romo.toString());

		NFLPlayer prescott = new NFLPlayer("Dak Prescott", 25, 235, 74, 816, 1254, 65.1, 9129, 7.3, 56, 22, 91, 94.2, 0, 0, 0, 0, 166, 900, 5.4, 16, 21);
		prescott.setAge(23);
		prescott.setWeight(250);
		System.out.println("\nTesting narg constructor, setters, and getters:\nDaK Prescott age is not " + prescott.getAge()
				+ " years old nor he's " + prescott.getWeight() + " lbs, but he's " + prescott.getHeight() + " inches tall");
		


	}
}