package Game;

public class BaseballGame {
    private Answer answer = new Answer();
    private Boolean correct = false;
    private Input input = new Input();

    public BaseballGame() {
        while(!correct) {
            System.out.print("enter number : ");
            input.getInput();
            correct = answer.checkAnswer(input.getInputNumber());
        }
        System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n");
    }

}
