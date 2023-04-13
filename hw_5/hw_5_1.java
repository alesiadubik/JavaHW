// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class hw_5_1 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 123, bookPhone);
        addNumber("Petrov", 456, bookPhone);
        addNumber("Smirnov", 789, bookPhone);
        addNumber("Ivanov", 1234, bookPhone);
        addNumber("Petrov", 4567, bookPhone);
        addNumber("Smirnov", 7890, bookPhone);
        addNumber("Ivanov", 123000, bookPhone);
        addNumber("Smirnov", 7890000, bookPhone);
        addNumber("Ivanov", 123123123, bookPhone);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО для вывода \n");
        String name = scanner.next();
        scanner.close();
        System.out.printf("%s: %s \n", name, bookPhone.get(name));
        }

        public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
            if (map.containsKey(key)) {
                map.get(key).add(value);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
    
        }
}
