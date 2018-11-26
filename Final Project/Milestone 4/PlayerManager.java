
import java.util.*;

public class PlayerManager {


	private static ArrayList<NFLPlayer> LIST_OF_PLAYERS = new ArrayList<NFLPlayer>();

	public PlayerManager() {
		createPlayers();
	}
	public static void createPlayers() {

		NFLPlayer brees = new OffensivePlayer("Drew Brees", "Quarterback", "New Orleans Saints", 72, 209, 39, 18, "Purdue", 6479, 9628, 67.3, 73409,  7.6, 513, 229,   387, 97.8,    8,   74,    9.2,     1,     460,   764,    1.7,   21, 20);
		NFLPlayer kamara = new OffensivePlayer("Alvin Kamara", "Runningback", "New Orleans Saints", 71, 215, 23, 2, "Tennessee",   0,    0,    0,     0,    0,   0,   0,     0,    0,  137, 1336,    9.8,     9,     256,  1345,    5.3,   19,  1);
		NFLPlayer cook = new OffensivePlayer("Dalvin Cook", "Runningback", "Minnesota Vikings", 70, 210, 23, 2, "Florida State",   0,    0,    0,     0,    0,   0,   0,     0,    0,   27,  215,    8.0,     0,     129,   553,    4.3,    2,  3);
		NFLPlayer cooks = new OffensivePlayer("Brandin Cooks", "Wide Reciever", "Los Angeles Rams", 70, 183, 25, 5, "Oregon State", 0,    0,    0,     0,    0,   0,   0,     0,    0,  339, 4907,   14.5,    30,      37,   202,    5.5,    2,  3);
		NFLPlayer woods = new OffensivePlayer("Rober Woods", "Wide Reciever", "Los Angeles Rams", 74, 195, 26, 6, "USC",            0,    0,    0,     0,    0,   0,   0,     0,    0,  318, 4136,   13.0,    21,      19,   145,    7.6,    0,  3);
		NFLPlayer hilton = new OffensivePlayer("T.Y. Hilton", "Wide Reciever", "Indianapolis Colts", 70, 183, 29, 7, "Florida International", 0, 1,    0,    0,    0,   0,   0,     0, 39.6,  469, 7412,   15.8,    40,       9,    55,    6.1,    2,  6);
		NFLPlayer hooper = new OffensivePlayer("Austin Hooper", "Tight End", "Atlanta Falcons", 75, 254, 24, 3, "Stanford",         0,    0,    0,     0,    0,   0,   0,     0,    0,  118, 1242,   10.5,     9,       0,     0,      0,    0,  0);
		NFLPlayer succop = new OffensivePlayer("Ryan Succop", "Kicker", "Tennessee Titans", 74,  218, 32, 10, "South Carolina",     0,    0,    0,     0,    0,   0,   0,     0,    0,    0,    0,      0,     0,       0,     0,      0,    0,  0);
		NFLPlayer yeldon = new OffensivePlayer("T.J. Yeldon", "Runningback", "Jacksonville Jaguars", 73, 223, 25, 4, "Alabama",     0,    0,    0,     0,    0,   0,   0,     0,    0,  160, 1221,    7.6,     6,     450,  1827,    4.1,    6,  5);
		NFLPlayer davis = new OffensivePlayer("Mike Davis", "Runningback", "Seattle Seahawks", 70, 217,	25, 4, "South Carolina",    0,    0,    0,     0,    0,   0,   0,     0,    0,   48,  328,    6.8,     1,     204,   720,    3.5,    4,  1);
		NFLPlayer barber = new OffensivePlayer("Peyton Barber", "Runningback", "Tampa Bay Buccaneers", 71, 225,	24, 4, "Auburn",    0,    0,    0,     0,    0,   0,   0,     0,    0,   32,  197,    6.2,     1,     298,  1189,    4.0,    6,  2);
		NFLPlayer lockett = new OffensivePlayer("Tyler Lockett", "Wide Reciever", "Seattle Seahawks", 70,  182,	26, 4, "Kansas State", 0, 0,    0,     0,    0,   0,   0,     0,    0,  175, 2370,   13.5,    16,      28,   242,    4.2,    1,  1);
		NFLPlayer valdesScantling = new OffensivePlayer("Marquez Valdes-Scantling", "Wide Reciever", "Green Bay Packers", 76, 206, 24, 1, "South Florida", 0, 0,  0,   0,     0,    0,    0,    0,    0,   24,  410,   17.1,     2,       0,     0,      0,    0,  0);
		NFLPlayer graham = new OffensivePlayer("Jimmy Graham", "Tight End", "Green Bay Packers", 79, 265, 31, 9, "Miami (Fla.)",    0,    0,    0,     0,    0,   0,   0,     0,    0,  590, 7252,   12.3,    71,       2,     3,    1.5,    0,  7);
	
		
		NFLPlayer vanderEsch = new DefensivePlayer("Vander Esch", "Weakside Linebacker", "Dallas Cowboys", 76, 255, 22, 1, "Boise State", 2, 0, 72, 0, 0);
		NFLPlayer Lawrence = new DefensivePlayer("Demarcus Lawrence", "Left Defensive End", "Dallas Cowboys", 75, 265, 26, 5, "Boise State", 1, 1, 47, 8.5, 0);
		NFLPlayer Crawford = new DefensivePlayer("Tyrone Crawford", "Right Defensive Tackle", "Dallas Cowboys", 76, 285, 29, 7, " Boise State", 0, 0, 107, 21, 0);
		NFLPlayer Collins = new DefensivePlayer("Maliek Collins", "Left Defensive Tackle", "Dallas Cowboys", 74, 308, 23, 3, "Nebraska", 0, 0, 34, 9.5, 0);
		NFLPlayer Smith = new DefensivePlayer("Jaylon Smith", "Middle Linebacker", "Dallas Cowboys", 74, 245, 23, 2, "Notre Dame", 0, 2, 102, 5.0, 0);		
		NFLPlayer Jones = new DefensivePlayer("Byron Jones", "Right Cornerback", "Dallas Cowboys", 73, 200, 26, 4, "Connecticut", 2, 0, 217, 0, 1);		
		NFLPlayer Awuzie = new DefensivePlayer("Chidobe Awuzie", "Left Cornerback", "Dallas Cowboys", 72, 202, 23, 2, "Colorado", 1, 1, 58, 0, 0);
		NFLPlayer Heath = new DefensivePlayer("Jeff Heath", "Strong Safety", "Dallas Cowboys", 73, 212, 27, 6, "Saginaw Valley State", 8, 1, 203, 0, 0);
		NFLPlayer Woods = new DefensivePlayer("Xavier Woods", "Free Safety", "Dallas Cowboys", 71, 205, 23, 2, "Louisiana Tech", 3, 0, 58, 0, 0);
		
		
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
		LIST_OF_PLAYERS.add(vanderEsch);
		LIST_OF_PLAYERS.add(Lawrence);		
		LIST_OF_PLAYERS.add(Smith);		
		LIST_OF_PLAYERS.add(Jones);		
		LIST_OF_PLAYERS.add(Awuzie);	
		LIST_OF_PLAYERS.add(Crawford);
		LIST_OF_PLAYERS.add(Collins);
		LIST_OF_PLAYERS.add(Heath);
		LIST_OF_PLAYERS.add(Woods);
		}

	
	public String toString() {
		String list = "";
		for (NFLPlayer n : LIST_OF_PLAYERS)
			list += (n.getName() + " " + LIST_OF_PLAYERS.indexOf(n) + "\n");
		return list;
	}

}