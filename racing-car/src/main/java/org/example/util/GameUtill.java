package org.example.util;

import org.example.domain.Car;

import java.util.Scanner;

// Game을 진행하는데 필요한 기능들을 하는 클래스
public class GameUtill {
    final Scanner scanner = new Scanner(System.in);
    final GameValidator validator = new GameValidator();

    public String inputName() {
        // 문구 출력
        System.out.println("경주할 자동차 이름을 입력하세요.(이름을 쉼표(,) 기준으로 구분)");
        String input = scanner.next();
        try {
            validator.validNameInput(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            input = inputName();
        }
        return input;
    }

    // 시도할 횟수 입력받기
    public String inputTrial() {
        // 문구 출력
        String trial = "";
        System.out.println("시도할 회수는 몇회인가요?");
        try {
            // validator의 함수로 valid 판단
            trial = scanner.next();
            validator.validTrialInput(trial);
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
            trial = inputTrial();
        }
        return trial;
    }

    // 입력받은 이름으로 자동차 객체 생성하기
    public Car[] makeCars(String[] names) {
        Car[] cars = new Car[names.length];
        for(int i=0; i<names.length; i++) {
            cars[i] = new Car(names[i]);
        }
        return cars;
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
