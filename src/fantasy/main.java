package fantasy;

import java.io.IOException;
import java.util.HashMap;

import fantasy.Player_Interface.position;

public class main {
	public static void main(String[] args) {
		// Add more tests as methods and call them here!!
		dothis();
	}

	public static void dothis() {
		HashMap<String,String> labelmap = new HashMap<String,String>();
		labelmap.put("1","GP");
		labelmap.put("2","Pass Att");
		labelmap.put("3","Pass Comp");
		labelmap.put("4","Incomplete Pass");
		labelmap.put("5","Pass Yards");
		labelmap.put("6","Pass TD");
		labelmap.put("7","Int");
		labelmap.put("8","Sacked");
		labelmap.put("13","Rush att");
		labelmap.put("14","Rush Yards");
		labelmap.put("15","Rush TD");
		labelmap.put("20","Reception");
		labelmap.put("21","Reception Yards");
		labelmap.put("22","Reception TD");
		labelmap.put("31","Fumble");
		labelmap.put("45","Sacks");
		labelmap.put("46","Interceptions");
		labelmap.put("47","Fumble Recovery");
		labelmap.put("49","Safeties");
		labelmap.put("50","D TD");
		labelmap.put("51","Blocked Kick");
		labelmap.put("54","Points Allowed");
		labelmap.put("62","Yards Allowed");
		Team Collin_team = new Team("Collin");
		Player Trevor = new Player("Trevor Siemian", position.QB, "Starter");
		Player Michael = new Player("Michael Crabtree", position.WR, "Starter");
		Player Cooper = new Player("Cooper Kupp", position.WR, "Bench");
		Collin_team.addplayer(Michael);
		Collin_team.addplayer(Trevor);
		Collin_team.addplayer(Cooper);
		System.out.println(Collin_team.getroster());
		System.out.println(Collin_team.getstarters());
		Collin_team.score();
	}
}
