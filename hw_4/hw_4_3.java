// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример
// 1// +// 2// ответ
// 3// +// 4// ответ:
// 7// +// 2// ответ:
// 9// 1// Ответ 8
// Отмена -> 9
// Отмена -> 7
// Отмена -> 3
// +// 2// Ответ 5

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class hw_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        Deque<Double> calcList = new LinkedList<>();
        boolean firstInput = true;
        boolean calc = true;
        double firstNumber = 0.0;
        String operation;

        while (calc) {
            if (firstInput) {
                firstNumber = inputNumber(sc);
                firstInput = false;
            }
            operation = inputOperation(sc);
            if (operation.equals("отмена")) {
                if (!calcList.isEmpty()) {
                    resetOperation(calcList);
                    firstNumber = calcList.getLast();
                } else {
                    System.out.println("Нет результата! Введите ещё раз");
                    firstNumber = inputNumber(sc);
                }
                operation = inputOperation(sc);
            }
            if (operation.equals("выход")){
                break;
            }
            double nextNumber = inputNumber(sc);
            double result = calculation(firstNumber, nextNumber, operation);
            firstNumber = result;
            addElement(calcList, result);
            System.out.println("Итого = " + result);
        }
    }

    public static double inputNumber(Scanner scanner) {
        System.out.println("Введите число");
        double number = 0.0;
        try {
            number = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Введите число!!!");
            scanner.nextLine();
            inputNumber(scanner);
        }
        return number;
    }

    public static String inputOperation(Scanner scanner) {
        System.out.println("Введите оператор действия (+, -, *, /),'Отмена' или 'Выход'");
        String operator = scanner.next().toLowerCase();
        if ((!operator.equals("+")) & (!operator.equals("-")) & (!operator.equals("*")) & (!operator
                    .equals("/")) & (!operator.equals("отмена"))& (!operator.equals("выход"))) {
                System.out.println("Неправильная операция!!! Введите заново");
                operator = inputOperation(scanner);
                scanner.nextLine();
        }
        return operator;
    }

    public static void resetOperation(Deque<Double> list) {
        if (!list.isEmpty()) {
            list.removeLast();
            System.out.println("Операция отменена");
            if (list.isEmpty()) {
                list.addLast(0.0);
            }
            System.out.println("Работаем с результатом " + list.getLast());
        }
    }

    public static double calculation(double num1, double num2, String operator) {
        double result = 0.0;
        switch (operator.toLowerCase()) {
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
                result = num1 / num2;
                break;
        }
        return result;
    }

    public static void addElement(Deque<Double> list, double element) {
        list.addLast(element);
    }
}