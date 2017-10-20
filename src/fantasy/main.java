package fantasy;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import fantasy.Player_Interface.position;

public class main {
	public static void main(String[] args) {
		// Add more tests as methods and call them here!!
		dothis();
	}

	public static void dothis() {
		HashMap<String, String> labelmap = new HashMap<String, String>();
		labelmap.put("1", "GP");
		labelmap.put("2", "Pass Att");
		labelmap.put("3", "Pass Comp");
		labelmap.put("4", "Incomplete Pass");
		labelmap.put("5", "Pass Yards");
		labelmap.put("6", "Pass TD");
		labelmap.put("7", "Int");
		labelmap.put("8", "Sacked");
		labelmap.put("13", "Rush att");
		labelmap.put("14", "Rush Yards");
		labelmap.put("15", "Rush TD");
		labelmap.put("20", "Reception");
		labelmap.put("21", "Reception Yards");
		labelmap.put("22", "Reception TD");
		labelmap.put("30", "Fumble Lost");
		labelmap.put("31", "Fumble");
		labelmap.put("32", "2-pt Conversion");
		labelmap.put("45", "Sacks");
		labelmap.put("46", "Interceptions");
		labelmap.put("47", "Fumble Recovery");
		labelmap.put("49", "Safeties");
		labelmap.put("50", "D TD");
		labelmap.put("53", "Special Teams TD");
		labelmap.put("51", "Blocked Kick");
		labelmap.put("54", "Points Allowed");
		labelmap.put("62", "Yards Allowed");
		Team Collin_team = new Team("Collin");
		//Player Trevor = new Player("Trevor Siemian", position.QB, "Starter");
		//Player Tyrod = new Player("Tyrod Taylor", position.QB, "Starter");
		//Player Michael = new Player("Michael Crabtree", position.WR, "Starter");
		//Player Cooper = new Player("Cooper Kupp", position.WR, "Bench");
		//Player Beng = new Player("Cincinnati Bengals", position.DEF, "Starter");
		try {
			URLReader.main(Collin_team);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Collin_team.addplayer(Michael);
		//Collin_team.addplayer(Beng);
		//Collin_team.addplayer(Trevor);
		//Collin_team.addplayer(Cooper);
		//Collin_team.addplayer(Tyrod);
		//System.out.println(Collin_team.getroster());
		System.out.println(Collin_team.getstarters());
		Collin_team.score();
		/*Player Collin[] = new Player[5];
		Collin[0] = Michael;
		Collin[1] = Trevor;
		Collin[2] = Cooper;
		Collin[3] = Beng;
		Collin[4] = Tyrod;
		for (int i = 0; i < Collin.length; i++) {
			Player playern = Collin[i];
			try {
				playern.add_stats();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HashMap score = playern.get_scores();
			System.out.println(Arrays.asList(score));
			Iterator it = score.entrySet().iterator();
			int addscore = 0;
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry) it.next();
				addscore += (int) pair.getValue();
				it.remove(); // avoids a ConcurrentModificationException
			}
			// score.put("FINAL SCORE",addscore);
			System.out.println(playern.get_name()+" FINAL SCORE " + addscore);
			*/
		}
	}

