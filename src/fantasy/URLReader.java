package fantasy;

import java.net.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.io.*;

public class URLReader {
	public static void main(String[] args) throws Exception {

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
				"http://api.fantasy.nfl.com/v1/players/stats?statType=weekStats&week=6&season=2017&dp=0&format=json");
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
		String inputLine;
		inputLine = in.readLine();
		// System.out.println(inputLine);
		in.close();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(inputLine).useDelimiter("name");
		sc.findInLine("Cam Newton");
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
			} val = Integer.parseInt(mult2);
			firs += 4;
			System.out.println(cat);
			System.out.println(val);
		}
		// statln = sc2.findInLine("stats");

		// System.out.println(sc2.nextByte());
		// int i = sc.nextInt();
		// System.out.println(i);
		sc.close();

	}
}
