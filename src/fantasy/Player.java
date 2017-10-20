package fantasy;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Player implements Player_Interface {

	public String playername;
	public position player_position;
	public String status;
	public HashMap labelmap;
	public HashMap<Integer, Integer> labelstat;

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

	public HashMap get_scores(Player player) {
		HashMap<String, Integer> labelscore = new HashMap<String, Integer>();
		
		switch (player.get_position()) {
		case DEF:
			if (labelstat.containsKey(1)) {
				if (labelstat.containsKey(54)) {
					int pointsag = (int) this.labelstat.get(54);
					if (pointsag < 7)
						labelscore.put("points against", 24);
					else if (pointsag < 14)
						labelscore.put("points against", 20);
					else if (pointsag < 18)
						labelscore.put("points against", 16);
					else if (pointsag < 22)
						labelscore.put("points against", 12);
					else if (pointsag < 27)
						labelscore.put("points against", 8);
					else if (pointsag < 31)
						labelscore.put("points against", 4);
					else if (pointsag < 40)
						labelscore.put("points against", 2);
					else if (pointsag >= 40)
						labelscore.put("points against", 0);
				}
				if (labelstat.containsKey(62)) {
					int yards = (int) this.labelstat.get(62);
					if (yards < 151)
						labelscore.put("Yards Allowed", 30);
					else if (yards < 200)
						labelscore.put("Yards Allowed", 20);
					else if (yards < 250)
						labelscore.put("Yards Allowed", 16);
					else if (yards < 300)
						labelscore.put("Yards Allowed", 12);
					else if (yards < 350)
						labelscore.put("Yards Allowed", 8);
					else if (yards < 401)
						labelscore.put("Yards Allowed", 4);
					else if (yards < 451)
						labelscore.put("Yards Allowed", 2);
					else if (yards >= 451)
						labelscore.put("Yards Allowed", 0);
					String yardsper = "YARDS PER PLAY NOT AVAIL. Yards Allowed:" + yards;
					labelscore.put(yardsper, 0);
				}
				int sacks = 0;
				int interceptions = 0;
				int fumbles = 0;
				if (labelstat.containsKey(45)) {
					sacks = (int) this.labelstat.get(45);
				}
				if (labelstat.containsKey(46)) {
					fumbles = (int) this.labelstat.get(46);
				}
				if (labelstat.containsKey(47)) {
					interceptions = (int) this.labelstat.get(47);
				}
				sacks += interceptions + fumbles;
				if (sacks <1) labelscore.put("Sacks Ints Fumbrec", 0);
				else if (sacks <3) labelscore.put("Sacks Ints Fumbrec", 3);
				else if (sacks <5) labelscore.put("Sacks Ints Fumbrec", 6);
				else if (sacks <7) labelscore.put("Sacks Ints Fumbrec", 10);
				else if (sacks <9) labelscore.put("Sacks Ints Fumbrec", 16);
				else if (sacks <11) labelscore.put("Sacks Ints Fumbrec", 20);
				else if (sacks >=11) labelscore.put("Sacks Ints Fumbrec", 24);
				int DTD = 0;
				if (labelstat.containsKey(50)) {
					DTD = (int) this.labelstat.get(50);
				}
				if (labelstat.containsKey(53)) {
					DTD += (int) this.labelstat.get(53);
				}
				if (DTD!=0) {
					labelscore.put("Defensive Touchdown", 6*DTD);
				}
				if (labelstat.containsKey(49)) {
					labelscore.put("Defensive Touchdown", labelstat.get(49)*3);
				}
				if (labelstat.containsKey(51)) {
					labelscore.put("Defensive Touchdown", labelstat.get(51)*3);
				}
			}
			break;
		case QB:
			if (labelstat.containsKey(1)) {
				if (labelstat.containsKey(3)) {
					int pascomp = (int) this.labelstat.get(3);
					if (pascomp < 5) {
						labelscore.put("completions", 0);
					} else if (pascomp < 12) {
						labelscore.put("completions", 2);
					} else if (pascomp < 15) {
						labelscore.put("completions", 4);
					} else if (pascomp < 21) {
						labelscore.put("completions", 6);
					} else if (pascomp < 24) {
						labelscore.put("completions", 8);
					} else if (pascomp < 28) {
						labelscore.put("completions", 12);
					} else if (pascomp < 31) {
						labelscore.put("completions", 16);
					} else if (pascomp < 36) {
						labelscore.put("completions", 20);
					} else if (pascomp > 35) {
						labelscore.put("completions", 24);
					}
					// labelscore.put("total",
					// labelscore.get("total")+labelscore.get("completions"));
				}
				if (this.labelstat.containsKey(3) && this.labelstat.containsKey(2)) {
					int pascomp = (int) this.labelstat.get(3);
					double pasperc = ((pascomp) / ((double) this.labelstat.get(2)));
					if (pascomp < 6)
						labelscore.put("completion percent", 0);
					else if (pascomp > 14) {
						if (pasperc < .5)
							labelscore.put("completion percent", 0);
						else if (pasperc < .56)
							labelscore.put("completion percent", 2);
						else if (pasperc < .62)
							labelscore.put("completion percent", 4);
						else if (pasperc < .68)
							labelscore.put("completion percent", 8);
						else if (pasperc < .74)
							labelscore.put("completion percent", 16);
						else if (pasperc < .80)
							labelscore.put("completion percent", 20);
						else if (pasperc >= .9)
							labelscore.put("completion percent", 24);
					} else if (pascomp > 6) {
						if (pasperc < .5)
							labelscore.put("completion percent", 0);
						else if (pasperc < .56)
							labelscore.put("completion percent", 1);
						else if (pasperc < .61)
							labelscore.put("completion percent", 2);
						else if (pasperc < .68)
							labelscore.put("completion percent", 4);
						else if (pasperc < .74)
							labelscore.put("completion percent", 8);
						else if (pasperc < .80)
							labelscore.put("completion percent", 10);
						else if (pasperc >= .9)
							labelscore.put("completion percent", 12);
					}
				}
				if (this.labelstat.containsKey(5)) {
					int pasyrds = (int) this.labelstat.get(5);
					if (pasyrds < 50)
						labelscore.put("Pass Yards", 0);
					else if (pasyrds < 200)
						labelscore.put("Pass Yards", 4);
					else if (pasyrds < 275)
						labelscore.put("Pass Yards", 6);
					else if (pasyrds < 300)
						labelscore.put("Pass Yards", 8);
					else if (pasyrds < 325)
						labelscore.put("Pass Yards", 12);
					else if (pasyrds < 350)
						labelscore.put("Pass Yards", 16);
					else if (pasyrds < 400)
						labelscore.put("Pass Yards", 20);
					else if (pasyrds < 450)
						labelscore.put("Pass Yards", 24);
					else if (pasyrds >= 450)
						labelscore.put("Pass Yards", 30);
				}
				if (this.labelstat.containsKey(6)) {
					int pastd = (int) this.labelstat.get(6);
					labelscore.put("Pass TD", 5 * pastd);
				}
				if (this.labelstat.containsKey(7)) {
					int inte = (int) this.labelstat.get(7);
					labelscore.put("interception", -3 * inte);
				}
				if (this.labelstat.containsKey(13)) {
					int rushat = (int) this.labelstat.get(13);
					if (rushat < 5)
						labelscore.put("rush attempts", 1);
					else if (rushat < 11)
						labelscore.put("rush attempts", 4);
					else if (rushat < 15)
						labelscore.put("rush attempts", 6);
					else if (rushat < 20)
						labelscore.put("rush attempts", 10);
					else if (rushat >= 20)
						labelscore.put("rush attempts", 16);
				}
				if (this.labelstat.containsKey(14)) {
					int rushyds = (int) this.labelstat.get(14);
					if (rushyds < 5)
						labelscore.put("rush yards", 0);
					else if (rushyds < 20)
						labelscore.put("rush yards", 2);
					else if (rushyds < 50)
						labelscore.put("rush yards", 4);
					else if (rushyds < 75)
						labelscore.put("rush yards", 6);
					else if (rushyds < 100)
						labelscore.put("rush yards", 10);
					else if (rushyds >= 100)
						labelscore.put("rush yards", 16);
				}
				if (this.labelstat.containsKey(14) && this.labelstat.containsKey(13)) {
					double rushat = (double) this.labelstat.get(13);
					double rushavg = (double) this.labelstat.get(14) / rushat;
					if (rushat < 5)
						labelscore.put("rush average bonus", 0);
					else if (rushavg < 4)
						labelscore.put("rush average bonus", 0);
					else if (rushavg < 7)
						labelscore.put("rush average bonus", 2);
					else if (rushavg < 10)
						labelscore.put("rush average bonus", 4);
					else if (rushavg >= 10)
						labelscore.put("rush average bonus", 8);
				}
			}
			break;
		case RB:
			if (labelstat.containsKey(1)) {
				if (this.labelstat.containsKey(13)) {
					int rushat = (int) this.labelstat.get(13);
					if (rushat < 2)
						labelscore.put("rush attempts", 0);
					else if (rushat < 8)
						labelscore.put("rush attempts", 2);
					else if (rushat < 13)
						labelscore.put("rush attempts", 8);
					else if (rushat < 18)
						labelscore.put("rush attempts", 12);
					else if (rushat < 23)
						labelscore.put("rush attempts", 16);
					else if (rushat < 28)
						labelscore.put("rush attempts", 20);
					else if (rushat < 33)
						labelscore.put("rush attempts", 24);
					else if (rushat >= 33)
						labelscore.put("rush attempts", 30);
				}
				if (this.labelstat.containsKey(14)) {
					int rushyds = (int) this.labelstat.get(14);
					if (rushyds < 15)
						labelscore.put("rush yards", 0);
					else if (rushyds < 40)
						labelscore.put("rush yards", 2);
					else if (rushyds < 75)
						labelscore.put("rush yards", 4);
					else if (rushyds < 100)
						labelscore.put("rush yards", 8);
					else if (rushyds < 125)
						labelscore.put("rush yards", 12);
					else if (rushyds < 150)
						labelscore.put("rush yards", 16);
					else if (rushyds < 175)
						labelscore.put("rush yards", 20);
					else if (rushyds < 200)
						labelscore.put("rush yards", 24);
					else if (rushyds >= 200)
						labelscore.put("rush yards", 30);
				}
				if (this.labelstat.containsKey(14) && this.labelstat.containsKey(13)) {
					double rushat = (double) this.labelstat.get(13);
					double rushavg = (double) this.labelstat.get(14) / rushat;
					double rushapt = 0;
					if (rushavg < 2.75)
						rushapt = 0;
					else if (rushavg < 4)
						rushapt = 2;
					else if (rushavg < 4.5)
						rushapt = 4;
					else if (rushavg < 5.0)
						rushapt = 6;
					else if (rushavg < 5.5)
						rushapt = 8;
					else if (rushavg < 6.0)
						rushapt = 12;
					else if (rushavg < 7.0)
						rushapt = 16;
					else if (rushavg >= 7.0)
						rushapt = 20;
					if (rushat < 5)
						rushapt = rushapt / 3;
					else if (rushat < 8)
						rushapt = rushapt / 2;
					labelscore.put("rush average bonus", (int) (rushapt + .5)); // THIS IS SET AT INTEGER AND PROBABLY
																				// SHOULDNT BE
				}
				if (this.labelstat.containsKey(20)) {
					int recept = (int) this.labelstat.get(20);
					if (recept < 4)
						labelscore.put("receptions", 4);
					else if (recept < 6)
						labelscore.put("receptions", 6);
					else if (recept < 8)
						labelscore.put("receptions", 8);
					else if (recept < 10)
						labelscore.put("receptions", 12);
					else if (recept < 12)
						labelscore.put("receptions", 16);
					else if (recept < 15)
						labelscore.put("receptions", 20);
					else if (recept >= 15)
						labelscore.put("receptions", 24);
				}
				if (this.labelstat.containsKey(21)) {
					int recepyd = (int) this.labelstat.get(21);
					if (recepyd < 7)
						labelscore.put("reception yards", 0);
					else if (recepyd < 20)
						labelscore.put("reception yards", 2);
					else if (recepyd < 40)
						labelscore.put("reception yards", 4);
					else if (recepyd < 60)
						labelscore.put("reception yards", 6);
					else if (recepyd < 80)
						labelscore.put("reception yards", 10);
					else if (recepyd < 100)
						labelscore.put("reception yards", 16);
					else if (recepyd < 150)
						labelscore.put("reception yards", 20);
					else if (recepyd >= 150)
						labelscore.put("reception yards", 24);
				}
				if (this.labelstat.containsKey(20) && this.labelstat.containsKey(21)) {
					int recept = (int) this.labelstat.get(20);
					int recepyd = (int) this.labelstat.get(21);
					double recavg = recepyd / recept;
					if (recept < 3)
						labelscore.put("reception average", 0);
					else if (recavg < 4)
						labelscore.put("reception average", 0);
					else if (recavg < 7)
						labelscore.put("reception average", 2);
					else if (recavg < 10)
						labelscore.put("reception average", 4);
					else if (recavg < 12)
						labelscore.put("reception average", 6);
					else if (recavg < 15)
						labelscore.put("reception average", 8);
					else if (recavg < 20)
						labelscore.put("reception average", 12);
					else if (recavg >= 20)
						labelscore.put("reception average", 16);
				}
			}
			break;
		case TE:
			if (labelstat.containsKey(1)) {
				if (this.labelstat.containsKey(20)) {
					int recept = (int) this.labelstat.get(20);
					if (this.labelstat.containsKey(13)) {
						int rushat = (int) this.labelstat.get(13);
						recept += rushat / 2; // rect + 1/2 runs
					}

					if (recept < 3)
						labelscore.put("receptions", 2);
					else if (recept < 5)
						labelscore.put("receptions", 6);
					else if (recept < 8)
						labelscore.put("receptions", 10);
					else if (recept < 11)
						labelscore.put("receptions", 14);
					else if (recept < 14)
						labelscore.put("receptions", 16);
					else if (recept < 17)
						labelscore.put("receptions", 20);
					else if (recept >= 17)
						labelscore.put("receptions", 24);
				}
				if (this.labelstat.containsKey(21)) {
					int recepyd = (int) this.labelstat.get(21);
					if (this.labelstat.containsKey(14)) {
						recepyd += (int) this.labelstat.get(14);
					} // total yards
					if (recepyd < 10)
						labelscore.put("reception yards", 0);
					else if (recepyd < 40)
						labelscore.put("reception yards", 2);
					else if (recepyd < 70)
						labelscore.put("reception yards", 6);
					else if (recepyd < 90)
						labelscore.put("reception yards", 10);
					else if (recepyd < 110)
						labelscore.put("reception yards", 14);
					else if (recepyd < 120)
						labelscore.put("reception yards", 16);
					else if (recepyd < 150)
						labelscore.put("reception yards", 20);
					else if (recepyd >= 150)
						labelscore.put("reception yards", 24);
				}
				if (this.labelstat.containsKey(20) && this.labelstat.containsKey(21)) {
					int recept = (int) this.labelstat.get(20);
					if (this.labelstat.containsKey(13)) {
						int rushat = (int) this.labelstat.get(13);
						recept += rushat / 2; // rect + 1/2 runs
					}
					int recepyd = (int) this.labelstat.get(21);
					if (this.labelstat.containsKey(14)) {
						recepyd += (int) this.labelstat.get(14);
					} // total yards
					double recavg = recepyd / recept;
					int rec_avg_point = 0;
					if (recavg < 6)
						rec_avg_point = 0;
					else if (recavg < 9)
						rec_avg_point = 4;
					else if (recavg < 12)
						rec_avg_point = 10;
					else if (recavg < 15)
						rec_avg_point = 14;
					else if (recavg < 18)
						rec_avg_point = 16;
					else if (recavg < 21)
						rec_avg_point = 20;
					else if (recavg >= 21)
						rec_avg_point = 30;
					if (recept < 4)
						rec_avg_point = rec_avg_point / 2;
					labelscore.put("reception average", rec_avg_point);
				}
			}
			break;
		case WR:
			if (labelstat.containsKey(1)) {
				if (this.labelstat.containsKey(20)) {
					int recept = (int) this.labelstat.get(20);
					if (this.labelstat.containsKey(13)) {
						int rushat = (int) this.labelstat.get(13);
						recept += rushat / 2; // rect + 1/2 runs
					}

					if (recept < 3)
						labelscore.put("receptions", 2);
					else if (recept < 5)
						labelscore.put("receptions", 6);
					else if (recept < 8)
						labelscore.put("receptions", 10);
					else if (recept < 11)
						labelscore.put("receptions", 14);
					else if (recept < 14)
						labelscore.put("receptions", 16);
					else if (recept < 17)
						labelscore.put("receptions", 20);
					else if (recept >= 17)
						labelscore.put("receptions", 24);
				}
				if (this.labelstat.containsKey(21)) {
					int recepyd = (int) this.labelstat.get(21);
					if (this.labelstat.containsKey(14)) {
						recepyd += (int) this.labelstat.get(14);
					} // total yards
					if (recepyd < 10)
						labelscore.put("reception yards", 0);
					else if (recepyd < 35)
						labelscore.put("reception yards", 2);
					else if (recepyd < 50)
						labelscore.put("reception yards", 6);
					else if (recepyd < 75)
						labelscore.put("reception yards", 10);
					else if (recepyd < 100)
						labelscore.put("reception yards", 14);
					else if (recepyd < 125)
						labelscore.put("reception yards", 16);
					else if (recepyd < 150)
						labelscore.put("reception yards", 20);
					else if (recepyd < 175)
						labelscore.put("reception yards", 24);
					else if (recepyd >= 175)
						labelscore.put("reception yards", 30);
				}
				if (this.labelstat.containsKey(20) && this.labelstat.containsKey(21)) {
					int recept = (int) this.labelstat.get(20);
					if (this.labelstat.containsKey(13)) {
						int rushat = (int) this.labelstat.get(13);
						recept += rushat / 2; // rect + 1/2 runs
					}
					int recepyd = (int) this.labelstat.get(21);
					if (this.labelstat.containsKey(14)) {
						recepyd += (int) this.labelstat.get(14);
					} // total yards
					double recavg = recepyd / recept;
					int rec_avg_point = 0;
					if (recavg < 8)
						rec_avg_point = 0;
					else if (recavg < 11)
						rec_avg_point = 4;
					else if (recavg < 14)
						rec_avg_point = 8;
					else if (recavg < 17)
						rec_avg_point = 10;
					else if (recavg < 20)
						rec_avg_point = 12;
					else if (recavg < 23)
						rec_avg_point = 16;
					else if (recavg < 25)
						rec_avg_point = 20;
					else if (recavg >= 25)
						rec_avg_point = 24;
					if (recept < 4)
						rec_avg_point = rec_avg_point / 2;
					labelscore.put("reception average", rec_avg_point);
				}
			}
			break;
		default:
			break;
		}
		if (labelstat.containsKey(1)) {
			if (labelstat.containsKey(32)) {
				int t_pt = (int) this.labelstat.get(32);
				labelscore.put("2 point conversion", t_pt * 3);
			}
			if (labelstat.containsKey(30)) {
				int fumblelost = (int) this.labelstat.get(30);
				labelscore.put("fumble lost", fumblelost * -3);
			}
			if (labelstat.containsKey(15)) {
				int RushTD = (int) this.labelstat.get(15);
				labelscore.put("rushing TD", RushTD * 6);
			}
			if (labelstat.containsKey(22)) {
				int recievingTD = (int) this.labelstat.get(22);
				labelscore.put("Recieving TD", recievingTD * 6);
			}
		}

		return (HashMap) labelscore;
	}

	@Override
	public double get_score(String stat) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String get_status() {
		return status;
	}

	public boolean add_stats() throws IOException {
		HashMap<Integer, Integer> labelstat = new HashMap<Integer, Integer>();
		

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
		if (sc.findInLine(playername)==null) {
			//int space;
			//if ((space = playername.indexOf(" "))>0) {
			//	if((space = playername.indexOf(" ", space))>0) {
			//		String playernamet = playername.substring(0,space);
			//		if (sc.findInLine(playernamet)==null) {}}}
			System.out.println("____ERROR: Could not find " + playername + "!");
			return false;
		}
		String statln;
		statln=sc.next();
		if (playername.equals("Michael Thomas")) {//SHOULD JUST COMPARE POSITIONS
			statln=sc.next();
		}
		//System.out.println(statln = sc.next());
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
			int cattt = Integer.parseInt(cat);
			labelstat.put(cattt, val);

		}
		//System.out.println(Arrays.asList(labelstat)); //THIS SHOWS STATS
		this.labelstat = labelstat;
		sc.close();
		return true;

	}

	
}
