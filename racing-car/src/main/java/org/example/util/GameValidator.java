package org.example.util;

import java.util.Arrays;

// Game을 진행하는데 값의 검증을 도와주는 클래스
public class GameValidator {

    public GameValidator() {};
    public void validNameInput(String names) {
        // 입력 가능한 이름인지 확인
        if (Arrays.stream(names.split(",")).filter(s -> s.length() > 5).count() > 0) {
            throw new IllegalArgumentException("[ERROR] 자동차의 각 이름은 5글자 이하여야 합니다.");
        }
    }
    
    public void validTrialInput(String trial) {
        // 입력한 시도횟수가 숫자인지 검증
        Integer.parseInt(trial);
    }
}
