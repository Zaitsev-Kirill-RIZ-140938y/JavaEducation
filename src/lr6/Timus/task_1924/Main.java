package lr6.Timus.task_1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Подсказка для пользователя
        System.out.println("Введите число n (1 ≤ n ≤ 50):");
        int n = scanner.nextInt();

        // Подсчёт суммы чисел от 1 до n
        int sum = n * (n + 1) / 2;

        // Проверка чётности суммы
        if (sum % 2 == 0) {
            System.out.println("black");
        } else {
            System.out.println("grimy");
        }

        scanner.close();
    }
}