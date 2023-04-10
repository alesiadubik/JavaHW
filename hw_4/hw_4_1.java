//Пусть дан LinkedList с несколькими элементами.
//Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class hw_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int number = sc.nextInt();
        System.out.printf("%s\n", reversList(randomList(number), number));
        sc.close();
    }
    public static LinkedList<Integer> randomList(Integer n) {
        LinkedList<Integer> array = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            array.add(rnd.nextInt(-10, 10));
        }
        System.out.println(array + "\n");
        return array;
    }

    public static Object reversList(LinkedList<Integer> array, Integer n) {
        LinkedList<Integer> newArray = new LinkedList<>();
        for (int j = 0; j < n; j++) {
            newArray.addLast(array.pollLast());
        }
        return newArray;
    }
}
