import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpenedGame {
    public int playernumbers;
    public List<String> playerSet;
    public OpenedGame(int playernumbers){
        this.playernumbers = playernumbers;
        playerSet = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        if(playernumbers == 1 || playernumbers ==2){
            return;
        }
        else if(playernumbers%2 >0){
            System.out.println("There are only 2v2, 3v3 or 4v4 games. Please put the right amount of players");
        }
        else if (playernumbers > 8){
            System.out.println("Is too much players");
        }
        else {
            while(playernumbers>0){
                System.out.println("Please enter the player's name");
                String player = sc.nextLine();
                playerSet.add(player);
                playernumbers--;
            }
        }

    }

    public List<String> getPlayerSet(){
        return playerSet;
    }
}
