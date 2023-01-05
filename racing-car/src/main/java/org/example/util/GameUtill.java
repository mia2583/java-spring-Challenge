package org.example.util;

import java.util.Scanner;

// Game을 진행하는데 필요한 기능들을 하는 클래스
public class GameUtill {
    final Scanner scanner = new Scanner(System.in);
    final GameValidator validator = new GameValidator();

    public void inputName() {
        // 문구 출력
        System.out.println("경주할 자동차 이름을 입력하세요.(이름을 쉼표(,) 기준으로 구분)");
        try {
            validator.validNameInput(scanner.next());
        } catch (IllegalArgumentException e) {
            inputName();
        }
    }

    // 시도할 횟수 입력받기
    public void inputTrial() {
        // 문구 출력
        System.out.println("시도할 회수는 몇회인가요?");
        try {
            // validator의 함수로 valid 판단
            validator.validTrialInput(scanner.next());
        } catch (NumberFormatException e) {
            inputTrial();
        }
    }

    int getRandomNumber() {
        // 0-9사이의 랜덤 값 출력
        return 0;
    }
    
    Boolean MoveForward() {
        // getRandomNumber에서 값이 4이상이면 전진(true)
        return true;
    }

    void printRacing() {
        // 현재까지의 이동 결과 출력
    }
}
