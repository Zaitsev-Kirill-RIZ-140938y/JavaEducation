package lr11.Timus.task_1607;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четыре числа (a b c d) через пробел: ");
        int a = scanner.nextInt(); // стартовая цена Пети
        int b = scanner.nextInt(); // надбавка Пети
        int c = scanner.nextInt(); // стартовая цена таксиста
        int d = scanner.nextInt(); // скидка таксиста

        int petya = a;
        int taxi = c;

        // Петя повышает, таксист понижает до встречи
        while (petya < taxi) {
            petya += b;
            if (petya >= taxi) {
                System.out.println(petya);
                return;
            }
            taxi -= d;
        }
        System.out.println(petya);
    }
}