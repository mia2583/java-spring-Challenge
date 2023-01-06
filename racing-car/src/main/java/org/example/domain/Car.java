package org.example.domain;
// 자동차 클래스
// 기본 생성자 추가 불가능
// name, position은 private으로 설정
// 가능하면 setPosition(int position) 메소드 추가x
public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }

    public int getPosition() { return this.position; }

    public void addPosition() { this.position++; }

    public void printPosition() {
        System.out.println(getName() + " : " + "-".repeat(getPosition()));
    }
}
