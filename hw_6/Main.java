package hw_6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<notebook>notebookList = new HashSet<>();
        notebookList.add(new notebook("Hp", "Black", 8, "Windows", 256));
        notebookList.add(new notebook("Samsung", "Silver", 8, "Windows", 512));
        notebookList.add(new notebook("Apple", "White", 16, "MacOs", 512));
        notebookList.add(new notebook("ASUS", "Blue", 32, "Linux", 2048));
        notebookList.add(new notebook("Samsung", "White", 16, "Windows", 1024));

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Критерий поиска:\n1 - Бренд\n2 - Цвет\n3 - ОЗУ\n4 - Операционная система\n5- Объем ЖД");
        int number = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите название критерия: ");
        String type = sc2.nextLine();

        if (number == 1) {
            for (notebook brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(type)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else if (number == 2) {
            for (notebook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(type)) {
                    System.out.println(color.printInfo());
                }
            }
        } else if (number == 3) {
            for (notebook ram : notebookList) {
                if (Integer.toString(ram.getRam()).equalsIgnoreCase(type)) {
                    System.out.println(ram.printInfo());
                }
            }
        } else if (number == 4) {
            for (notebook typeOS : notebookList) {
                if (typeOS.getTypeOS().equalsIgnoreCase(type)) {
                    System.out.println(typeOS.printInfo());
                }
            }
        } else if (number == 5) {
            for (notebook sizeDisk : notebookList) {
                if (Integer.toString(sizeDisk.getsizeDisk()).equalsIgnoreCase(type)) {
                    System.out.println(sizeDisk.printInfo());
                }
            }
        } else {
            System.out.println(
                    "Ошибка.\nВведите критерий поиска:\n1 - Бренд\n2 - Цвет\n3 - ОЗУ\n4 - Операционная система\n5- Объем ЖД");
        }
        sc1.close();
        sc2.close();
    }
}
