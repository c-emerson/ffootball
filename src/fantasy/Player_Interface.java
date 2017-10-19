package fantasy;

import java.awt.List;
import java.util.Arrays;
import java.util.HashMap;

public interface Player_Interface {
		public enum position{QB, RB, TE, WR, DEF
		}
		String get_name();
		position get_position();
		HashMap get_stats(); //all stats
		double get_stat(String stat); //particular stat 
		double get_score(String stat); //particular score
		double get_fscore(); //final score
		HashMap get_scores();//all scores
		
		
		
}
