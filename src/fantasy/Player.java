package fantasy;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Player implements Player_Interface {

	public String playername;
	public position player_position;
	public String status;
	public HashMap labelmap;
	public HashMap labelstat;

	public double player_points;

	public Player(String a_playername, position a_position, String a_status) {
		playername = a_playername;
		player_position = a_position;
		status = a_status;

	}

	@Override
	public String get_name() {
		return playername;
	}

	@Override
	public position get_position() {
		return player_position;
	}

	@Override
	public double get_stat(String stat) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double get_fscore() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public HashMap get_stats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List get_scores() {
		HashMap<String, Integer> labelscore = new HashMap<String, Integer>();
		switch (player_position) {
		case DEF:
			break;
		case QB:
			if(this.labelstat.containsKey(1)) {
				if (this.labelstat.containsKey(3)) {
					int pascomp = (int) this.labelstat.get(3);
					if (pascomp <5){
						labelscore.put("completions",0);}
					else if (pascomp < 12) {
						labelscore.put("completions",2);}
					else if (pascomp < 15) {
						labelscore.put("completions",4);}
					else if (pascomp < 21) {
						labelscore.put("completions",6);}
					else if (pascomp < 24) {
						labelscore.put("completions",8);}
					else if (pascomp < 28) {
						labelscore.put("completions",12);}
					else if (pascomp < 31) {
						labelscore.put("completions",16);}
					else if (pascomp < 36) {
						labelscore.put("completions",20);}
					else if (pascomp > 35) {
						labelscore.put("completions",24);}
					}
				if (this.labelstat.containsKey(3) && this.labelstat.containsKey(2)) {
					double pasperc = (((double) this.labelstat.get(3))/((double) this.labelstat.get(2)));
					int pascomp = (int) this.labelstat.get(3);
					if (pascomp < 6) labelscore.put("completion percent",0);
					else if (pascomp >14){
						if (pasperc < .5) labelscore.put("completion percent",0);
						else if (pasperc < .56) labelscore.put("completion percent",2);
						else if (pasperc < .61) labelscore.put("completion percent",4);
						else if (pasperc < .68) labelscore.put("completion percent",8);
						else if (pasperc < .74) labelscore.put("completion percent",16);
						else if (pasperc < .80) labelscore.put("completion percent",20);
						else if (pasperc >= .9) labelscore.put("completion percent",24);
					}
					else if (pascomp >6) {
						if (pasperc < .5) labelscore.put("completion percent",0);
						else if (pasperc < .56) labelscore.put("completion percent",1);
						else if (pasperc < .61) labelscore.put("completion percent",2);
						else if (pasperc < .68) labelscore.put("completion percent",4);
						else if (pasperc < .74) labelscore.put("completion percent",8);
						else if (pasperc < .80) labelscore.put("completion percent",10);
						else if (pasperc >= .9) labelscore.put("completion percent",12);
					}
				}
				if (this.labelstat.containsKey(5)) {
					int pasyrds = (int) this.labelstat.get(5);
					if (pasyrds<50) labelscore.put("Pass Yards", 0);
					else if (pasyrds<200) labelscore.put("Pass Yards", 4);
					else if (pasyrds<275) labelscore.put("Pass Yards", 6);
					else if (pasyrds<300) labelscore.put("Pass Yards", 8);
					else if (pasyrds<325) labelscore.put("Pass Yards", 12);
					else if (pasyrds<350) labelscore.put("Pass Yards", 16);
					else if (pasyrds<400) labelscore.put("Pass Yards", 20);
					else if (pasyrds<450) labelscore.put("Pass Yards", 24);
					else if (pasyrds>=450) labelscore.put("Pass Yards", 30);
				}
				if (this.labelstat.containsKey(6)) {
					int pastd = (int) this.labelstat.get(6);
					labelscore.put("Pass TD", 6*pastd);
				}
				if (this.labelstat.containsKey(7)) {
					int inte = (int) this.labelstat.get(7);
					labelscore.put("interception", -3*inte);
				}
				if (this.labelstat.containsKey(13)) {
					int rushat = (int) this.labelstat.get(13);
					if (rushat <5) labelscore.put("rush attempts",1 );
					else if (rushat <11) labelscore.put("rush attempts",4 );
					else if (rushat <15) labelscore.put("rush attempts",6 );
					else if (rushat <20) labelscore.put("rush attempts",10 );
					else if (rushat >=20) labelscore.put("rush attempts",16);
				}
					
			}
			break;
		case RB:
			break;
		case TE:
			break;
		case WR:
			break;
		default:
			break;
		}
		//2pt
		//fumblelost
		//rushTD
		return (List) (Arrays.asList(labelscore));
	}

	@Override
	public double get_score(String stat) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String get_status() {
		return status;
	}

	public void add_stats() throws IOException {
		HashMap<String, Integer> labelstat = new HashMap<String, Integer>();
		/*
		 * labelstat.put("1",0); labelstat.put("2",0); labelstat.put("3",0);
		 * labelstat.put("4",0); labelstat.put("5",0); labelstat.put("6",0);
		 * labelstat.put("7","Int"); labelstat.put("8","Sacked");
		 * labelstat.put("13","Rush att"); labelstat.put("14","Rush Yards");
		 * labelstat.put("15","Rush TD"); labelstat.put("20","Reception");
		 * labelstat.put("21","Reception Yards"); labelstat.put("22","Reception TD");
		 * labelstat.put("31","Fumble"); labelstat.put("45","Sacks");
		 * labelstat.put("46","Interceptions"); labelstat.put("47","Fumble Recovery");
		 * labelstat.put("49","Safeties"); labelstat.put("50","D TD");
		 * labelstat.put("51","Blocked Kick"); labelstat.put("54","Points Allowed");
		 * labelstat.put("62","Yards Allowed");
		 */

		/*
		 * URL oracle = new URL(
		 * "https://football.fantasysports.yahoo.com/f1/686943/3"); BufferedReader in =
		 * new BufferedReader(new InputStreamReader(oracle.openStream())); String
		 * inputLine; inputLine = in.readLine(); String alone = ""; while ((inputLine =
		 * in.readLine()) != null) alone += inputLine; System.out.println(inputLine);
		 * 
		 * in.close(); //System.out.println("test"); //System.out.println(alone);
		 * 
		 * @SuppressWarnings("resource") Scanner sc = new
		 * Scanner(inputLine).useDelimiter("p name"); sc.findInLine(">"); MatchResult
		 * result =sc.match(); String[] play = new String[result.groupCount()]; for (int
		 * i = 0; i<=result.groupCount();i++) { System.out.println(result.group(i));
		 * play[i]=(result.group(i)); } // int i = sc.nextInt(); //
		 * System.out.println(i); sc.close(); }
		 * 
		 * }
		 */

		URL oracle = new URL(
				"http://api.fantasy.nfl.com/v1/players/stats?statType=weekStats&season=2017&week=6&dp=0&format=json");
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
		String inputLine;
		inputLine = in.readLine();
		// System.out.println(inputLine);
		in.close();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(inputLine).useDelimiter("name");
		sc.findInLine(playername);
		String statln;
		System.out.println(statln = sc.next());
		Scanner sc2 = new Scanner(statln);
		int firs;
		String cat;
		int val;
		firs = statln.indexOf("stats") + 9;
		while (statln.charAt(firs) != '"') {
			String mult = new StringBuilder().append(statln.charAt(firs)).toString();
			if (statln.charAt(firs + 1) != '"') {
				while (statln.charAt(firs + 1) != '"') {
					mult += statln.charAt(firs + 1);
					firs += 1;
				}
			}
			cat = mult; // HERE IS THE CATAGORY
			firs += 4;
			String mult2 = new StringBuilder().append(statln.charAt(firs)).toString();
			if (statln.charAt(firs + 1) != '"') {
				while (statln.charAt(firs + 1) != '"') {
					mult2 += statln.charAt(firs + 1);
					firs += 1;
				}
			}
			val = Integer.parseInt(mult2);
			firs += 4;
			labelstat.put(cat, val);

		}
		// statln = sc2.findInLine("stats");
		System.out.println(Arrays.asList(labelstat));
		// System.out.println(sc2.nextByte());
		// int i = sc.nextInt();
		// System.out.println(i);
		sc.close();

	}
}
