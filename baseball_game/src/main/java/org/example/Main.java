package org.example;
import Game.BaseballGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean play = true;
        final Scanner scanner = new Scanner(System.in);
        while (play) {
            BaseballGame game = new BaseballGame();
            System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            if (scanner.nextInt() == 2) play = false;
        }
    }
}

