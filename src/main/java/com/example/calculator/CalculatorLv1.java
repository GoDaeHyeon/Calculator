package com.example.calculator;

import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exitKeyword = "exit";    // 종료를 위한 키워드 설정
        String userInput;

        System.out.println("계산기를 시작합니다. 종료하려면 'exit'를 입력하세요.");

        while (true) {
            // 첫번째 숫자 입력 받기
            System.out.print("첫 번째 숫자를 이볅하세요.: ");
            userInput = sc.next();
            if (userInput.equals(exitKeyword)) {
                System.out.print("계산기를 종료합니다.");
                break;
            }
            double num2 = Double.parseDouble(userInput);

            // 연산자 입력받기
            System.out.print("연산자를 입력햐세요 (+, -, *, /): ");
            userInput
        }
    }
}
