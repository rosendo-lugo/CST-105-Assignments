public class NFLPlayer {

	public String name;
	 int age;
	 double weight;
	 double height;
	 int completions;
	 int passingAttempts;
     double passingPercent;
     double passingYards;
     double passingAverage;
     int passingTouchDowns;	
   	 int interception;
   	 int sacks;
	 double rating;   	 
	 int rushingAttempts;
	 double rushingYards;
	 double rushingAverage;
	 int rushingTouchDowns;
	 int fumbles;
	public NFLPlayer() {
	}
	public NFLPlayer(String name, int age, double weight, double height, int completions, int passingAttempts, double passingPercent, double passingYards, double passingAverage, int passingTouchDowns,
			int interception, int sacks, double rating, int rushingAttempts, double rushingYards, double rushingAverage, int rushingTouchDowns, int fumbles) {

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
	public void setPassingPercent(int passingPercent) {
		this.passingPercent = passingPercent;
		
	}
	public double getPassingYards() {
		return passingYards;
	}
	public void setPassingYards(int passingYards) {
		this.passingYards = passingYards;
		
	}
	public double getPassingAverage() {
		return passingAverage;
	}
	public void setPassingAverage(int passingAverage) {
		this.passingAverage = passingAverage;
		
	}
	public int getPassingTouchDowns() {
		return passingTouchDowns;
	}
	public void setPassingTouchDowns(int passingTouchDowns) {
		this.passingTouchDowns = passingTouchDowns;

	}
	public int getinterception() {
		return interception;
	}
	public void setinterception(int interception) {
		this.interception = interception;

	}
	public int getsacks() {
		return sacks;
	}
	public void setsacks(int sacks) {
		this.sacks = sacks;

	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getRushingAttempts() {
		return rushingAttempts;
	}
	public void setRushingAttempts(int rushingAttempts) {
		this.rushingAttempts = rushingAttempts;
		
	}
	public double getRushingYards() {
		return rushingYards;
	}
	public void setRushingYards(int rushingYards) {
		this.rushingYards = rushingYards;

	}
	public int getRushingTouchDowns() {
		return rushingTouchDowns;
	}
	public double getRushingAverage() {
		return rushingAverage;
	}
	public void setRushingAverage(int rushingAverage) {
		this.rushingAverage = rushingAverage;

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


		NFLPlayer prescott = new NFLPlayer("Dak Prescott", 25, 235, 74, 816, 1254, 65.1, 9129, 7.3, 56, 22, 91, 94.2, 166, 900, 5.4, 16, 21);
		prescott.setAge(23);
		prescott.setWeight(250);
		System.out.println("\nTesting narg constructor, setters, and getters:\nDaK Prescott age is not " + prescott.getAge()
				+ " years old nor is " + prescott.getWeight() + " lbs, but he's " 
				+ prescott.getHeight() + " inches tall");
		
		NFLPlayer romo = new NFLPlayer();
				romo.setName("Tony Romo");
		System.out.println("Testing no-arg constructor, setters, & toString method:\n" + romo.toString());

	}
}