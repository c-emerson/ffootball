package fantasy;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;





public class Team implements Team_Interface{
	public String Team_name;
	public ArrayList roster;
	
	public Team(String name) {
		Team_name = name;
		roster = new ArrayList<Player>();
	}
	
	@SuppressWarnings("unchecked")
	public boolean addplayer(Player playername) {
		this.roster.add(playername);
		return true;
	}

	@Override
	public String getPoints() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList getroster() {
		ArrayList roster_names = new ArrayList<Player>();
		for (int i = 0; i<roster.size();i++) {
			roster_names.add(((Player) roster.get(i)).get_name());
		}
		return roster_names;
	}

	@Override
	public ArrayList getstarters() {
		ArrayList roster_names = new ArrayList<String>();
		for (int i = 0; i<roster.size();i++) {
			if (((Player) roster.get(i)).get_status() == "Starter") {
			roster_names.add(((Player) roster.get(i)).get_name());
		}}
		return roster_names;
	}
	public void score() {
		for (int i = 0; i < roster.size();i++) {
			try {
				Player playern = ( (Player) roster.get(i));
				if(!playern.add_stats()) {
					continue;
				}
				HashMap score = playern.get_scores(playern);
				System.out.println(Arrays.asList(score));
				Iterator it = score.entrySet().iterator();
				int addscore = 0;
				while (it.hasNext()) {
					Map.Entry pair = (Map.Entry) it.next();
					addscore += (int) pair.getValue();
					it.remove(); // avoids a ConcurrentModificationException
				}
				System.out.println("    " + playern.get_name()+" FINAL SCORE " + addscore);
				System.out.println();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
