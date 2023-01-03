package Game;

import java.util.Random;

public class Answer {
    private int answerNumber;
    private final static Random random = new Random();
    Answer() {
        makeRandomNumber();
    }

    public int getAnswerNumber() {
        return answerNumber;
    }

    public void makeRandomNumber() {
        int randomUnites = random.nextInt(9);
        int randomTens, randomHundreds = 0;

        while(true) {
            randomTens = random.nextInt(9);
            if (randomTens != randomUnites) break;
        }
        while(true) {
            randomHundreds = random.nextInt(9);
            if ((randomHundreds!=randomUnites) && (randomHundreds!=randomTens)) break;
        }
        answerNumber = randomHundreds*100 + randomTens*10 + randomUnites;
    }

    public Boolean checkAnswer(int guess) {
        int units = answerNumber%10;
        int tens = (answerNumber/10)%10;
        int hundreds = answerNumber/100;

        // strike 수 세기
        Evaluate.countStrike(guess, hundreds, tens, units);
        Evaluate.countBall(guess, hundreds, tens, units);

        int strike = Evaluate.getStrike();
        int ball = Evaluate.getBall();

        if(strike==0 && ball==0) {
            System.out.print("낫싱\n");
            return false;
        }
        else if(strike < 3) {
            System.out.print(ball + "볼 " + strike + "스트라이크\n");
            return false;
        }
        else return true;
    }
}
