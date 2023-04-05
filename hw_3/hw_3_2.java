// 2. Задан целочисленный список ArrayList. Найти минимальное,
// максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class hw_3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        Random rndm = new Random();
        for (int i = 0; i < 10; i++) {
            int number = rndm.nextInt(-20, 20);
            myList.add(number);
        }
        System.out.printf("My list %s\n", myList);
        
        int minNumber = myList.get(0);
        int maxNumber = myList.get(0);
        int summa = 0;
        for (int number : myList) {
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
            summa += number;
        }
        float average = (float) summa/myList.size();
        
        System.out.printf("Min number %s\n", minNumber);
        System.out.printf("Max number %s\n", maxNumber);
        //System.out.printf("Sum numbers %s\n", summa);
        System.out.printf("Average %s\n", average);
    }
}
