package lr6.Timus.task_1910;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Подсказка для ввода количества секций
        System.out.println("Введите количество секций стены (n):");
        int n = scanner.nextInt();

        // Подсказка для ввода силы магических полей
        System.out.println("Введите силы магических полей для каждой секции через пробел:");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Инициализация переменных для скользящего окна
        int maxSum = 0;      // Максимальная сумма
        int maxIndex = 0;    // Индекс начала окна с максимальной суммой

        // Начальное окно
        for (int i = 0; i < 3; i++) {
            maxSum += a[i];
        }

        int currentSum = maxSum;

        // Перемещение окна
        for (int i = 3; i < n; i++) {
            currentSum = currentSum - a[i - 3] + a[i]; // Обновляем сумму, сдвигая окно
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxIndex = i - 2; // Индекс начала нового окна
            }
        }

        // Вывод результата
        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Номер средней из трёх секций (1-based): " + (maxIndex + 1));

        scanner.close();
    }
}