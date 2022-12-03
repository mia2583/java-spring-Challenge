package Game;

public class Evaluate {
    private int inputNumber;
    private static int strike;
    private static int ball;

    public Evaluate(int guess, int answer) {

    }

    public static int getStrike() {
        return strike;
    }
    public static int getBall() {
        return ball;
    }

    public static void countStrike(int guess, int hundreds, int tens, int units) {
        int strikeN = 0;
        if(guess%10 == units) strikeN++;
        if((guess/10)%10 == tens) strikeN++;
        if(guess/100 == hundreds) strikeN++;
        strike = strikeN;
    }

    public static void countBall(int guess, int hundreds, int tens, int units) {
        int ballN = 0;
        if((guess%10==hundreds) || (guess%10==tens)) ballN++;
        if(((guess/10)%10==hundreds) || ((guess/10)%10==units)) ballN++;
        if((guess/100==tens) || (guess/100==units)) ballN++;
        ball = ballN;
    }

}


