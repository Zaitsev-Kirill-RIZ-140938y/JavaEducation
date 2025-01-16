package lr5.Timus.task_1785;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество монстров:");

        // Ввод количества монстров
        int n = scanner.nextInt();

        // Определение слова на языке аниндийльква
        String result;
        if (n >= 1 && n <= 4) {
            result = "few";
        } else if (n >= 5 && n <= 9) {
            result = "several";
        } else if (n >= 10 && n <= 19) {
            result = "pack";
        } else if (n >= 20 && n <= 49) {
            result = "lots";
        } else if (n >= 50 && n <= 99) {
            result = "horde";
        } else if (n >= 100 && n <= 249) {
            result = "throng";
        } else if (n >= 250 && n <= 499) {
            result = "swarm";
        } else if (n >= 500 && n <= 999) {
            result = "zounds";
        } else {
            result = "legion";
        }

        // Вывод результата
        System.out.println(result);
    }
}
