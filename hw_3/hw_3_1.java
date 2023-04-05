//1. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class hw_3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        Random rndm = new Random();
        for (int i = 0; i < 10; i++) {
            int number = rndm.nextInt(-20, 20);
            myList.add(number);
        }
        System.out.printf("First List %s\n", myList);

        int n = 0;
        while (n < myList.size()) {
            if (myList.get(n) % 2 == 0) {
                myList.remove(n);
            } else {
                n++;
            }
        }
        System.out.printf("New List %s", myList);
    }
}
