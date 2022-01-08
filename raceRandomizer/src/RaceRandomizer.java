import java.util.Random;

public class RaceRandomizer {

    public static void main(String[] args) {
        String[] races = {"sm", "csm", "eld", "orks", "ig", "tau", "necr", "sob", "de"};
        Random rand = new Random();
        int n = rand.nextInt(9);
        for (int i=0; i<9;i++){
            if(i == n){
                System.out.println("You race you have to play is : " +races[i]);
            }
        }
    }

}
