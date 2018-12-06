package NFL_Draft;

	public abstract class NFLPlayer {

			String name;
			private String position;
			private String team;
			private double height;
			private double weight;
			private int age;
			private int experience;
			private String college;

			public NFLPlayer () {
				super ();
			}
			
			public NFLPlayer(String name, String position, String team, double height, double weight, int age, int experience, String college) {
				super();
				this.name = name;
				this.position = position;
				this.team = team;
				this.height = height;
				this.weight = weight;
				this.age = age;
				this.experience = experience;
				this.college = college;
			}
				
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}

			public String getPosition() {
				return position;
			}
			public void setPosition(String position) {
				this.position = position;
			}
			
			public String getTeam() {
				return team;
			}		
			public void setTeam(String team) {
				this.team = team;
			}
			
			public double getHeight() {
				return height;
			}
			public void setHeight(double height) {
				this.height = height;
			}

			public double getWeight() {
				return weight;
			}
			public void setWeight(double weight) {
				this.weight = weight;
			}

			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}

			public int getExperience() {
				return experience;
			}
			public void setExperience(int experience) {
				this.experience = experience;
			}

			public String getCollege() {
				return college;
			}
			public void setCollege(String college) {
				this.college = college;
			}

}