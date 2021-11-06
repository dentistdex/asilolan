public class Challenge2 {

    public static void main(String[] args) {
        boolean gameOver = true;
            int score = 800;
            int levelCompleted = 5;
            int bonus = 100 ;

            if (gameOver) {

            int finalScore = score + (levelCompleted * bonus) ;
                    System.out.println("Your Fİnal Score is " + finalScore);}

            //           boolean newGameOver = true;

//            int newscore = 10000;
//            int newlevelCompleted = 8;
//            int newbonus = 200;

//            if (newGameOver) {

//                int finalscore = score + (levelCompleted * bonus);
//                System.out.println("Your Final Score 2 is " + finalscore);}

        score = 10000;
        levelCompleted = 8;
        bonus = 200 ;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus) ;
            System.out.println("Your Fİnal Score is " + finalScore);}
    }
}
