/*Вывести все простые числа от 1 до 1000
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hw_1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int n = sc.nextInt();
        sc.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            boolean primeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}
