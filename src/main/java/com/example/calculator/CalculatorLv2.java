package com.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorLv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String exitKeyword = "exit";

        System.out.println("계산기를 시작합니다. 종료하려면 'exit'를 입력하세요.");

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            String input1 = scanner.next();
            if (input1.equals(exitKeyword)) {
                break;
            }
            double num1 = Double.parseDouble(input1);

            System.out.print("두 번째 숫자를 입력하세요: ");
            String input2 = scanner.next();
            if (input2.equals(exitKeyword)) {
                break;
            }
            double num2 = Double.parseDouble(input2);

            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            String operator = scanner.next();
            if (operator.equals(exitKeyword)) {
                break;
            }

            double result = calculator.calculate(num1, num2, operator);
            if (Double.isNaN(result)) {
                System.out.println("잘못된 연산입니다.");
            } else {
                System.out.println("결과: " + result);
            }

            System.out.println("계산 기록: " + calculator.getResults());
        }

        System.out.println("계산기를 종료합니다.");
        scanner.close();
    }
}

class Calculator {
    private final List<Double> results;

    public Calculator() {
        results = new ArrayList<>();
    }

    public double calculate(double num1, double num2, String operator) {
        double result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return Double.NaN;
                }
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다.");
                return Double.NaN;
        }
        results.add(result);
        return result;
    }

    public List<Double> getResults() {
        return new ArrayList<>(results);
    }

    public void clearResults() {
        if (!results.isEmpty()) {
            results.remove(0);
            System.out.println("가장 오래된 결과를 삭제했습니다.");
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
}