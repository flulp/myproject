package com.company;
import java.util.Scanner;

public class Calculator {

        static Scanner scanner = new Scanner(System.in);

        public static void main (String[]args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }

        public static int getInt () {
        System.out.print("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка ввода числа.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

        public static char getOperation () {
        System.out.println("Введите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычетание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Выход");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка ввода операции.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

        public static int calc ( int num1, int num2, char operation){
                int result = 0;
                switch (operation) {
                    case '1':
                        result = num1 + num2;
                        break;
                    case '2':
                        result = num1 - num2;
                        break;
                    case '3':
                        result = num1 * num2;
                        break;
                    case '4':
                        result = num1 / num2;
                        break;
                    case '5':
                        break;
                    default:
                        System.out.println("Операция не распознана.");
                        result = calc(num1, num2, getOperation());
                }
                return result;

    }
    }


