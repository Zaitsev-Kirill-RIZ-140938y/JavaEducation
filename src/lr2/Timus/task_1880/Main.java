package lr2.Timus.task_1880;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Подсказки для пользователя
        System.out.println("Введите количество чисел и сами числа для первого участника:");
        int n1 = scanner.nextInt();
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set1.add(scanner.nextInt());
        }

        System.out.println("Введите количество чисел и сами числа для второго участника:");
        int n2 = scanner.nextInt();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n2; i++) {
            set2.add(scanner.nextInt());
        }

        System.out.println("Введите количество чисел и сами числа для третьего участника:");
        int n3 = scanner.nextInt();
        Set<Integer> set3 = new HashSet<>();
        for (int i = 0; i < n3; i++) {
            set3.add(scanner.nextInt());
        }

        // Находим пересечение трёх множеств
        set1.retainAll(set2); // Пересечение set1 и set2
        set1.retainAll(set3); // Пересечение с set3

        // Вывод результата
        System.out.println("Количество собственных чисел команды Psych Up: " + set1.size());
    }
}