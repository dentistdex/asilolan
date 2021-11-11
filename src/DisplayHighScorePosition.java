public class DisplayHighScorePosition {

    public static void main(String[] args) {

        int highScorePosition = sıra(1500);
            sonuclar("Mehmet" , highScorePosition);

       highScorePosition = sıra(900);
            sonuclar("Veli", highScorePosition);

        highScorePosition = sıra(400);
        sonuclar("Semih", highScorePosition);

        highScorePosition = sıra(50);
        sonuclar("Hasan", highScorePosition);

    }
    public static void sonuclar(String playerName, int highScorePosition ){
        System.out.println(playerName + " managed to get into " + highScorePosition + " on the score table");

    }

    public static int sıra (int playerScore) {

        int highScorePosition = 4;

        if (playerScore > 1000) {
            highScorePosition = 1;
        }
        else if (playerScore > 500) {
            highScorePosition = 2;
        }
        else if (playerScore > 100 ) {
            highScorePosition = 3;
        }
        return highScorePosition ;


    }


}
