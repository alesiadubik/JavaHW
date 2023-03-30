/*Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120*/

import java.util.Scanner;
public class hw_1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = sc.nextInt();
        sc.close();
        System.out.printf("Треугольное число: %d\n", triangularNumber(n));
        
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;}
        System.out.printf("Факториал числа: %d\n", fact);
    }

    public static int triangularNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}