package lr3.Timus.task_1293;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите N, A и B через пробел: ");
        int n = scanner.nextInt(); // Количество панелей
        int a = scanner.nextInt(); // Длина панели
        int b = scanner.nextInt(); // Ширина панели

        // Расчёт веса сульфида тория
        int totalWeight = n * a * b * 2;

        // Вывод результата
        System.out.println("Общий вес сульфида тория: " + totalWeight + " нанограммов");
    }
}