// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Scanner;

public class hw_4_2 {

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int n) {
        list.addLast(n);
        return list;
    }

    public static int dequeue(LinkedList<Integer> list) {
        return list.pollFirst();
    }

    public static int first(LinkedList<Integer> list) {
        return list.peekFirst();
    }
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            enqueue(myList, i);
        }
        System.out.println(myList);

        System.out.print("Введите новый элемент для списка: ");
        int number = sc.nextInt();
        System.out.println(enqueue(myList, number));
        System.out.println();
        sc.close();


        System.out.println(dequeue(myList));
        System.out.println(myList);
        System.out.println();


        System.out.println(first(myList));
        System.out.println(myList);
        System.out.println();
    }
}
