package com.example.calculator;

import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // sc라는 이름의 Scanner객체를 생성합니다. System.in 은 사용자로부터 입력을 받는 장치입니다.
        String exitKeyword = "exit";    // 종료를 위한 키워드 설정
        String userInput;   // 사용자가 입력한 값을 저장할 변수 UserInput을 선언합니다.

        System.out.println("계산기를 시작합니다. 종료하려면 'exit'를 입력하세요.");

        while (true) {
            // 첫 번째 숫자 입력 받기
            System.out.print("첫 번째 숫자를 입력하세요.: ");
            userInput = sc.next();  // 사용자 입력받기
            if (userInput.equals(exitKeyword)) {
                System.out.print("계산기를 종료합니다.");
                break;
            }
            double num1 = Double.parseDouble(userInput);    // 사용자가 입력한 문자열을 실수형 숫자(double)로 변환하고 num1 변수에 저장합니다.

            // 두 번째 숫자 입력 받기
            System.out.print("두 번째 숫자를 입력하세요.: ");
            userInput = sc.next();
            if (userInput.equals(exitKeyword)) {
                System.out.print("계산기를 종료합니다.");
                break;
            }
            double num2 = Double.parseDouble(userInput);    // 사용자가 입력한 문자열을

            // 연산자 입력받기
            System.out.print("연산자를 입력햐세요 (+, -, *, /): ");
            userInput = sc.next();
            if (userInput.equals(exitKeyword)) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
            char operator = userInput.charAt(0);

            // 연산 수행
            double result = 0;
            boolean isValid = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("나눗셈에서 분모는 0이 될 수 없습니다.");
                        isValid = false;
                    }
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
                    isValid = false;
                    break;
            }

            // 결과 출력
            if (isValid) {
                System.out.println("결과: " + result);
            }

            // 추가 계산 여부 확인
            System.out.println("더 계산하시겠습니까? (계속하려면 아무 키나 입력 후 enter, 종료하려면 'exit' 입력): ");
            userInput = sc.next();
            if(userInput.equals(exitKeyword)) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
        sc.close();
    }
}
