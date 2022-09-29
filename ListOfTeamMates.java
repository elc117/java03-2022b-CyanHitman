import java.util.ArrayList;

public class ListOfTeamMates {
  public static void main(String[] args) {
    ArrayList<TeamMate> user = new ArrayList<TeamMate>();
    user.add(new TeamMate("l1", "andre", false));
    user.add(new TeamMate("l9", "fabiana", true)); 
    user.add(new TeamMate("l17", "quiana", true));
    user.add(new TeamMate("l30", "sandro", true));
    user.add(new TeamMate("l6", "philip"));

    for(int i = 0; i < user.size(); i++){
        user.get(i).printTeamMate();
    }
    for(int i = 0; i < user.size(); i++){
        user.get(i).printTeamMate(user.get(i).getOnline);
    }
  }
}
