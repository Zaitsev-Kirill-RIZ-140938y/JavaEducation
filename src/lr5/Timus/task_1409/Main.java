package lr5.Timus.task_1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Подсказка для пользователя
        System.out.println("Введите количество банок, которые прострелили Гарри и Ларри:");

        // Ввод количества банок
        int harry = scanner.nextInt(); // Количество банок, простреленных Гарри
        int larry = scanner.nextInt(); // Количество банок, простреленных Ларри

        // Общее количество банок
        int totalBanks = harry + larry - 1;

        // Вычисление количества не простреленных банок для каждого
        int harryMissed = totalBanks - harry;
        int larryMissed = totalBanks - larry;

        // Вывод результата
        System.out.println(harryMissed + " " + larryMissed);
    }
}