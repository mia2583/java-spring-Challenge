package org.example;

import org.example.domain.Car;
import org.example.util.GameUtill;

import java.util.*;
import java.util.stream.Collectors;

// Game 1회를 진행하는데 필요한 클래스
public class GamePlay {
    String[] names;
    Car[] cars;
    int trial;
    final GameUtill gameUtill = new GameUtill();

    public void input() {
        names = gameUtill.inputName().split(",");
        // 입력만큼 자동차 객체 생성
        cars = gameUtill.makeCars(names);
        trial = Integer.parseInt(gameUtill.inputTrial());
    }
    // 게임 진행하기
    void Racing() {
        // 각 자동차에 대해서 시도횟수만큼 반복하여 전진 횟수 계산
        // 이동 결과 출력하기
        for (int i=0; i<trial; i++) {
            for (Car car : cars) {
                if (gameUtill.moveForward()) {
                    car.addPosition();
                }
                car.printPosition();
            }
            System.out.println();
        }
    }

    // 결과 출력하기
    void printWinner() {
        // 우승자 출력
        final int maxPosition = Arrays.stream(cars).map(Car::getPosition).reduce(0, (a,b)->Math.max(a, b));
        System.out.println(
                Arrays.stream(cars).filter(c->c.getPosition()==maxPosition).map(Car::getName).collect(Collectors.joining(", "))
        );
    }
}
