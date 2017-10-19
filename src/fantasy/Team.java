package fantasy;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;





public class Team implements Team_Interface{
	public String Team_name;
	public ArrayList roster;
	
	public Team(String name) {
		Team_name = name;
		roster = new ArrayList<Player>();
	}
	
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
		ArrayList roster_names = new ArrayList<String>();
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
		ArrayList roster = getroster();
		for (int i = 0; i < roster.size();i++) {
			try {
				( (Player) roster.get(i)).add_stats();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
