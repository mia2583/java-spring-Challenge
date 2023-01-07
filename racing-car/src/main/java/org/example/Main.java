package org.example;

public class Main {
    public static void main(String[] args) {
        GamePlay game = new GamePlay();
        // 입력받기(이름, 횟수)
        game.input();
        // 게임 진행
        game.Racing();
        // 출력하기
        game.printWinner();
    }
}