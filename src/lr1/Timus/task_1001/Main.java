package lr1.Timus.task_1001;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> numbers = new ArrayList<>();

        System.out.println("Введите числа (через пробел или на разных строках). Для завершения ввода нажмите Ctrl+D или введите пустую строку:");

        // Чтение чисел
        while (scanner.hasNextLong()) {
            numbers.add(scanner.nextLong());
        }

        // Разворачиваем список чисел
        Collections.reverse(numbers);

        System.out.println("\nРезультаты квадратных корней:");
        // Вывод квадратных корней с точностью до 4 знаков
        for (long num : numbers) {
            System.out.printf("%.4f\n", Math.sqrt(num));
        }
    }
}