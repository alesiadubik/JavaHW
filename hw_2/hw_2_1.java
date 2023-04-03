// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.io.IOException;

public class hw_2_1 {
    public static void main(String[] args) {
        int[] array = { 8, 6, 4, 8, 5, 7, 4, 5 }; 
        int temp; 
        for (int i = 0; i < array.length - 1; i++) { 
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j + 1]) { 
                    temp = array[j]; 
                    array[j] = array[j + 1]; 
                    array[j + 1] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i] + ",");
        }
        System.out.println(sb);

        String str = String.valueOf(sb);
        try (FileWriter in = new FileWriter("Bubblesort.txt")) {
            in.append(str);
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}