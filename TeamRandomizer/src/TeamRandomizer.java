import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TeamRandomizer {
    public static void main(String[] args) {
        OpenedGame threeversusthree = new OpenedGame(6);
        List<String> players = threeversusthree.getPlayerSet();
        int playerSize = players.size();

        Random rand = new Random(players.size());

        List<String> team1 = new ArrayList<String>();
        List<String> team2 = new ArrayList<String>();

        Collections.shuffle(players);


        for (int i=0; i<playerSize/2; i++){
            team1.add(players.get(i));
        }

        for (int n =playerSize/2; n<playerSize; n++){
            team2.add(players.get(n));
        }

        System.out.println(team1+" VERSUS "+team2);

    }
}
