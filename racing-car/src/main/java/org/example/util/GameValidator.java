package org.example.util;

import java.util.Arrays;

// Game을 진행하는데 값의 검증을 도와주는 클래스
public class GameValidator {
    public Boolean validNameInput(String names) {
        // 입력 가능한 이름인지 확인
        return true;
    }
    
    public Boolean validTrialInput(String trial) {
        // 입력한 시도횟수가 숫자인지 검증
        return true;
    }
}
