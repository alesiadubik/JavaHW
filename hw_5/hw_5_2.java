// 2. Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class hw_5_2 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String names = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] listNames = names.split(" ");
        for (int i = 0; i < listNames.length; i += 2) {
            if (nameMap.containsKey(listNames[i])) {
                nameMap.replace(listNames[i], nameMap.get(listNames[i]) + 1);
            } else {
                nameMap.put(listNames[i], 1);
            }
        }
        Map<String, Integer> sortedNames = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNames.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println(sortedNames);
    }
}