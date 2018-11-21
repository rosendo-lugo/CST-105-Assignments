
import java.util.*;

public class PlayerManager {

	final private static ArrayList<NFLPlayer> LIST_OF_PLAYERS = new ArrayList<NFLPlayer>();

	public PlayerManager() {
		createPlayers();
	}
	public static void createPlayers() {

		NFLPlayer brees = new NFLPlayer("Drew Brees",     	39,    209,     72,        6479, 9628, 67.3, 73409,  7.6, 513, 229,   387, 97.8,    8,   74,    9.2,     1,     460,   764,    1.7,   21, 20);
		NFLPlayer kamara = new NFLPlayer("Alvin Kamara",    23,    215,     71,           0,    0,    0,     0,    0,   0,   0,     0,    0,  137, 1336,    9.8,     9,     256,  1345,    5.3,   19,  1);
		NFLPlayer cook = new NFLPlayer("Dalvin Cook",     	23,    210,     70,           0,    0,    0,     0,    0,   0,   0,     0,    0,   27,  215,    8.0,     0,     129,   553,    4.3,    2,  3);
		NFLPlayer cooks = new NFLPlayer("Brandin Cooks", 	25,    183,     70,           0,    0,    0,     0,    0,   0,   0,     0,    0,  339, 4907,   14.5,    30,      37,   202,    5.5,    2,  3);
		NFLPlayer woods = new NFLPlayer("Rober Woods", 		26,    195,     74,           0,    0,    0,     0,    0,   0,   0,     0,    0,  318, 4136,   13.0,    21,      19,   145,    7.6,    0,  3);
		NFLPlayer hilton = new NFLPlayer("T.Y. Hilton", 	29,    183,     70,           0,    1,    0,     0,    0,   0,   0,     0, 39.6,  469, 7412,   15.8,    40,       9,    55,    6.1,    2,  6);
		NFLPlayer hooper = new NFLPlayer("Austin Hooper", 	24,    254,     75,           0,    0,    0,     0,    0,   0,   0,     0,    0,  118, 1242,   10.5,     9,       0,     0,      0,    0,  0);
		NFLPlayer succop = new NFLPlayer("Ryan Succop", 	32,    218,     74,           0,    0,    0,     0,    0,   0,   0,     0,    0,    0,    0,      0,     0,       0,     0,      0,    0,  0);
		NFLPlayer yeldon = new NFLPlayer("T.J. Yeldon", 	25,    223,     73,           0,    0,    0,     0,    0,   0,   0,     0,    0,  160, 1221,    7.6,     6,     450,  1827,    4.1,    6,  5);
		NFLPlayer davis = new NFLPlayer("Mike Davis", 		25,    217,     70,           0,    0,    0,     0,    0,   0,   0,     0,    0,   48,  328,    6.8,     1,     204,   720,    3.5,    4,  1);
		NFLPlayer barber = new NFLPlayer("Peyton Barber", 	24,    225,     71,           0,    0,    0,     0,    0,   0,   0,     0,    0,   32,  197,    6.2,     1,     298,  1189,    4.0,    6,  2);
		NFLPlayer lockett = new NFLPlayer("Tyler Lockett", 	26,    182,     70,           0,    0,    0,     0,    0,   0,   0,     0,    0,  175, 2370,   13.5,    16,      28,   242,    4.2,    1,  1);
		NFLPlayer valdesScantling = new NFLPlayer("Marquez Valdes-Scantling", 24, 206, 76, 0,   0,    0,     0,    0,   0,   0,     0,    0,   24,  410,   17.1,     2,       0,     0,      0,    0,  0);
		NFLPlayer graham = new NFLPlayer("Jimmy Graham", 	31,    265,     79,           0,    0,    0,     0,    0,   0,   0,     0,    0,  590, 7252,   12.3,    71,       2,     3,    1.5,    0,  7);
		
		
		LIST_OF_PLAYERS.add(brees);
		LIST_OF_PLAYERS.add(kamara);
		LIST_OF_PLAYERS.add(cook);
		LIST_OF_PLAYERS.add(cooks);
		LIST_OF_PLAYERS.add(woods);
		LIST_OF_PLAYERS.add(hilton);
		LIST_OF_PLAYERS.add(hooper);
		LIST_OF_PLAYERS.add(succop);
		LIST_OF_PLAYERS.add(yeldon);
		LIST_OF_PLAYERS.add(davis);
		LIST_OF_PLAYERS.add(barber);
		LIST_OF_PLAYERS.add(lockett);
		LIST_OF_PLAYERS.add(valdesScantling);
		LIST_OF_PLAYERS.add(graham);

	}

	public String toString() {
		String list = "";
		for (NFLPlayer n : LIST_OF_PLAYERS)
			list += (n.name + " " + LIST_OF_PLAYERS.indexOf(n) + "\n");
		return list;
	}

	public static void main(String[] args) {

		PlayerManager test = new PlayerManager();
		System.out.println(test.toString());

		System.out.println("\nBrees's Stats:\nPassing %: " + PlayerManager.LIST_OF_PLAYERS.get(0).getPassingPercent()
				+ "%\nPassing AVG:" + PlayerManager.LIST_OF_PLAYERS.get(0).getPassingAverage() + "\nRushing YDS AVG: "
				+ PlayerManager.LIST_OF_PLAYERS.get(0).getRushingAverage() );

		PlayerManager.LIST_OF_PLAYERS.get(0).setPassingAttempts(50);
		PlayerManager.LIST_OF_PLAYERS.get(0).setPassingTouchDowns(10);

		System.out.println("Setter Test: Brees Passing % now equals " + PlayerManager.LIST_OF_PLAYERS.get(0).getPassingPercent() + "%");

	}

}