package org.example;

import org.example.util.GameUtill;
import org.example.util.GameValidator;

import java.util.InputMismatchException;
import java.util.Scanner;

// Game 1회를 진행하는데 필요한 클래스
public class GamePlay {
    GameUtill gameUtill = new GameUtill();

    public void input() {
        gameUtill.inputName();
        gameUtill.inputTrial();
    }
    // 게임 진행하기
    void Racing() {
        // 각 자동차에 대해서 시도횟수만큼 반복하여 전진 횟수 계산
        // 이동 결과 출력하기

    }

    // 결과 출력하기
    void printWinner() {
        // 우승자 출력
    }
}
