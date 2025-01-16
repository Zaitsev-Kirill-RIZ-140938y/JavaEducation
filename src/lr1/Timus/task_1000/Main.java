package lr1.Timus.task_1000;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос первого числа
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        // Запрос второго числа
        System.out.print("Введите второе: ");
        int b = scanner.nextInt();

        // Вывод результата
        System.out.println("Результат суммы: " + (a + b));
    }
}