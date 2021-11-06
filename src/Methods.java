public class Methods {
    public static void main(String[] args) {

        boolean gameOver = true ;
        int score = 800 ;
        int levelCopmleted = 5 ;
        int bonus = 100 ;
        calculateScore(gameOver,score,levelCopmleted,bonus);

        score = 10000 ;
        levelCopmleted = 8 ;
        bonus = 200 ;
        calculateScore(gameOver,score,levelCopmleted,bonus);

        gameOver = false ;
        calculateScore(gameOver,score,levelCopmleted,bonus);
    }

    public static int calculateScore(boolean gameover,int score,int levelCompleted,int bonus ) {

        if (gameover) {
            int finalScore = score + (levelCompleted * bonus) ;
            finalScore += 2000;
            System.out.println("Your Score İs " + finalScore);
            return finalScore;}

        else {
            boolean gameOver = false ;
                System.out.println("GAME FAİLED !!!");
            return -1 ;

        }

    }


}
